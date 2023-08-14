package com.exceptionHandlings;
import java.io.IOException;
public class ExcepPropagation {

	public void m1() throws IOException,ClassNotFoundException
	{
		System.out.println("Code........");
	}
	public void m2() throws IOException,ClassNotFoundException
	{
		m1();
	}
	public void m3()
	{
		System.out.println("---method  1-------");
		try {
			m2();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		
		
		System.out.println("\n---method  2-------");
		try {
			m2();
		} catch (ClassNotFoundException | IOException e) {

			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ExcepPropagation e = new ExcepPropagation();
		e.m3();

	}

}
