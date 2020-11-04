package labbook2;

import java.util.Scanner;

public class Person3 {
	private String firstName;
	private String lastName;
	private Gender gender;
	enum Gender{
		M,F
	}
	public Person3() {
		// TODO Auto-generated constructor stub
		System.out.println("This is the default constructor");
	}
	public Person3(String fname,String lname,Gender gender) {
		this.firstName=fname;
		this.lastName=lname;
		this.gender=gender;
		
	}
	public int phoneno() {
		System.out.println("Enter phone Number: ");
		Scanner s=new Scanner(System.in);
		int phoneno=s.nextInt();
		return phoneno;
		}
	
	public void display()
	{
		System.out.println("First Name: "+this.firstName);
		System.out.println("Last Name: "+this.lastName);
		System.out.println("Gender: "+this.gender);
		System.out.println("Phone NO."+this.phoneno());
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
public static void main(String[] args) {
	Person3 p3 = new Person3("Divya","Bharati",Gender.F);
	System.out.println("First Name: "+p3.getFirstName());
	System.out.println("Last Name: "+p3.getLastName());
	System.out.println("Gender: "+p3.getGender());
	p3.display();
	
}

}
