package Assignment0806;

class x extends Thread
{
	 public static final String RESET = "\u001B[0m";
	 public static final String YELLOW = "\u001B[33m";
	 public static final String RED = "\u001B[31m";
	 public static final String BLUE = "\u001B[34m";

	 public void textColorYellow()
		{
			System.out.println(YELLOW +"This text in yellow color "+RESET);
		}
	 public void textColorRed()
		{
			System.out.println(RED +"This text in Red color "+RESET);
		}
		public void textColorBlue()
		{
			System.out.println(BLUE +"This text in Blue color "+RESET);
		}
		@Override
		public void run() {
			textColorYellow();
			textColorRed();
			textColorBlue();
		}
}



public class Q44ThreadEg{


	public static void main(String[] args) {
		x obj = new x();
		x obj1 = new x();
		x obj2 = new x();
//		Thread t1 = new Thread(obj);
//		Thread t2 = new Thread(obj1);
		obj.start();
		obj1.start();
//		t3.start();
//		System.out.println(YELLOW + " This is text from "+RESET);

	}




}
