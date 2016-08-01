import java.util.LinkedList;
import java.util.List;

public class Linkedlistpgm {

	public static void main(String[] args) {
	
		List<String> linkedlist= new LinkedList <String>();
		
		linkedlist.add("First");
		linkedlist.add("Second");
		linkedlist.add("Third");
		linkedlist.add("Fourth");
		linkedlist.add("Fifth");
	
		System.out.println("Contents in the linkedlist are: " +linkedlist);
		
		int a= linkedlist.size();
		System.out.println("Linkedlist size is: " +a);
		
		linkedlist.remove(1);
		linkedlist.set(1, "Second added again");
				
		System.out.println("Contents in the linkedlist after modification are: " +linkedlist);
	}
}
