package com.exceptionHandlings;

import java.io.FileNotFoundException;

import java.io.IOException;

class Parent
{
	public void m1(int a)
	{
		System.out.println("a : " + a);
	}
	public void m2(double d) throws IOException,RuntimeException
	{
		System.out.println("d : " + d);
	}
}
class Child extends Parent
{
	public void m1(int a) throws ArithmeticException
	{
		System.out.println("a : " + a);
	}
	public void m2(double d) throws FileNotFoundException,ArithmeticException
	{
		System.out.println("d : " + d);
	}
}
public class ExceptionWithInheritance {

	public static void main(String[] args) {
		Child c = new Child();
		c.m1(4);
		try {
			c.m2(22.4);
		} catch (FileNotFoundException | ArithmeticException e) {
			
			e.printStackTrace();
		}

	}

}
