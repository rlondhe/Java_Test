
public class Swappassbyreference {

	public static void main(String[] args) {
			String abc[] = {"Java", "Reference"}; 
			System.out.println("Value before Swap: " + abc[0]+" "+abc[1]); 
			swapbyreference(abc); 
			System.out.println("Value after Swap: " + abc[0]+" "+abc[1]); 
			} 
			static void swapbyreference(String[] a) { 
			String temp = a[0]; 
			a[0] = a[1]; 
			a[1] = temp; 
			}
		
	}
