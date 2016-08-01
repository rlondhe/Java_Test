//How to divide a number by 2 without using / operator?
import java.util.Scanner;
public class divideby2 {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s= new Scanner(System.in);
		int b= s.nextInt();
		
		int temp=b;
		int counter=0;
		while(b>=2){
			b=b-2;
			counter++;
			    	}
		System.out.println("Number " +temp+ " is divided by 2 and division is = " +counter +" and reminder is: " +b );
 	}
}
