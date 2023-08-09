package com.exceptionHandlings;

public class ArithematicExcepInMethod {

	public static void divide()
	{
		int a = 10;
		int b = 0;
		
		try
		{
			int div = a / b;
			System.out.println("Dividion : " + div);
		}
		catch(ArithmeticException e)
		{
			//System.out.println(e.getMessage());
			e.printStackTrace();
			//System.out.println("--------");
		}
	}
	public static void main(String[] args) {
		System.out.println("main method");
		divide();
		System.out.println("End");

	}

}
