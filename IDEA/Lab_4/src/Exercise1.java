import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        double pai = 0;
        int n, i;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the precision n: ");
        n = sc.nextInt();

        for (i = 0; i <= n; i++) {
            pai = pai + 4 * Math.pow(-1, i) / (2 * i + 1);
        }

        System.out.println("The estimated pai is "+pai);

    }
}
