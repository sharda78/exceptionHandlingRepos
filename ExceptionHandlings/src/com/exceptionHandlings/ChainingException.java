package com.exceptionHandlings;

import java.io.IOException;

public class ChainingException {
	public static void divide(int a,int b)
	{
		try
		{
			int div = a / b;
			System.out.println(div);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			ArithmeticException ax = new ArithmeticException();
			ax.initCause(new IOException("dividing no by zero,plz do not enter zero"));
			//e.initCause(new IOException("dividing no by zero,plz do not enter zero"));
			throw ax;
			//throw e;
		}
	}

	public static void main(String[] args) 
	{
		int x = 10;
		int y = 0;
		
		try
		{
			divide(x,y);
		}
		catch(ArithmeticException o)
		{
			System.out.print(o.getCause());
		}
		

	}

}
