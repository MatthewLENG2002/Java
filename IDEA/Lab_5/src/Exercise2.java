import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        double max=0,min=100,total=0,avg;
        double[] score = new double[10];
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input the scores of these 10 students: ");
        for (int i = 0; i < 10; i++) {
            score[i] = sc.nextDouble();
        }
        for (int i = 0; i < 10; i++) {
            max=Math.max(score[i],max);
        }
        for (int i = 0; i < 9; i++) {
            min = Math.min(score[i],min);
        }
        for (int i = 0; i < 10; i++) {
            total=total+score[i];
        }
        total=total-max-min;
        avg=total/8d;

        System.out.println("The average score is "+ avg);
    }
}
