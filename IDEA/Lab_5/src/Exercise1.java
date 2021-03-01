import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of myList1: ");
        int length=sc.nextInt();
        double[] myList1= new double[length], myList2 = new double[length];
        System.out.print("Enter " +length+" values: ");

        for (int i = 0; i < myList1.length; i++) {
            myList1[i]=sc.nextDouble();
        }
        for (int e = 0; e < (myList2.length-1); e++) {
            myList2[e+1]=myList1[e];
            myList2[0] = myList1[length-1];
        }
//        for(double i: myList1){
//            System.out.print(i+" ");
//        }
        printArr(myList1);
        printArr(myList2);
    }

    static void printArr(double[] arr){
        for(double i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
