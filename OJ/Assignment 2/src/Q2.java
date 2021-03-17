import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        boolean validity = false;
        if (r1 > r2)
        {System.out.println("No");return;}

        int[] row1 = new int[r1];
        for (int i = 0; i < r1; i++) {
            row1[i] = sc.nextInt();
        }
        int[] row2 = new int[r2];
        for (int i = 0; i < r2; i++) {
            row2[i] = sc.nextInt();
        }

        int flag = 0;

        for (int i = 0; i < row1.length; i++) {
            if (flag == row2.length && i!= row1.length){
                validity=false;
                break;
            }

            for (int j = flag; j < row2.length; j++) {

                if (row1[i]!=row2[j]){
                    validity = false;
                    flag++;
                }
                else {
                    validity = true;
                    flag = j+1;
                    break;
                }
            }
        }

        if (validity)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
