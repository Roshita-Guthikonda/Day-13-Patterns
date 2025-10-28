package com.codegnan.patterns;

public class Pattern_2 {

	public static void main(String[] args) {
		int rows=5;
		for(int i=rows;i>0;i--) {
			//inner for loop for columns
			for(int j=rows;j>i;j--) { //or (int j=5;j>=i;j--)
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();//move to next row
		}
		for(int i=1;i<=rows;i++) {
			//inner for loop for columns
			for(int j=1;j<=i;j++) {
				System.out.print((char)(96+i)+" ");
			}
			System.out.println();//move to next row
		}
		System.out.println();
		
		for(int i=1;i<=rows;i++) {
			//inner for loop for columns
			for(int j=1;j<=i;j++) {
				System.out.print((char)(96+j)+" ");
			}
			System.out.println();//move to next row
		}
		System.out.println();
		
		for(int i=1;i<=rows;i++) {
			//inner for loop for columns
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();//move to next row
		}
		System.out.println();
		
		for(int i=1;i<=rows;i++) {
			//inner for loop for columns
			for(int j=1;j<=i;j++) {
				System.out.print((6-i)+" ");
			}
			System.out.println();//move to next row
		}
		System.out.println();
		
		for(int i=1;i<=rows;i++) {
			//inner for loop for columns
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();//move to next row
		}
		System.out.println();
		
		for(int i=1;i<=rows;i++) {
			//inner for loop for columns
			for(int j=1;j<=i;j++) {
				System.out.print((6-j)+" ");
			}
			System.out.println();//move to next row
		}
		System.out.println();
	}


}
