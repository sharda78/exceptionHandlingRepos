package com.ExceptionHandlingsAssign;

// . WAP to show 3 different scenario in which null pointer exceptions generated, and handle that exception. 

public class Assign9 
{
	public static void first()
	{
		String str = null;
		
		try
		{
			if(str.equals("hello"))
			{
				System.out.println("Same");
			}
		}
		catch(StringIndexOutOfBoundsException s)
		{
			System.out.println(s.getMessage());
		}
	}
	
	public static void Second()
	{
		try
		{
		
		}
		catch(Exception e)
		{
			
			
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("-----First Sc");
		first();

	}

}
