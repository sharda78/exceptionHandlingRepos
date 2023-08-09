package com.exceptionHandlings;

public class ArrayIndexOutOfBoundExceptions {

	public static void main(String[] args) {
		int []num = {34,56,32,55,77,32,12};
		
		int len  = num.length , i;
		
		try
		{
			for(i = 0; i <= len; i++)
				System.out.println(num[i]);
		}
		catch(ArrayIndexOutOfBoundsException o)
		{
			System.out.println("please check array index value");
			System.out.println(o); // name and message
			System.out.println("Message: " + o.getMessage());
			System.out.println("Class: " + o.getClass());
			o.printStackTrace(); //gives exception name,excep describtion,excep line no
			
		}
			System.out.println("End");
		}

}
