package com.LogicalArray;

import java.util.Arrays;

public class merge {
	public static void main(String[] args) {
		int []a= {10,20,30,40,50};
		int [] b= {101,102,301,402};
		int merge [] = new  int [a.length+b.length];
		for (int i = 0; i <a.length; i++) {
			merge[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) {
			merge[i+ a.length]= b[i];
			
		}
		System.out.println(Arrays.toString(merge));
		
		
		
			
		
		
	}

}
