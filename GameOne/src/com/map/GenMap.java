package com.map;

import java.util.Random;

public class GenMap {
	private static Map map = new Map();
	private static Random rand = new Random();
	
	public static void main(String[] args) {
		//System.out.println(map.iVal(map.map, 1, 1, 1, 1));
		generateMap();
	}
	
	//Operates directly on map.map
	public static void generateMap() {
		for(int i = 0; i < map.map.length; i++) {
			map.map[i] = -1;
		}
		
		//int[] randx = new int[map.cells];
		//int[] randy = new int[map.cells];
		
		for(int i = 0; i < map.cells; i++) {
			int randx = rand.nextInt(map.xi);
			int randy = rand.nextInt(map.yi);
			
			map.setIVal(map.map, i, randx, randy, i);
		}
		
		printMap();
	}
	
	public int manDist(int p1, int p2) {
		return Math.abs(map.xDim(p1) - map.xDim(p2)) + Math.abs(map.yDim(p1) - map.yDim(p2));
	}
	
	private static void printMap() {
		for(int i = 0; i < map.x; i++) {
			System.out.println();
			for(int j = 0; j < map.y; j++) {
				System.out.print(map.map[i * map.x + j] + " ");
			}
		}
	}
}
