package com.map;

public class Map {
	//x is the horizontal resolution of the map
	//y is the vertical resolution of the map
	//map is the map array
	public final int x = 100;
	public final int y = 100;
	public int[] map = new int[x * y];
	
	//r is the minimum radius between points
	//n is the number of nodes
	public final int r = 3;
	public final int n = 20;
	
	//bl is the number of random bits generated for land seeds
	//bo is the number of random bits generated for ocean seeds
	public final int bl = 5;
	public final int bo = 5;
	
	//t is the number of traits (including land/ocean) in Array 2
	public final int t = 10;
}
