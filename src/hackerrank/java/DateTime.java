package hackerrank.java;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;

public class DateTime {
    public static void main(String[] args) {
        /*Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, 7);
        calendar.set(Calendar.DAY_OF_MONTH, 14);
        calendar.set(Calendar.YEAR, 2017);

        String day = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        System.out.println(day);*/

        LocalDate localDate = LocalDate.of(2017, 7, 17);
        String dayOfTheDate = localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US);
        System.out.println(dayOfTheDate.toUpperCase());
    }
}
