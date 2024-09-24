package com.LogicalArray;

public class AddArray {
public static void main(String[] args) {
	int a[] [] = {{1,2,3,4},{7,8,9,6}};
	int b[] [] = {{1,2,3,5},{7,8,9,6}};
	 int c[] []= new int [2][4];
	 for (int i = 0; i < 2; i++) {
		 for (int j = 0; j <4; j++) {
			 c[i] [j]= a[i][j]+ b[i][j];
			 System.out.println( c[i] [j]+" ");
			
		}
		
	}
}
}
