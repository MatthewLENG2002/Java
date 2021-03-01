public class Exercise3 {
    static int a ;
    public static void main(String[] args) {
        System.out.println(a);
        int i = 1, j, mul;

        while (i <= 9) {
            j=1;

            while (j <=i){
                mul = i * j;
                System.out.print(j + "*" + i + "=" + mul +"    ");
                if(j == i)
                    System.out.println();
                j++;
            }


            i++;
        }


    }
}
