package com.graphics;

import java.awt.Canvas;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import com.controls.InputListener;

@SuppressWarnings("serial")
public class Window extends JFrame
{
	private int x, y;
	private Canvas canvas = new Canvas();
	private InputListener input = new InputListener();
	
	public Window(int x, int y)
	{
		super("");
		this.x = x;
		this.y = y;
		canvas.setFocusable(true);
		canvas.addKeyListener(input);
		canvas.addMouseListener(input);
		canvas.addMouseMotionListener(input);
		canvas.addMouseWheelListener(input);
		canvas.createBufferStrategy(4);
//		canvas.add(new BufferedImage(x, y, BufferedImage.TYPE_INT_RGB));
		this.setSize(x, y);
		this.add(canvas);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}