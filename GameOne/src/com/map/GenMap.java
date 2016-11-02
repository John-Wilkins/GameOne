package com.map;

import java.util.Random;

public class GenMap {
	public Map map = new Map();
	
	public int[] generateMap() {
		int[] map2 = new int[map.x * map.y];
		for(int i = 0; i < map2.length; i++) map2[i] = -1;
		Random rand = new Random();
		
		int[] cx = new int[map.n];
		int[] cy = new int[map.n];
		for(int i = 0; i < map.n; i++) {
			boolean run = true;
			int random = 0;
			int random2 = 0;
			while(run) {
				random = rand.nextInt(map.x);
				random2 = rand.nextInt(map.y);
				if(valid(random, cx, random2, cy)) run = false;
			}
			cx[i] = random;
			cy[i] = random2;
		}
		
		map2 = fillMap(cx, cy);
		
		int sl = genSl(rand);
		int so = genSo(rand);
		
		return map2;
	}
	
	public int genSl(Random rand) {
		int sl = 0;
		for(int i = 0; i < map.bl; i++) sl += rand.nextInt(2);
		return sl;
	}
	
	public int genSo(Random rand) {
		int so = 0;
		for(int i = 0; i < map.bo; i++) so += rand.nextInt(2);
		return so;
	}
	
	public boolean valid(int valx, int[] arrayx, int valy, int[] arrayy) {
		boolean result = true;
		
		for(int i = 0; i < arrayx.length; i++) {
			int dist = manDist(valx, valy, arrayx[i], arrayy[i]);
			if(dist < map.r) result = false;
		}
		
		return result;
	}
	
	public int manDist(int valx1, int valy1, int valx2, int valy2) {
		int dist = 0;
		dist = Math.abs(valx1 - valx2) + Math.abs(valy1 - valy2);
		return dist;
	}
	
	public int[] fillMap(int[] arrayx, int[] arrayy) {
		int[] map3 = new int[map.x * map.y];
		
		int count = arrayx.length;
		while(count < map.x * map.y) {
			//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		}
		
		return map3;
	}
}
