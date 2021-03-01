import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        int lengthc=0,counter=0;
//        int[] list= new int[lengthc];
//        System.out.println("Enter the integers between 1 and 100:");
//        for (int i = 0; i < list.length; i++) {
//            list[i]= sc.nextInt();
//            counter++;
//            if(list[i]==0)
//                break;
//        }
//        lengthc=counter;
//        System.out.println(Arrays.toString(list));

//        int[] arr = new int[101];
 //       for(;;){
//            if(sc.nextInt()==0)break;
//            arr[sc.nextInt()]++;
 //       }

        ArrayList<Double> arrayList = new ArrayList<Double>();
 //       LinkedList<Integer> linkedList = new LinkedList<Integer>();

// ArrayList add
        //long startTime = System.nanoTime();

        Random rand =new Random(100);
        double k;


        while (true) {
            k=rand.nextDouble();
            if(k<=0.9)
               arrayList.add(k);
            else
                break;
        }
        System.out.println(arrayList.size());
        System.out.println(arrayList.toString());
    }
}
