
public class SwapIntegerByref {

	public static void main(String[] args) {
	int[] a= {1,2};
	
	System.out.println("Value before Swap: " + a[0]+" "+a[1]); 
	swap(a);
	System.out.println("Value before Swap: " + a[0]+" "+a[1]);
	}
	static void swap(int [] values){
		int temp= values[0];
		values[0]=values[1];
		values[1]= temp;		
	}

}
