package com.LogicalArray;

public class Array3d {
	
		public static void main(String[] args) {
			
			byte[][][] space = new byte[3][3][3];
			space[0][0][0] = 10;
			space[1][1][1] = 20; // Middle of the cube.
			space[2][2][2] = 30;
			// Display points in our space-cube.
			System.out.println(space[0][0][0]);
			System.out.println(space[1][1][1]);
			System.out.println(space[2][2][2]);
			
			
			int[][] values = { { 1, 2 }, { 3, 4 } };
			System.out.println(values[0][0]);
			System.out.println(values[1][0]);
			System.out.println(values[0][1]);
			System.out.println(values[1][1]);
		}
	}

