package labbook2;
import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num>=0) {
			System.out.println("Number is postive");
		}
		else
			System.out.println("Number is negative");

	}

}
