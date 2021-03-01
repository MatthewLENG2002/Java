import java.util.Scanner;

public class Exercise5_plus {
    public static void main(String[] args) {
        double pai1=0, pai2=0, pre, dif=1;
        int i=1;

        System.out.print("Please input the precision:");
        Scanner sc = new Scanner(System.in);
        pre = sc.nextDouble();

        while(dif > pre ){
            pai2 = pai1 + 4 * Math.pow(-1,i+1)/(2*i-1);
            i++;
            dif = Math.abs(pai2 - pai1);
            pai1 = pai2;

        }
        System.out.println("The estimation of Pi is " + pai2);
        System.out.println("It computed " + i + " times");
    }
}
