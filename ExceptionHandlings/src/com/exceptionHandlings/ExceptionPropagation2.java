package com.exceptionHandlings;
//Stack implementation
//m1
//m2
//m3
//main......bottom to up
public class ExceptionPropagation2 {
	public static void m1()
	{
		System.out.println("code...");
	}
	public static void m2() // caller method
	{
		m1();
	}
	public static void m3() // caller method 
	{
		m2();
	}

	public static void main(String[] args) {
		System.out.println("--Start----");
		m3();
		System.out.println("--End----");

	}

}
