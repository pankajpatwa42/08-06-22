package Assignment0806;

import java.util.Scanner;



class InvalidPasswordException extends Exception{
	int passwordinvalid = 0;
	
	public InvalidPasswordException(int invalid)
	{
		super("Invalid Password");
		passwordinvalid = invalid;
		
	}

	public String printMessage()
	{
		switch(passwordinvalid) {
		
		case 1:
			return ("username length " + " between 6 to 15 characters");
		case 2:
			return ("Username have  " + " first letter in  one uppercase letter(A-Z)");
		case 3:
			return ("Password range should be " + " from 8 to 256 ");
		case 4:
			return ("Username should not" + " contain any space or parentheses");
		case 5:
			return ("Password should not" + " contain any space or parentheses");			
		case 6 :
			return ("username and password should be different!!!!!!! ");
		}
		return ("");
	}


}

public class Q40PasswordValidation  {

	public static void isValiduser (String username ) throws InvalidPasswordException 
	{
		
		if(((username.length())<=6) )
			{
				throw new InvalidPasswordException(1);
			}
		
		if(Character.isLowerCase(username.charAt(0)))
		{
			throw new InvalidPasswordException(2);
		}
		if((username.contains(" ")) || username.contains("()"))
			{
				throw new InvalidPasswordException(4);
			}
		
	}
	public static void isValidpassword (String password ) throws InvalidPasswordException {
		if(!((password.length())>=8 &&  (password.length()<=256)))
		{
			throw new InvalidPasswordException(3);
		}
		if((password.contains(" ")) || password.contains("()"))
		{
			throw new InvalidPasswordException(5);
		}
		
	}
	
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User Name:  ");	
		String username = sc.nextLine();
		
		try {
			isValiduser(username);
			System.out.println("Enter the password :");
			String password = sc.nextLine();
			isValidpassword(password);
			
			if(username.equals(password))
				throw new InvalidPasswordException(6);
			else if(username == "admin" && password == "admin")
				System.out.println("Authenticate Successfully.... ");

		} catch (InvalidPasswordException e) {
			System.out.println(e.printMessage());
		}
		
	}
	

	
}
