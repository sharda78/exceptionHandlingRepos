package com.ExceptionHandlingsAssign;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		CalculatorWithExcep c1 = new CalculatorWithExcep();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your choice\n1.Add\n2.Sub\n3.Mul\n4.Div");
		
		int ch = sc.nextInt();
		switch(ch)
		{
		
		case 1:
			System.out.println("Enter two numbers");
			int add  = c1.add(sc.nextInt(), sc.nextInt());
			System.out.println(add);
			break;
		case 2:
			System.out.println("Enter two numbers");
			int sub  = c1.sub(sc.nextInt(), sc.nextInt());
			System.out.println(sub);
			break;
		case 3:
			System.out.println("Enter two numbers");
			int mul = c1.sub(sc.nextInt(), sc.nextInt());
			System.out.println(mul);
			break;
		case 4:
			System.out.println("Enter two numbers");
			try
			{
				int div  = c1.sub(sc.nextInt(), sc.nextInt());
				//System.out.println(div);
			}
			catch(ArithmeticException o)
			{
				System.out.println(o.getMessage());
			}
			break;
		default:
		System.out.println("Invalid");
			
			
			
		
		}

	}

}
