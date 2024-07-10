package Java8_Coding_Questions;

//How will you get the current date and time using Java 8 Date and Time API?

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Date_Time_API {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date: " + date);
        System.out.println("Current Time: " + time);
        System.out.println("Current Date & Time: " + dateTime);
    }
}
