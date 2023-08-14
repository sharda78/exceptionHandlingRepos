package com.exceptionHandlings;

import java.util.Scanner;
class BookNotFoundException1 extends Exception 
{
	// implicitely call default constructor
	public BookNotFoundException1(String msg)
	{
		super(msg); // call parent 
	}
}
class PurchedBook1
{
	public void checkBookId(int bookid) throws BookNotFoundException1
	{
		if(bookid < 101 || bookid > 551)
		{
			throw new BookNotFoundException1("please check your bookid once!!!!");	
		}
		else
		{
			System.out.println("your book is found !!! please pay at cash counter");
		}
	}
}
public class CustomException2 {

	public static void main(String[] args) {
		System.out.println("-------Welcome to bookyourbook-------");
		System.out.println("ENter bbokid from 101 to 551");
		
		Scanner sc = new Scanner(System.in);
		int bookid = sc.nextInt();
		
		
		try
		{
		PurchedBook1 p = new PurchedBook1();
		p.checkBookId(bookid);
		}
		catch(BookNotFoundException1 e)
		{
		System.out.println("Message: " + e.getMessage());
		}
		System.out.println("Thank you !!!! keep shoppinggg: )");

	}

}
