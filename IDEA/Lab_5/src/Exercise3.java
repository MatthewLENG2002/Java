import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
      int length=0;
      boolean same=false;
        Scanner sc= new Scanner(System.in);
      System.out.print("Enter the length of array:");
        length = sc.nextInt();
      int[] List1= new int[length],List2=new int[length];

        System.out.print("Enter the 1st integer array of size "+length+":");
        for (int i = 0; i < List1.length; i++) {
            List1[i]= sc.nextInt();
        }
        System.out.print("Enter the 2st integer array of size "+length+":");
        for (int i = 0; i < List1.length; i++) {
            List2[i]= sc.nextInt();
        }

        for (int i = 0; i < length; i++) {
            if(List1[i]==List2[i])
                same = true;
            else {
                same = false;
                break;
            }
        }

        if(same)
            System.out.println("The two arrays are equal.");
        else
            System.out.println("The two arrays are not equal.");
    }
}
