package com.exceptionHandlings;

public class ClassForNAme {

	public static void main(String[] args) {
		System.out.println("------Start-----------");
		
		try
		{
			Class name = Class.forName("com.exceptionHandlings.ClassForNAme"); //provide java file path
			//Class name = Class.forName("com.exceptionHandlings.ClassForNAme222");
			System.out.println("class name: " + name);
		}
		catch(ClassNotFoundException o)
		{
			//System.out.println(o.getMessage());
			System.out.println("please check name of class" );
		}
		System.out.println("--------end--------");

	}

}
