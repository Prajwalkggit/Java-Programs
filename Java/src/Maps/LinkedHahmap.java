package Maps;
import java.util.LinkedHashMap;

public class LinkedHahmap {

	public static void main(String[] args) 
	{
		LinkedHashMap <String,Integer> h= new LinkedHashMap <String,Integer> ();
		h.put("dinga", 123);
		h.put("dingi", 124);
		h.put("penga", 123);
		h.put("kinga", 125);
		h.put("chunga", 128);
		h.put("penga", 348);
		
		System.out.println(h);
	}

}
