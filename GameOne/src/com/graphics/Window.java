package com.graphics;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import com.controls.InputListener;

@SuppressWarnings("serial")
public class Window extends JFrame
{
	private int type;
	private int x, y;
	private Graphics g;
	private BufferStrategy bs;
	private BufferedImage image;
	private Dimension s;
	private Canvas canvas;
	private InputListener input;

	public Window(int x, int y, int type)
	{
		super("");
		this.x = x;
		this.y = y;
		this.type = type;

		canvas = new Canvas();
		s = new Dimension(this.x, this.y);
		input = new InputListener();
		image = new BufferedImage(x, y, BufferedImage.TYPE_INT_RGB);

		canvas.setPreferredSize(s);
		canvas.setMaximumSize(s);
		canvas.setPreferredSize(s);
		canvas.setFocusable(true);
		canvas.addKeyListener(input);
		canvas.addMouseListener(input);
		canvas.addMouseMotionListener(input);
		canvas.addMouseWheelListener(input);

		this.setSize(this.x, this.y);
		this.add(canvas, BorderLayout.CENTER);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

		canvas.createBufferStrategy(4);
		bs = canvas.getBufferStrategy();
		g = bs.getDrawGraphics();

		gameLoop();
		this.setVisible(false);
		if(this.type == 0)
			new Window(this.x, this.y, 1);
		this.dispose();
	}

	public void gameLoop()
	{
		long frameStart = 1;
		long frameEnd = 2;
		int i = 0;

		while(true)
		{
			frameStart = System.currentTimeMillis();
			render();
			frameEnd = System.currentTimeMillis();

			//Framerate Calc
			if(i == 50)
			{
				System.out.println(1000/((frameEnd-frameStart)));
				i = 0;
			}
			i++;
		}
	}

	public void render()
	{
		int randColor = (int)(Math.random()*Integer.MAX_VALUE);
		for(int x = 0; x < this.x; x++)
			for(int y = 0; y < this.y; y++)
				image.setRGB(x, y, randColor);
		
		g = bs.getDrawGraphics();
		g.drawImage(image, 0, 0, canvas.getWidth(), canvas.getHeight(), null);
		g.dispose();
		bs.show();
	}
}