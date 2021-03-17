import java.util.Scanner;

public class Q1 {
    public static int gcd(int x, int y) {
        for (; ; ) {
            if (x<y) {
                int temp = x;
                x = y;
                y = temp;
            }
            int temp = x / y;
            int left = x - temp * y;
            if (left == 0)
                return y;
            else {
                x = y;
                y = left;
            }

        }
    }

    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int gcd = gcd(n, m);
        System.out.println(n / gcd + " " + m / gcd);

    }

}
