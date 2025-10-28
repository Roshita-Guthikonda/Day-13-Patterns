package com.codegnan.patterns;

public class Pattern_1 {

	public static void main(String[] args) {
		int rows=5,cols=5;
		//outer for loop for rows
		for(int i=0;i<rows;i++) {
			//inner for loop for columns
			for(int j=0;j<cols;j++) {//print the columns for * 
				System.out.print("* ");
			}
			System.out.println();//move to next row
		}
		System.out.println();
		
		for(int i=1;i<=rows;i++) {
			//inner for loop for columns
			for(int j=1;j<=cols;j++) { 
				System.out.print(i +" ");
			}
			System.out.println();//move to next row
		}
		System.out.println();
		for(int i=1;i<=rows;i++) {
			//inner for loop for columns
			for(int j=1;j<=cols;j++) { 
				System.out.print((6-i)+" ");
			}
			System.out.println();//move to next row
		}
		System.out.println();
		
		for(int i=1;i<=rows;i++) {
			//inner for loop for columns
			for(int j=1;j<=cols;j++) { 
				System.out.print(j +" ");
			}
			System.out.println();//move to next row
		}
		System.out.println();
		
		for(int i=1;i<=rows;i++) {
			//inner for loop for columns
			for(int j=1;j<=cols;j++) { 
				System.out.print((6-j)+" ");
			}
			System.out.println();//move to next row
		}
		System.out.println();
		
		for(int i=1;i<=rows;i++) {
			//inner for loop for columns
			for(int j=1;j<=cols;j++) { 
				System.out.print((char)(96+i)+" ");
			}
			System.out.println();//move to next row
		}
		System.out.println();
		
		for(int i=1;i<=rows;i++) {
			//inner for loop for columns
			for(int j=1;j<=cols;j++) { 
				System.out.print((char)(96+j)+" ");
			}
			System.out.println();//move to next row
		}
		System.out.println();
		
		//outer for loop for rows
		for(int i=1;i<=rows;i++) {
			//inner for loop for columns
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();//move to next row
		}
		System.out.println();
		

		//outer for loop for row
		for(int i=0;i<rows;i++) {
			//inner for loop for columns
			for(int j=0;j<rows-i;j++) { //or (int j=5;j>=i;j--)
				System.out.print("* ");
			}
			System.out.println();//move to next row
		}
		System.out.println();
	}

}
