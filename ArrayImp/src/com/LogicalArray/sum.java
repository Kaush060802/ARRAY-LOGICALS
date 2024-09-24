package com.LogicalArray;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n =sc.nextInt();
		int arr[]= new int[n];
		int result=0;
		for (int i = 0; i < n; i++) {
			 result +=arr[i];
		
		}
		System.out.println("Avg of array is :"+result/arr.length);
		System.out.println("sum of array is :"+result);
	}

}
