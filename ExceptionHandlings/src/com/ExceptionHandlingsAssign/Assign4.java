package com.ExceptionHandlingsAssign;

import java.util.InputMismatchException;
import java.util.Scanner;

//. WAP to show checked exception and use multiple catch block with universal Exception handler.(parent class) 
public class Assign4 {

	public static void main(String[] args) {
		
	
			int[]num  = { 23,4,4,24,23,23};
			int len  = num.length;
			
			Scanner sc  = new Scanner(System.in);
			// if exception is raised ,only one catch block is excuted
			try
			{
				for(int i = 0; i <= len; i++)
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
				System.out.println(i.getMessage());
			}
			catch(Exception o)
			{
				System.out.println(o.getMessage());
			}

	}
}


