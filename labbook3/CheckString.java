package labbook3;

import java.util.Scanner;

public class CheckString {
	public boolean check(String str) {
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)-str.charAt(i+1)<0)
			{
				return false;
				
				
			}
		}
		return true;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckString ps=new CheckString();
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		if(ps.check(str1)==true) {
			System.out.println("String is Positive");
		}
		else
		{
			System.out.println("String is negative");
		}
	}

}
