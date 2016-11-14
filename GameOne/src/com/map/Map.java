package com.map;

public class Map
{
	//x is the horizontal resolution of the map (km)
	//y is the vertical resolution of the map (km)
	//map is the map array
	public final int x = 40000;
	public final int y = 20000;
	public int[] map = new int[x * y];
	
	//bl is the number of random bits generated for land seeds
	//bo is the number of random bits generated for ocean seeds
	public final int bl = 5;
	public final int bo = 5;
	
	//t is the number of traits (including land/ocean) in Array 2
	public final int t = 10;
}
