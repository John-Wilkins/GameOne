package com.map;

public class Map {
	//x is the horizontal resolution of the map
	//y is the vertical resolution of the map
	//map is the map array
	public static final int x = 100;
	public static final int y = 100;
	public int[] map = new int[x * y];
	
	//bl is the number of random bits generated for land seeds
	//bo is the number of random bits generated for ocean seeds
	public static final int bl = 5;
	public static final int bo = 5;
	
	//t is the number of traits (including land/ocean) in Array 2
	public static final int t = 10;
}
