package com.map;

import java.util.Random;

public class GenMap {
	public Map map = new Map();
	
	public int[] generateMap() {
		int[] map2 = new int[map.x * map.y];
		Random rand = new Random();
		
		int[] cx = new int[map.x];
		int[] cy = new int[map.y];
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
		boolean result = false;
		
		for(int i = 0; i < arrayx.length; i++) {
			//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		}
		
		return result;
	}
}
