package com.exceptionHandlings;

public class NestedTryCatch {

	public static void main(String[] args) {
		String name = null;
		int num[] = { 4,5,6 };
		int a =10;
		int b = 0;
		
		try
		{
			//try-catch block 1
			try
			{
				System.out.println(a/b);
			}
			catch(ArithmeticException e)
			{
				System.out.println(e.getMessage());
			}
			
			//try-catch block 2
			try 
			{
				System.out.println(name.length());
			}
			catch(NullPointerException n)
			{
				System.out.println();
			}
			
			// try-catch block 3
			try
			{
				System.out.println(num[6]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(10/0);
			}
		}
		catch()
		{
			System.out.println();
		}
		

	}

}
