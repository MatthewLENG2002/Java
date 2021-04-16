import java.util.Scanner;

public class Q3 {
    public static int mine (int x,int y,char[][] map){
        int counter=0;
        for (int i = x-1; i <=x+1 ; i++) {
            for (int j = y-1; j <=y+1 ; j++) {
                try {if (map[i][j] == '*')
                    counter++;
                }catch (ArrayIndexOutOfBoundsException e){
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] map = new char[n][n];
        char[][] display = new char[n][n];

        for (int i = 0; i < n; i++) {
            map[i] = sc.next().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == '*')
                    display[i][j] = 'F';
                else {
                    display[i][j] = (char) mine(i, j, map);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (display[i][j] == 'F')
                    System.out.print("F");
                else
                    System.out.print(display[i][j]-0);
            }
            System.out.println();
        }

    }
}
