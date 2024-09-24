package com.LogicalArray;

import java.util.Scanner;

public class Arrayreverse {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter element in the array");
		int n = sc.nextInt();
		int [] a=new int[n];

			
		System.out.print("Enter "+n +"Elements  ");
		for (int i = 0; i <n; i++) {
			
			
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < n; i++,n--) {
			int tmp = a[i];
			a[i]= a[n-1];
			a[n-1]=tmp;
			
		}
		System.out.println("reverse array is");
		

		for (int i = 0; i < a.length; i++) {
			
		
			
			
			System.out.print(a[i]+" ");
		}
	}
}