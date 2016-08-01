//How to multiply a number by 2 without using * operator?
import java.util.Scanner;
public class MultiplyBy2 {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s= new Scanner(System.in);
		int b= s.nextInt();
		int temp =b;
		b=b+b;
		System.out.println("Number " +temp+ " is multiplied by 2 and multiplication is: " +b );

	}

}
