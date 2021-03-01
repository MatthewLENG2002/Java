import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int year, month, days = 0;
        String monthName = "";
        boolean isLeapYear = false;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year:");
        year = sc.nextInt();
        System.out.print("Enter the month:");
        month = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            isLeapYear = true;
        } else
            isLeapYear = false;

        switch (month) {
            case 1:
                days = 31;
                monthName = "Jan";
                break;
            case 2:
                if (isLeapYear == true)
                    days = 29;
                else
                    days = 28;
                monthName = "Feb";
                break;
            case 3:
                days = 31;
                monthName = "March";
                break;
            case 4:
                days = 30;
                monthName = "April";
                break;
            case 5:
                days = 31;
                monthName = "May";
                break;
            case 6:
                days = 30;
                monthName = "June";
                break;
            case 7:
                days = 31;
                monthName = "July";
                break;
            case 8:
                days = 31;
                monthName = "Aug";
                break;
            case 9:
                days = 30;
                monthName = "Sept";
                break;
            case 10:
                days = 31;
                monthName = "Oct";
                break;
            case 11:
                days = 30;
                monthName = "Nov";
                break;
            case 12:
                days = 31;
                monthName = "Dec";
                break;
            default:
                System.out.println("Error!");
                break;
        }
        System.out.printf("%s of %d has %d days.\n", monthName, year, days);
    }
}
