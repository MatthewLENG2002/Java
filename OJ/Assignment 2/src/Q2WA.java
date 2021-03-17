import java.util.Scanner;

public class Q2WA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        boolean validity = true;
        if (r1 > r2)
            System.out.println("no");

        int[] row1 = new int[r1];
        for (int i = 0; i < r1; i++) {
            row1[i] = sc.nextInt();
        }
        int[] row2 = new int[r2];
        for (int i = 0; i < r2; i++) {
            row2[i] = sc.nextInt();
        }
        int phase = 0;

        for (int i = 0; i < row1.length; i++) {
            while(i < row1.length){
                if (row1[i] == row1[i+1])
                    phase--;
            }

            if (row1[i] != row2[i + phase]) {
                validity = false;
                break;
            }

            for (int j = 1; j < row2.length - i - phase; j++) {
                if (row1[i] != row2[i + j + phase])
                    break;
                else {
                    phase++;
                }
            }

        }
        if (validity)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

