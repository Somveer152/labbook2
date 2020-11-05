package labbook3;

import java.time.LocalDate;
import java.time.Period;

public class DateDiff2 {
	public void getDateDif(LocalDate d1,LocalDate d2)
	{
//		LocalDate d2=LocalDate.now();
		Period p=Period.between(d2,d1);
		System.out.printf("Period in day is: %d",p.getDays());
		System.out.printf("\nPeriod in months is: %d",p.getMonths());
		System.out.printf("\nPeriod in years is: %d",p.getYears());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateDiff2 df=new DateDiff2();
		LocalDate d=LocalDate.of(1999, 12, 13);		
		LocalDate d1=LocalDate.of(1998, 11, 12);
		df.getDateDif(d,d1);

	}

}
