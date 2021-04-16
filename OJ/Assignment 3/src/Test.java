import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][] test = new int[5][5];
        test[0] = new int[]{1, 2, 3, 4, 5};
        test[1] = new int[]{2, 3, 4, 5, 6};
        test[2] = new int[]{3, 4, 5, 6, 7};
        test[3] = new int[]{4, 5, 6, 7, 8};
        test[4] = new int[]{5, 6, 7, 8, 9};

        System.out.println(Arrays.deepToString(test));

    }
}
