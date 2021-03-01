import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args){
        int secondsNumber, hours, minutes, seconds;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        secondsNumber = input.nextInt();

        seconds = secondsNumber % 60;
        minutes = (secondsNumber % 3600 - seconds) / 60;
        hours = (secondsNumber - seconds -minutes * 60 ) / 3600;

        System.out.printf("The equivalent time is %d hours, %d minutes, and %d seconds",hours, minutes, seconds);
    }
}
