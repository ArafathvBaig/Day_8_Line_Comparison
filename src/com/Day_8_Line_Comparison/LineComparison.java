package com.Day_8_Line_Comparison;

import java.util.Scanner;

public class LineComparison
{
	public double x1, x2, x3, x4, y1, y2, y3, y4, length1, length2;
	public void length()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x1: ");
		x1 = sc.nextDouble();
		System.out.println("Enter the value of x2: ");
		x2 = sc.nextDouble();
		System.out.println("Enter the value of x3: ");
		x3 = sc.nextDouble();
		System.out.println("Enter the value of x4: ");
		x4 = sc.nextDouble();
		System.out.println("Enter the value of y1: ");
		y1 = sc.nextDouble();
		System.out.println("Enter the value of y2: ");
		y2 = sc.nextDouble();
		System.out.println("Enter the value of y3: ");
		y3 = sc.nextDouble();
		System.out.println("Enter the value of y4: ");
		y4 = sc.nextDouble();

		length1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("The length of (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is:");
		System.out.println(+length1);

		length2 = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
		System.out.println("The length of (" + x3 + ", " + y3 + ") and (" + x4 + ", " + y4 + ") is:");
		System.out.println(+length2);
	}
	public void limitations()
	{
		length();
		int c= Double.compare(length1, length2);
	    if (c==0)
	    {
            System.out.println("Length1 and Length2 are Equal");
        }
	    else if(c==1)
	    {
	    	System.out.println("Length1 is Greater Than Length2");
	    }
	    else 
	    {
            System.out.println("Length1 is Less Than Length2");
	    }
	}
	public static void main(String[] args) 
	{
		LineComparison obj1=new LineComparison();
		obj1.limitations();
	}
}
