package Assignment0806;

import java.util.Scanner;

public class Q42_Likes {
	
	
	public static String Likes(String[] user )
	{
		for(int i=0;i<user.length;i++)
		{
		if(user.length==0)
			return ("No one Likes ");
			else if (user.length==1)
				return user[i];
			else if(user.length==2)
				return (user[0]+" "+user[1]);
			else if(user.length==3)
				return(user[0]+" "+user[1]+" "+user[2]+" ");
			else
				return(user[0]+" "+user[1]+" "+((user.length)-2)+ " more Likes.");
	}
		return null;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number Likes : ");
		int len = sc.nextInt();
		String [] users = new String[len];
		System.out.println("Enter people likes : ");
		for(int i =0;i<len;i++)
		{
			users[i] = sc.next();
		}
		String res = Likes(users);
		System.out.println(res);
	}

}
