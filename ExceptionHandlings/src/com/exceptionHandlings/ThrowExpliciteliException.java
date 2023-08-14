package com.exceptionHandlings;

public class ThrowExpliciteliException
{
	public static void checkage(int age)
	{
		if(age < 35)
		{
			//explicitily throw excep
			//throw allow only one excep at a time
			throw new ArithmeticException("Candidate is not eligible");
			
		}
		else
		{
			System.out.println("pleasde fill the form details");
		}
	}

	public static void main(String[] args) {
		//ThrowExpliciteliException e = new ThrowExpliciteliException();
		try {
		checkage(23);
		//checkage(55); // pleasde fill the form details
		}
		catch(ArithmeticException o)
		{
			System.out.println(" Message : "  + o.getMessage());
		}

	}

}
