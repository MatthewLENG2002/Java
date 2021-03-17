import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String datei = sc.nextLine();
        String datef = sc.nextLine();
        int counter = 0;

        int yeari = Integer.parseInt(datei.substring(0, 4));
        int yearf = Integer.parseInt(datef.substring(0, 4));
        int monthi = Integer.parseInt(datei.substring(4, 6));
        int monthf = Integer.parseInt(datef.substring(4, 6));
        int dayi = Integer.parseInt(datei.substring(6));
        int dayf = Integer.parseInt(datef.substring(6));

        for (int i = yeari; i <= yearf; i++) {
            boolean isLeapYear = i % 4 == 0 && i % 100 != 0 || i % 400 == 0;
            for (int j = 1; j <= 12; j++) {

                if (i == yeari & j ==1)
                    j = monthi;

                int day = 0;
                switch (j){
                    case 1:
                    case 5:
                    case 7:
                    case 3:
                    case 8:
                    case 10:
                    case 12:
                        day=31;
                        break;
                    case 2:
                        if (isLeapYear)
                            day=29;
                        else
                            day=28;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        day=30;
                        break;
                }

                for (int k = 1; k <= day; k++) {
                    if (i == yeari & j ==monthi & k ==1)
                        k = dayi;
                    StringBuilder date = new StringBuilder();
                    if (i<10)
                        date.append("000");
                    else if (i<100)
                        date.append("00");
                    else if (i<1000)
                        date.append("0");
                    date.append(i);

                    if (j<10)
                        date.append("0");
                    date.append(j);

                    if (k<10)
                        date.append("0");
                    date.append(k);

                    String d = date.toString();
                    date.reverse();
                    if (d.equals(date.toString()))
                        counter++;

                    if (i ==yearf & j ==monthf & k == dayf){
                        break;
                    }
                }
                if (i == yearf & j == monthf)
                    break;
            }
        }
        System.out.println(counter);
    }
}
