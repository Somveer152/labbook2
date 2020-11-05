package labbook3;
import java.time.LocalDate;
import java.time.Period;
public class AgeCalculator {
	
	public void agecal(LocalDate d1) {
		Period p=Period.between(d1,LocalDate.now());
		System.out.printf("The age of the Person is: %d",p.getDays());
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgeCalculator ag= new AgeCalculator();
		LocalDate d1=LocalDate.of(1999,02,15);
		ag.agecal(d1);
		
		

	}

}
