package labbook2;
import java.util.Scanner;
public class Person2 {
	private String firstName;
	private String lastName;
	private char gender;
	public Person2() {
		// TODO Auto-generated constructor stub
		System.out.println("This is the default constructor");
	}
	public Person2(String fname,String lname,char gender) {
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
public static void main(String[] args) {
	Person2 p2 = new Person2("Divya","Bharati",'F');
	System.out.println("First Name: "+p2.getFirstName());
	System.out.println("Last Name: "+p2.getLastName());
	System.out.println("Gender: "+p2.getGender());
	p2.display();
	
}
}
