package Javaprograms;

public class Fact 
{
	
		static void factorial (int no)
		{
		int fact=1;
		for (int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		}
		
		public static void main(String[] args) 
		{
			factorial (5);
	    }

}
