import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        StringBuilder buffer1 = new StringBuilder();
        StringBuilder buffer2 = new StringBuilder();
        int num = Math.max(num1.length(), num2.length());
        int dif = num - Math.min(num1.length(), num2.length());
        String min;
        String max;
        int counter = 0;

        if (dif != 0) {
            if (num == num1.length()) {
                min = num2;
                max = num1;
            } else {
                min = num1;
                max = num2;
            }
            for (int i = 0; i < dif; i++) {
                buffer1.append(0);
            }
            buffer1.append(min);
            min = buffer1.toString();
        } else {
            max = num1;
            min = num2;
        }

        for (int i = num-1; i >= 0; i--) {
            int temp = max.charAt(i) -'0' + min.charAt(i) -'0'+ counter ;
            switch (temp) {
                case 3:
                    buffer2.append(1);
                    counter = 1;
                    break;
                case 2:
                    buffer2.append(0);
                    counter = 1;
                    break;
                case 1:
                    buffer2.append(1);
                    counter = 0;
                    break;
                case 0:
                    buffer2.append(0);
                    counter = 0;
                    break;
            }
            if (i == 0 & counter ==1)
                buffer2.append(1);
        }

        buffer2.reverse();
        System.out.println(buffer2.toString());

    }
}
