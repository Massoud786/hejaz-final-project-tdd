package tdd.finalProject.utilities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateGenerator {
    public static String getCurrentDate(){
        Date currentDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MMMM d, yyyy");
        String formattedDate = format.format(currentDate);
        return formattedDate;

    }
    public static String getADayAfterCurrentDate(){
        LocalDate currentDate = LocalDate.now();
        LocalDate dayAfterCurrentDate = currentDate.plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String formattedDate = dayAfterCurrentDate.format(formatter);
        return formattedDate;
    }
}
