package com.LogicalArray;

public class Average {
	public static void main(String[] args) {
		 int a[] = {21,32,32,65,24,84,24,65,75};
		 int result =0;
		 for (int i = 0; i < a.length; i++) {
			 result += a[i];
			 
		}
		 System.out.println("sum of array :"+result);
		 System.out.println(" average "+ result/a.length);
	}

}
