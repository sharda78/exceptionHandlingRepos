package com.exceptionHandlings;
//jvm is default excep handler
public class ArithematicException {

	public static void main(String[] args) {
		
		System.out.println("start");
		int a =10;
		int b = 0;   //if any no is divided by zero
		try
		{
			int div = a/b; //excep occour
			System.out.println("DIvision " + div);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error");
		}
		System.out.println("Thank you\nEnd");
				

	}

}
