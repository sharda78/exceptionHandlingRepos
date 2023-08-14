package com.ExceptionHandlingsAssign;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SingalDimArrayWithExcepHandling {

	public static void main(String[] args) {
		int num[] = new int[4];
		Scanner sc= new Scanner(System.in);
		
		try
		{
			for(int i = 0; i < num.length; i++)
			{
			System.out.println("Enter element");
			num[i] = sc.nextInt();
			}
		}
		catch(InputMismatchException |ArrayIndexOutOfBoundsException o)
		{
			System.out.println(o.getMessage());
		}
		
		System.out.println("\n-------Array--------");
		for(int a : num)
		{
			System.out.print(a + " ");
		}
		
		System.out.println("\n------After Sorting Array----------");
		int temp =  0;
		for(int  i = 0; i < num.length; i++)
		{
			for(int j = 0; j < num.length-1; j++)
			{
				if(num[j] > num[j+1])
				  temp = num[j];
				num[j] = num[j+1];
				num[j+1] = temp;
			}
		}
		
		for(int x : num)
		{
			System.out.print(x + " ");
		}
		

	}

}
