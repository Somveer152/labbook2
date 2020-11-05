package labbook3;
import java.time.LocalDate;
import java.time.Period;

public class DateDiff {
	public void getDateDiff(LocalDate d1)
	{
		LocalDate d2=LocalDate.now();
		Period p=Period.between(d2,d1);
		System.out.printf("Period in day is: %d",p.getDays());
		System.out.printf("\nPeriod in months is: %d",p.getMonths());
		System.out.printf("\nPeriod in years is: %d",p.getYears());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateDiff df=new DateDiff();
		LocalDate d=LocalDate.of(1999, 12, 13);		
		df.getDateDiff(d);

	}

}
