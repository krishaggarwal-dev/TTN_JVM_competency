package Java8.Question10;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeDiff {
    public static void main(String[] args) {

        ZonedDateTime india = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime usa = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime uk = ZonedDateTime.now(ZoneId.of("Europe/London"));

        System.out.println("Time in India: " + india);
        System.out.println("Time in USA: " + usa);
        System.out.println("Time in UK: " + uk);
    }
}
