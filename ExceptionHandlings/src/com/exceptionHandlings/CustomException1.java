package com.exceptionHandlings;

import java.util.Scanner;
class BookNotFoundException extends RuntimeException 
{
	// implicitely call default constructor
	public BookNotFoundException(String msg)
	{
		super(msg); // call parent 
	}
}
class PurchedBook
{
	public void checkBookId(int bookid)
	{
		if(bookid < 101 || bookid > 551)
		{
			throw new BookNotFoundException("please check your bookid once!!!!");	
		}
		else
		{
			System.out.println("your book is found !!! please pay at cash counter");
		}
	}
}
public class CustomException1 {

	public static void main(String[] args) {
		System.out.println("-------Welcome to bookyourbook-------");
		System.out.println("ENter bbokid from 101 to 551");
		
		Scanner sc = new Scanner(System.in);
		int bookid = sc.nextInt();
		
		PurchedBook p = new PurchedBook();
		try
		{
		p.checkBookId(bookid);
		}
		catch(BookNotFoundException e)
		{
		System.out.println("Message: " + e.getMessage());
		}
		System.out.println("Thank you !!!! keep shoppinggg: )");

	}

}
