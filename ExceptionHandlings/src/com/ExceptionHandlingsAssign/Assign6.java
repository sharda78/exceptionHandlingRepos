package com.ExceptionHandlingsAssign;

import java.util.InputMismatchException;
import java.util.Scanner;

// 6. WAP to show unchecked exception 
public class Assign6 
{
	public static void arrayindexoutofboundexcep()
	{
		int arr[] = { 23,45,67,22,66,78,34};
		int len = arr.length;
		
		try
		{
			for(int  i = 0; i <= len; i++)
			{
		
				System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException  o)
		{
			o.printStackTrace();
	
		}
	}
	
	public static void arithmeticExceptions()
	{
		try
		{
				int a = 10/0;
				System.out.println(a);
			
		}
		catch( ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Message" + e.getMessage());
		}
	}
	public static void inputNotFoundExcep()
	{
		int num[] = new int[5];
		int len = num.length;
		
		try
		{
			Scanner sc = new Scanner(System.in);
			for(int  i = 0; i < len; i++)
			{
			System.out.println("Enter element");
			num[i] = sc.nextInt();
			}
		}
		catch(InputMismatchException exp)
		{
			exp.printStackTrace();
			System.out.println("Message" + exp.getMessage());
		}
	}

	public static void main(String[] args) {
		System.out.println("----------Unchecked Exceptions--------------");
		System.out.println("\n---------ArrayIndexOutOfBoundsException------------");
		arrayindexoutofboundexcep();
		System.out.println("\n--------------ArithmeticException---------------");
		arithmeticExceptions();
		System.out.println("\n------------InputMismatchException--------------");
		inputNotFoundExcep();

	}

}
