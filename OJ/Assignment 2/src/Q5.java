import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] score = new int[num];
        for (int i = 0; i < num; i++) {
            score[i] = sc.nextInt();
        }
        int counter = 0,temp=0 ,start = 0;
//        int flag = 0;

        for (int i = 0; i < num - 1; i++) {
            if (score[i] <= score[i + 1] ) {
                counter++;
            } else {
//                flag = i + 1;
                counter = 0;
            }

            if (counter >= temp) {
                temp = counter;
                start = i+1 - counter;
            }
        }

        for (int i = start; i <= start + temp; i++) {
            System.out.print(score[i] + " ");
        }
    }
}
