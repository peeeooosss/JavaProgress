import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Scanner;

public class JavaDateAndTime {
    public static String getDayOfWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE");
        String dayOfWeek = date.format(formatter);

        return dayOfWeek;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the date (dd): ");
        int day = scanner.nextInt();
        System.out.print("Enter the month (MM): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year (yyyy): ");
        int year = scanner.nextInt();

        String dayOfWeek = getDayOfWeek(day, month, year).toUpperCase();

        System.out.println("The day of the week is: " + dayOfWeek);
    }
}