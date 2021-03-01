import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int mul, i, j, n = 1;

        Scanner sc = new Scanner(System.in);
        while (n != 0) {
            System.out.print("Please input a number to print the Multiplication Table [0 to terminate]:");
            n = sc.nextInt();
            i = 1;
            if (n < 0 || n > 9) {
                System.out.println("Please input a number between [1,9]");
            } else {
                while (i <= n) {
                    j = 1;
                    while (j <= i) {
                        mul = i * j;
                        //System.out.print(j + "*" + i + "=" + mul + " ");
                        System.out.printf("%2d * %2d = %2d ",i,j,mul);
                        j++;
                    }
                    System.out.println();
                    i++;
                }
            }

        }
    }
}

