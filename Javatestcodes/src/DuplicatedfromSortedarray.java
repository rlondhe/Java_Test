import java.util.Scanner;

public class DuplicatedfromSortedarray {

	public static void main(String[] args) {
		System.out.println("Enter number of array elements:");
		Scanner s= new Scanner(System.in);
		int x=s.nextInt();
		int[] a=new int[x];
		System.out.println("Unsorted array is:" );
		
		for(int i=0;i<x;i++){
		    a[i]= s.nextInt();
		    }
	         
	for(int i= 1;i<a.length;i++){
		for(int j=i;j>0;j--){
			if(a[j]<a[j-1]){
			int temp= a[j];
			a[j]=a[j-1];
			a[j-1]=temp;			
		}		
		}
	}
	System.out.println("");
	System.out.println("Sorted array is:" );
    for(int i=0;i<a.length;i++){
    System.out.println(+a[i]);
	}
   
    System.out.println("Removing duplicates if any:");
    int b = 0;
    a[b] = a[0];
    for (int i = 1; i < a.length; i++)
    {
        if (a[b] != a[i])
        {
            b++;
            a[b]=a[i];
        }

    }
    for(int i=0;i<=b;i++)
    {
        System.out.println(a[i]);
    }
    	
	}
}
