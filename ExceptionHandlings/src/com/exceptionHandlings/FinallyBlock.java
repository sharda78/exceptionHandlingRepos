package com.exceptionHandlings;
// if we write cleaning code soo we can go for finally block
// finally block contain crusial statements which are excuted at any situation
// order is try-catch-finally
public class FinallyBlock {
	public static void finallyblock1()
	{
		int a = 10;
		int b = 2;
		try
		{
			int div = a / b;
			System.out.println(div);
		}
		finally
		{
			System.out.println("Always Excute");
		}
		System.out.println("End");
	}
	public static void finallyblock2()
	{
		int a = 10;
		int b = 0;
		try
		{
			int div = a / b;
			System.out.println(div);
		}
		catch(ArithmeticException o)
		{
			//System.out.println(10/0); // occour exception
			System.out.println(o.getMessage());
			try // we can write try-catch in catch block
			{
				
			}
			catch(Exception e)
			{
				
			}
		}
		finally
		{
			System.out.println("Always Excute");
		}
		System.out.println("End");
	}

	public static void main(String[] args) {
		System.out.println("-------- Try-Finally -----------");
		finallyblock1();
		System.out.println("--------- Try-Catch-Finally ------------");
		finallyblock2();
		

	}

}
