package com.exceptionHandlings;

import java.util.Scanner;
class VehicleSpeedException extends RuntimeException
{
	public VehicleSpeedException(String msg)
	{
		super(msg);
	}
}
class VehicleSpeed
{
	public void checkSpeed(int speed)
	{
	if(speed > 80)
	{
		throw new VehicleSpeedException("Reduce your spped");
	}
	else
	{
		System.out.println("your speed is less than 80");
	}
	}
	
}
public class CustomException3 {

	public static void main(String[] args) {
		System.out.println("-------Vehicle Speed Exception -------");
		System.out.println("Enter speed");
		
		Scanner sc = new Scanner(System.in);
		int speed = sc.nextInt();
		
		try
		{
		VehicleSpeed v = new VehicleSpeed();
		v.checkSpeed(speed);
		}
		catch(VehicleSpeedException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}

