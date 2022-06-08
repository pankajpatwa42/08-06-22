package Assignment0806;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q39ExceptionExample {

	public static void main(String[] args) {
		int x,y;
		System.out.println("Enter the Value of x : ");
		Scanner sc = new Scanner(System.in);
		try
		{
		 x = sc.nextInt();
		}catch(InputMismatchException e)
		{
			throw new InputMismatchException("x value should be a 32 bit signed Integer");
		}
		System.out.println("Enter the Value of y: ");
		try
		{
		 y = sc.nextInt();
		}catch(InputMismatchException e)
		{
			throw new InputMismatchException("y value should be a 32 bit signed Integer");
		}
		
		try {
			System.out.println(""+(x/y));
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
