package labbook3;

import java.time.LocalDate;
import java.util.Scanner;

public class WarranteeDate {

	public void getWarranteeDate(LocalDate d,int year,int months)
	{
		LocalDate d1=(d.plusMonths(months)).plusYears(year);
		System.out.println("Expiary of the product will end on:"+d1);
		
	}
	public static void main(String[] args) {
		WarranteeDate wd=new WarranteeDate();
		LocalDate ld=LocalDate.of(2020, 11, 05);
		int wyear=0;
		int wmonths=12;
		wd.getWarranteeDate(ld, wyear, wmonths);
		
		
	}
}
