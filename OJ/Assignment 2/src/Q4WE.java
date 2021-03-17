import java.util.Scanner;

public class Q4WE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String datei = sc.nextLine();
        String datef = sc.nextLine();
        int counter = 0;
        int di = Integer.parseInt(datei);
        int df = Integer.parseInt(datef);


        for (int i = di; i <= df; i++) {

            StringBuilder date = new StringBuilder();
            if (i / 10000 <= 9) {
                date.append("000");
            } else if (i / 10000 <= 99) {
                date.append("00");
            } else if (i / 10000 <= 999){
                date.append("0");
            }
            date.append(i);
            String d = date.toString();

            int year = Integer.parseInt(d.substring(0, 3));
            boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
            int month = Integer.parseInt(d.substring(4, 5));
            int day = Integer.parseInt(d.substring(6, 7));
            boolean validDate;

            validDate = (month <= 12);

            switch (month) {
                case 1:
                case 5:
                case 7:
                case 3:
                case 8:
                case 10:
                case 12:
                    validDate = (day <= 31);
                    break;
                case 2:
                    if (isLeapYear)
                        validDate = (day <= 29);
                    else
                        validDate = (day <= 28);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    validDate = (day <= 30);
                    break;
            }

            if (validDate) {
                StringBuilder buffer = new StringBuilder();
                buffer.append(d);
                buffer.reverse();
                if (buffer.toString().equals(d))
                    counter++;
            }
        }
        System.out.println(counter);
    }
}
