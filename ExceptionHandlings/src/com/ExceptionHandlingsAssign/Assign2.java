package com.ExceptionHandlingsAssign;

// 2. WAP to use catch / handle the ArrayIndexOutOfBoundsException exception

public class Assign2 {

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
			System.out.println("please enter upto index value");
		}

	}

}
