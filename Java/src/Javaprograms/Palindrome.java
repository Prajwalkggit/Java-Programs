package Javaprograms;

public class Palindrome {

	public static void main(String[] args) 
	{
		String s1="MoM";
		String rev="";
		
		for (int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		
		System.out.println(rev);
		
		if(s1.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}

	}

}
