import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int n=1;

        Scanner sc = new Scanner(System.in);

        while(n != 0){
            System.out.print("Enter n to display or 0 to exit: ");
            n = sc.nextInt();
            System.out.println(n);


        }
    }
}
