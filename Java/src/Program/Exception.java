package Program;

public class Exception {

	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		try 
		{
			int i=1/0;
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Handled");
		}
		
		finally
		{
			System.out.println("I m finally block....");
		}
		
		
		System.out.println("Main ends....");

	}

}
