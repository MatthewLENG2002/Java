import java.util.Scanner;
import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] board = new int[n][n];
        boolean isValid = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                switch (scan.next()) {
                    case "N":
                        board[i][j] = 0;
                        break;
                    case "O":
                        board[i][j] = 1;
                        break;
                    case "X":
                        board[i][j] = 2;
                        break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] ==0){
                    board[i][j] = 1;

                    String sr = Arrays.toString(board[i]);
                    int checkr = sr.indexOf("1, 1, 1, 1, 1");

                    StringBuilder sctemp = new StringBuilder();
                    for (int k = 0; k < n; k++) {
                        sctemp.append(board[k][j]);
                    }
                    String sc = sctemp.toString();
                    int checkc = sc.indexOf("11111");

                    StringBuilder sitemp = new StringBuilder();
                    int min = Math.min(i, j);
                    int max = Math.max(i, j);
                    if ((min + n - max)>=5){
                        if (i<=j){
                            int m =0;
                            for (int k = max-i; k < ((max-i)+(min + n - max)) ; k++) {
                                sitemp.append(board[m][k]);
//                                if (m!=n-1)
                                    m++;
                            }
                        }
                        if (i>j){
                            int m =0;
                            for (int k = max-j; k < ((max-j)+(min + n - max)) ; k++) {
                                sitemp.append(board[k][m]);
//                                if (m!=n-1)
                                    m++;
                            }
                        }
                    }
                    String si = sitemp.toString();
                    int checki = si.indexOf("11111");



                    int checkir=-1;
                    if (n>=5){
                        for (int k = 4; k <= n-1; k++) {
                            StringBuilder sitempr = new StringBuilder();
                            for (int l = 0; l <= k; l++) {
                                sitempr.append(board[k-l][l]);
                            }
                            String sir = sitempr.toString();
                            int check = sir.indexOf("11111");
                            if (check !=-1){
                                checkir = 0;
                                break;
                            }
                        }
                        for (int k = 1; k < n-4; k++) {
                            StringBuilder sitempr1 = new StringBuilder();
                            for (int l = 0; l < n-k; l++) {
                                sitempr1.append(board[k+l][n-l-1]);
                            }
                            String sir = sitempr1.toString();
                            int check = sir.indexOf("11111");
                            if (check !=-1){
                                checkir = 0;
                                break;
                            }
                        }
                    }

//                    if ((min + max)>=4) {
//                        if (i+j <= n-1) {
//                            int m = 0;
//                            for (int k = max + i; k >= 0; k--) {
//                                sitempr.append(board[m][k]);
//                                if (m<n)
//                                    m++;
//                            }
//                        }
//                        if (i+j > n-1) {
//                            int m = n-1;
//                            for (int k = i - (n-1-j); k <n; k++) {
//                                sitempr.append(board[k][m]);
//                                if (m!=n)
//                                    m--;
//                            }
//                        }
//                    }


                    if (checkr ==-1 & checkc ==-1 & checki == -1 & checkir == -1);
                        else {
                            isValid = true;
                        System.out.printf("(%d,%d)\n", j+1, i+1);
                    }
                    board[i][j] = 0;

                }

            }
        }
        if (!isValid)
            System.out.println("No");
    }
}


