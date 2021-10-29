package com.Day_8_Line_Comparison;

import java.util.Scanner;

public class LineComparison 
{
	public static void main(String[] args) 
	{
		double x1, x2, y1, y2, length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x1: ");
		x1 = sc.nextDouble();
		System.out.println("Enter the value of x2: ");
		x2 = sc.nextDouble();
		System.out.println("Enter the value of y1: ");
		y1 = sc.nextDouble();
		System.out.println("Enter the value of y2: ");
		y2 = sc.nextDouble();
		length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("The length of (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is:");
		System.out.println(+length);
	}
}
