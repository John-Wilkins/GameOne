package com.controls;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class InputListener implements KeyListener, MouseListener, MouseMotionListener, MouseWheelListener
{
	public void keyPressed(KeyEvent event)
	{
		System.out.println("Key Pressed");
	}

	public void keyReleased(KeyEvent event)
	{
		System.out.println("Key Released");
	}

	public void keyTyped(KeyEvent event)
	{
		System.out.println("Key Typed");
		System.out.println(event.getKeyChar());
	}
	
	public void mouseClicked(MouseEvent event)
	{
		System.out.println("Mouse Clicked");
	}

	public void mouseEntered(MouseEvent event)
	{
		System.out.println("Mouse Entered");
	}

	public void mouseExited(MouseEvent event)
	{
		System.out.println("Mouse Exited");
	}

	public void mousePressed(MouseEvent event)
	{
		System.out.println("Mouse Pressed");
	}

	public void mouseReleased(MouseEvent event)
	{
		System.out.println("Mouse Released");
	}

	public void mouseDragged(MouseEvent event)
	{
		System.out.println("Mouse Dragged");
	}

	public void mouseMoved(MouseEvent event)
	{
		System.out.println("Mouse Moved");
		System.out.println(event.getX() + ", " + event.getY());
	}

	public void mouseWheelMoved(MouseWheelEvent event)
	{
		System.out.println("Mouse Wheel Moved");
	}
}