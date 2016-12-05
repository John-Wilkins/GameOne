package com.map;

public class Map
{
	//x is the horizontal resolution of the map (km)
	//y is the vertical resolution of the map (km)
	//map is the map array
	public final int x = 20000;
	public final int y = 10000;
	public int[] map = new int[x * y];

	
	//xo is the x dimension of each outer box
	//yo is the y dimension of each outer box
	public final int xo = 10;
	public final int yo = 10;
	public final int cells = x / xo * y / yo;
	public final int xcells = x / xo;
	public final int ycells = y / yo;
	
	public int[] randx = new int[cells];
	public int[] randy = new int[cells];
	
	public int[] nodes = new int[cells];

	//xb is the dimension of the buffer on the x side
	//yb is the dimension of the buffer on the y side
	public final int xb = 2;
	public final int yb = 2;
	
	//xi is the x dimension of each inner box
	//yi is the y dimension of each inner box
	public final int xi = xo - 2 * xb;
	public final int yi = yo - 2 * yb;
	
	//bl is the number of random bits generated for land seeds
	//bo is the number of random bits generated for ocean seeds
	public final int bl = 5;
	public final int bo = 5;
	
	//t is the number of traits (including land/ocean) in Array 2
	public final int t = 10;
	//This is the array of traits, we need to define the traits in the meeting
	Object [] traits = new Object[cells];
	
	public int whichCell(int p) {
		//c is initialized to -2 for the sake of debugging
		//int c = -2;
		
		//int yc = (int) Math.ceil(yDim(p) / yo);
		//int xc = (int) Math.ceil(xDim(p) / xo);
		
		return (int) (Math.ceil(yDim(p) / yo) * xcells + Math.ceil(xDim(p) / xo));
	}
	
	//Map value
	public int mVal(int[] map, int xdim, int ydim) {
		int val = map[x * ydim + xdim];
		
		return val;
	}
	
	public void setMVal(int[] map, int xdim, int ydim, int newVal) {
		map[x * ydim + xdim] = newVal;
	}
	
	//Outer box value
	public int oVal(int[] map, int xcell, int ycell, int xdim, int ydim) {
		//val is initialized to -2 for the sake of debugging
		//int val = -2;
		
		//This is the box's origin
		int orig = x * yo * ycell + xo * xcell;
		
		int val = map[orig + x * ydim + xdim];
		
		return val;
	}
	
	public void setOVal(int[] map, int xcell, int ycell, int xdim, int ydim, int newVal) {
		//This is the box's origin
		int orig = x * yo * ycell + xo * xcell;
		
		map[orig + x * ydim + xdim] = newVal;
	}
	
	//Inner box value
	public int iVal(int[] map, int xcell, int ycell, int xdim, int ydim) {
		//val is initialized to -2 for the sake of debugging
		//int val = -2;
		
		//This is the inner box's origin
		int orig = x * yo * ycell + xo * xcell + x * yb + xb;
		
		int val = map[orig + x * ydim + xdim];
		
		return val;
	}
	
	public void setIVal(int[] map, int xcell, int ycell, int xdim, int ydim, int newVal) {
		//val is initialized to -2 for the sake of debugging
		//int val = -2;
		
		//This is the inner box's origin
		int orig = x * yo * ycell + xo * xcell + x * yb + xb;
		
		map[orig + x * ydim + xdim] = newVal;
	}
	
	public int iToP(int[] map, int xcell, int ycell, int xdim, int ydim) {
		//val is initialized to -2 for the sake of debugging
		//int val = -2;
		
		//This is the inner box's origin
		int orig = x * yo * ycell + xo * xcell + x * yb + xb;
		
		int p = orig + x * ydim + xdim;
		return p;
	}
	
	public int iToP(int[] map, int cell, int xdim, int ydim) {
		//val is initialized to -2 for the sake of debugging
		//int val = -2;
		
		//This is the inner box's origin
		int orig = cToP(cell) + x * yb + xb;
		
		int p = orig + x * ydim + xdim;
		return p;
	}
	
	public void setIVal(int[] map, int cell, int xdim, int ydim, int newVal) {
		//val is initialized to -2 for the sake of debugging
		//int val = -2;
		
		//This is the inner box's origin
		int orig = cToP(cell) + x * yb + xb;
		
		map[orig + x * ydim + xdim] = newVal;
	}
	
	public int xDim(int p) {
		return p % x;
	}
	
	public int yDim(int p) {
		return (int) Math.floor(p / x);
	}
	
	public int xCell(int c) {
		return c % xcells;
	}
	
	public int yCell(int c) {
		return (int) Math.floor(c / xcells);
	}
	
	//returns the origin of that number cell
	public int cToP(int c) {
		return (int) Math.floor(c / xcells) * x * yo + (c % xcells) * xo;
	}
}
