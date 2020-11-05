package labbook3;
import java.time.ZonedDateTime;
import java.time.ZoneId;
public class ZonedTime {
	public static void getZonedTime(ZoneId id) {
		System.out.println(ZonedDateTime.now(id));
		
		
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ZoneId id= ZoneId.of("America/New_York");
		ZonedTime.getZonedTime(id);

	}
	

}
