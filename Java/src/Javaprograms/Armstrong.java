package Javaprograms;

public class Armstrong {

	public static void main(String[] args) 
	{
		int no=125;
		int copy=no;
		int sum=0;
		
		while(no!=0)
		{
			int rem=no%10;
		    sum=sum+(rem*rem*rem);
		    no=no/10;
		}
		if(sum==copy)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not a armstrong");
		}
	}

}
