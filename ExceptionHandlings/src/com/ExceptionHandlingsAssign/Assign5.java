package com.ExceptionHandlingsAssign;
//5. WAP where only try and finally is used 
public class Assign5 {

	public static void main(String[] args) {
		int a = 20;
		int b = 0;
		
		try
		{
		int div = a / b;
		System.out.println(div);
		}
		
		/*catch(ArithmeticException o)
		{
			System.out.println(o.getMessage());
		}*/
		
		finally
		{
			System.out.println(" Finally Block is Always Excuted");
			
		}

	}

}
