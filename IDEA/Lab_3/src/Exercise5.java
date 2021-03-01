import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        double pai=0;
        int n, i=1;

        System.out.print("Please input the precision:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while(i <= n ){
            pai = pai + 4 * Math.pow(-1,i+1)/(2*i-1);
            i++;
        }
        System.out.println("The estimation of Pi is " + pai);
        System.out.println("It computed " + i + "times");
    }
}
