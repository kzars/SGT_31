import java.time.*;
import java.time.temporal.IsoFields;

public class DateAndTImeExamples {
    public static void main(String[] args) {

        //LocalTime
        LocalTime localTime = LocalTime.now().withNano(0);
        System.out.println("Now is: " + localTime);
        System.out.println(localTime.getHour() + "/" + localTime.getMinute() + "/" + localTime.getSecond());
        System.out.printf("%d/%d/%d\n", localTime.getHour(),localTime.getMinute(),localTime.getSecond());


        LocalTime localTime1 = LocalTime.now().withNano(0).withSecond(0);
        System.out.println(localTime1);
        //Increased localTime1 by 15 minutes
        localTime1 = localTime1.plusMinutes(15);
        System.out.println("Break until: " +localTime1);

        //LocalDate

        LocalDate localDate = LocalDate.now();
        System.out.println("Today is " + localDate);
        System.out.println("Year is: " + localDate.getYear());
        System.out.println("Day of the week " + localDate.getDayOfWeek().toString().toLowerCase());
        System.out.println("Day of the year " + localDate.getDayOfYear());
        System.out.println("Week of the year " + (localDate.getDayOfYear()/7 + 1));
        System.out.println(localDate.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR));

        LocalDate localDate1 = LocalDate.of(2019, Month.DECEMBER, 11);
        System.out.println("Covid first case date was: " + localDate1);

        //LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Date and time now: " + localDateTime);

        LocalDateTime firstInternationCatsDay = LocalDateTime.of(1997,11,20,10,45,25,0);
        System.out.println("International Cat's day was started on: " + firstInternationCatsDay);

        System.out.println(firstInternationCatsDay.getMonth().getValue() + ":" + firstInternationCatsDay.getDayOfMonth());

        int currentMonth = firstInternationCatsDay.getMonthValue();

        switch (currentMonth){
            case 11:
                System.out.println("Novembris");
                break;
            default:
                System.out.println("November");
                break;
        }


        //Duration
        System.out.println(Duration.ofHours(11).toMinutes());
        System.out.println(Duration.between(LocalDateTime.now(), LocalDateTime.now().plusDays(2)).toMinutes());
        System.out.println(Duration.between(firstInternationCatsDay,LocalDateTime.now()).toDays());

        //Period
        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(160)).getMonths());






    }
}
