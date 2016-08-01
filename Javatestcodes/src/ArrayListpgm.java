import java.util.ArrayList;
import java.util.List;

public class ArrayListpgm {

	public static void main(String[] args) {
		List <String> aL = new ArrayList <String>();
		aL.add("This");
		aL.add("Is");
		aL.add("My");
		aL.add("First");
		aL.add("ArrayList");
		aL.add("Program");
		
		System.out.println("Contents in the arrayList are: " +aL);
		
		aL.add(6,"in");
		aL.add(7,"this");
		aL.add(8,"class");
		
		aL.remove(2);
		
		System.out.println("Contents in the arrayList after modification are: " +aL);
	}
}
