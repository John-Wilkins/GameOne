package com.map;

import java.util.Random;

public class GenMap {
	private static Map map = new Map();
	private static Random rand = new Random();
	//Testing Push - Evan
	public static void main(String[] args) {
		//System.out.println(map.iVal(map.map, 1, 1, 1, 1));
		generateMap();
	}
	
	//Operates directly on map.map
	public static void generateMap() {
		long startTime = System.nanoTime();
		
		for(int i = 0; i < map.map.length; i++) {
			map.map[i] = -1;
		}
		
		//int[] randx = new int[map.cells];
		//int[] randy = new int[map.cells];
		
		for(int i = 0; i < map.cells; i++) {
			map.randx[i] = rand.nextInt(map.xi);
			map.randy[i] = rand.nextInt(map.yi);
			
			map.setIVal(map.map, i, map.randx[i], map.randy[i], i);
			map.nodes[i] = map.iToP(map.map, i, map.randx[i], map.randy[i]);
		}
		
		long endTime = System.nanoTime();
		double netTime = (endTime - startTime) / Math.pow(10, 9);
		System.out.println(netTime + " seconds");
		
//		for(int i = 0; i < map.map.length; i++) {
//			System.out.println(map.whichCell(i));
//		}
		
		//printMap();
	}
	
	public int manDist(int p1, int p2) {
		return Math.abs(map.xDim(p1) - map.xDim(p2)) + Math.abs(map.yDim(p1) - map.yDim(p2));
	}
	
	@SuppressWarnings("unused")
	private static void printMap() {
		for(int i = 0; i < map.x; i++) {
			System.out.println();
			for(int j = 0; j < map.y; j++) {
				System.out.print(map.map[i * map.x + j] + "	");
			}
		}
	}
}
