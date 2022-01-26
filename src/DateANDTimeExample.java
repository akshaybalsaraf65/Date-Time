import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class DateANDTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDate date1 = LocalDate.now();
		System.out.println(date1.getDayOfMonth());
		System.out.println(date1.getDayOfWeek());
		System.out.println(date1.getDayOfYear());
		System.out.println(date1.atStartOfDay());
		
		int dd = date1.getDayOfMonth();
		int mm = date1.getMonthValue();
		int yyyy = date1.getYear();
		System.out.println(dd +"-"+mm+"-"+yyyy);
		
		LocalTime time1 = LocalTime.now();
		int h = time1.getHour();
		int m = time1.getMinute();
		int s = time1.getSecond();
		int ns = time1.getNano();
		System.out.println(h +"-" + m +"-" + s +"-" +ns);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		System.out.println(dt.getDayOfMonth());
		System.out.println(dt.getMinute());
		System.out.println(dt.getHour());
		
		LocalDateTime dt1 = LocalDateTime.of(1997, 03, 07, 10, 50);
		System.out.println(dt1);
		
		 LocalDate bd = date1.of(1997, 03, 07);
		 LocalDate cd = date1.now();
		 Period p = Period.between(bd, cd);
		 System.out.println(p);
		 
//		 Scanner sc = new Scanner(System.in);
//		 System.out.println("Enter year number");
//		 int n = sc.nextInt();
//		 Year y = Year.of(n);
//		 if(y.isLeap()) {
//			 System.out.println("yes" + n);
//		 }else {
//			 System.out.println("no" + n);
//		 }
		 
		 ZoneId zone = ZoneId.systemDefault();
		 System.out.println(zone);
		 
		 ZoneId la = ZoneId.of("America/Los_Angeles");
		 ZonedDateTime ddtt = ZonedDateTime.now(la);
		 System.out.println(ddtt);
	}

}
