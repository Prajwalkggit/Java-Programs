package Javaprograms;

public class Reversestring {

	public static void main(String[] args) 
	{
		String s1="PRAJWAL";//0,1,2
		String rev=" ";
		
		for (int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		
		System.out.println(rev);
	}

}
