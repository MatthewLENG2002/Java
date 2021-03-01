import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        float width, height, area, perimeter;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the width of a rectangle: ");
        width = input.nextFloat();
        System.out.print("Enter the height of a rectangle: ");
        height = input.nextFloat();

        area = width * height;
        perimeter = 2 * (width + height);

        System.out.printf("%s%f%n","The area is ", area);
        System.out.printf("%s%f%n","The perimeter is ", perimeter);

    }
}
