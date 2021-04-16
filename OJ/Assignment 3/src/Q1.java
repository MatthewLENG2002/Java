import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] pattern = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                pattern[i][j] = sc.nextInt();
            }
        }

        int[][] mirror = new int[2*m][2*n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mirror[i][j] = pattern[i][j];
                mirror[2*m-i-1][j] = pattern[i][j];
                mirror[i][2*n-j-1] = pattern[i][j];
                mirror[2*m-i-1][2*n-j-1] = pattern[i][j];
            }
        }

        for (int i = 0; i < 2*m; i++) {
            for (int j = 0; j < 2*n; j++) {
                System.out.print(mirror[i][j]+" ");
            }
            System.out.println();
        }

    }
}
