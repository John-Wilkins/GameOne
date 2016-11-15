package com.graphics;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

import com.controls.InputListener;

@SuppressWarnings("serial")
public class Window extends JFrame
{
	private int x, y;
	private Dimension s;
	private int[] screen;
	private Canvas canvas;
	private InputListener input;
	
	public Window(int x, int y)
	{
		super("");
		this.x = x;
		this.y = y;
		
		canvas = new Canvas();
		screen = new int[this.x*this.y];
		s = new Dimension(this.x, this.y);
		input = new InputListener();
		
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
	}
}