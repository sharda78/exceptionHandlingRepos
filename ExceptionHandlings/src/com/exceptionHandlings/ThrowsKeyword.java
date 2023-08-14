package com.exceptionHandlings;
import java.io.IOException;
public class ThrowsKeyword {

	public static void checkage(int age) throws IOException
	{
		if(age < 35)
		{
			//explicitily throw excep
			throw new ArithmeticException("Candidate is not eligible");
			
		}
		else
		{
			System.out.println("pleasde fill the form details");
		}
	}
	public static void main(String[] args) {
		//ThrowExpliciteliException e = new ThrowExpliciteliException();
				try {
				checkage(48);
				//checkage(23); // pleasde fill the form details
				}
				catch(IOException o)
				{
					System.out.println(" Message : "  + o.getMessage());
				}

			}

	}


