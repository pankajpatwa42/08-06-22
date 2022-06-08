package Assignment0806;

import java.util.Scanner;

public class Q43HighScoreWord {
	
	public static String highestElement(String str)
	{
		String res = "";
		int max =0;
		String words[] = str.split(" ");
		for (String  w : words)
		{	
			int weigth = 0;
			for(char c : w.toCharArray())
			{
				weigth+=c-96;
			}
			
			if(weigth>max) 
			{
				max = weigth;
				res = w;
			}
			}
		return res;
       	}

	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String input = sc.nextLine();
		String res =  highestElement(input);
		System.out.println(res);
	
		
		
	}
}

