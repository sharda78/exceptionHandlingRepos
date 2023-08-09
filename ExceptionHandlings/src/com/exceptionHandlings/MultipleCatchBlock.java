package com.exceptionHandlings;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		System.out.println("start");
		String name = null;
		int num[] = {4,5,6};
		int a =10;
		int b = 2;   //if any no is divided by zero
		try
		{
			int div = a/b; //excep occour
			System.out.println("DIvision " + div);
			System.out.println("array:" + num[0]);
			System.out.println(name.length());
			
		}
		catch(ArithmeticException e) // child class
		{
			System.out.println("please do not divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) // child class
		{
			System.out.println("please check index number");
		}
		catch(RuntimeException e) // parent class
		{
			System.out.println("Runtime exception"); // here,handlednullpointerException
		}
		catch(Exception e) //grand-parent exception
		{
			//general exception block
			System.out.println(e.getMessage());
		}
		// parent block always write down/last
		System.out.println("Rest of code\nEnd");
				

	}

}
