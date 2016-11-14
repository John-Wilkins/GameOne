package com.graphics;

import javax.swing.JFrame;

public class Window extends JFrame
{
	private int x = 640;
	private int y = 360;
	
	public Window()
	{
		super("");
		this.setSize(x, y);
		this.setUndecorated(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}