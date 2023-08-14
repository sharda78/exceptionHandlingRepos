package com.ExceptionHandlingsAssign;
// 1. WAP which throws ArrayIndexOutBoundsException. In the console, observe the stack trace and the line number from where the Exception is thrown 

public class Assign1 {

	public static void main(String[] args) {
		int num[] = { 34,23,45,14,56 };
		
		int len = num.length;
		
		try
		{
			for(int i = 0; i <= len; i++)
			{
				System.out.println(num[i]);
				
			}
		}
		catch(ArrayIndexOutOfBoundsException o)
		{
			o.printStackTrace();
		}

	}

}
