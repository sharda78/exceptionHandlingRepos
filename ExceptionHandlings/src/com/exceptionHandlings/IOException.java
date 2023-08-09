package com.exceptionHandlings;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IOException {

	public static void main(String[] args) {
	int[]num  =new int[5];
	int len  = num.length;
	
	Scanner sc  = new Scanner(System.in);
	// if exception is raised ,only one catch block is excuted
	try
	{
		for(int i = 0; i < len; i++)
		{
			System.out.println("Enter element");
			num[i] = sc.nextInt();
		}
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e.getMessage());
	}
	catch(InputMismatchException i)
	{
		System.out.println("input mismatch exception");
		//System.out.println(i.getMessage());
	}
	
	System.out.println("----------Array-----------");
	for(int j = 0; j < len; j++)
	{
		System.out.println(num[j]);
	}
	}

}
