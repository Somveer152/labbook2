package labbook2;

public class Person {
	String fname;
	String lname;
	char gender;
	int age;
	double weight;
	public Person(String fname,String lname,char gender,int age,double weight) {
		
		// TODO Auto-generated constructor stub
		this.fname=fname;
		this.lname=lname;
		this.gender=gender;
		this.age=age;
		this.weight=weight;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("Divya","Bharati",'F',20,85.55);
		System.out.println("First Name: "+p1.fname);
		System.out.println("Last Name: "+p1.lname);
		System.out.println("Gender: "+p1.gender);
		System.out.println("Age: "+p1.age);
		System.out.println("Weight: "+p1.weight);
		

	}

}
