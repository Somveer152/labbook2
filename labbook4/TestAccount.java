package labbook4;

import java.util.Random;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac=new Account();
		Person p=new Person();
		Random rd=new Random();
		long l1=rd.nextLong();
		ac.setAccNum(l1);
		ac.setAccHolder(p);
		ac.getAccHolder().setAge(30);
		ac.getAccHolder().setName("Smith");
		ac.setBalance(2000);
		System.out.println(ac.toString());
		ac.deposit(3000);
		System.out.println(ac.toString());
		

	}

}
