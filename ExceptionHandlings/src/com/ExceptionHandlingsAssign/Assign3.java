package com.ExceptionHandlingsAssign;

//3. WAP to catch multiple exceptions. i.e ArrayIndexOutOfBoundsException and ArithmeticException 
public class Assign3 {

	public static void main(String[] args) {
		int arr[] = { 23,45,13,12,34 };
		int len  = arr.length;
		int a = 10,b =0;
		try
		{
			int div = a / b;
			for(int i = 0; i <= len; i++)
			{
				System.out.println(arr[i]);
			}
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		catch(ArrayIndexOutOfBoundsException o)
		{
			System.out.println("Mesage" + o.getMessage());
		}

	}

}
