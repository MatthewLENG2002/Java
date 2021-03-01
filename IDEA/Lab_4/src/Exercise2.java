import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int credits, score, total = 0, ref, tcredits = 0, exit;
        double gpa;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 to enter or -1 to exit: ");
        exit = sc.nextInt();

        while (exit != -1) {
            System.out.print("Enter the credits of the course or -1 to calculate: ");
            credits = sc.nextInt();
            if (credits == -1)
                break;
            System.out.print("Enter the score of the course: ");
            score = sc.nextInt();

            ref = score / 10;

            switch (ref) {
                case 10:
                case 9:
                    total = total + credits * 4;
                    break;
                case 8:
                    total = total + credits * 3;
                    break;
                case 7:
                    total = total + credits * 2;
                    break;
                case 6:
                    total = total + credits * 1;
                    break;
                default:
                    break;
            }
            tcredits = tcredits + credits;
        }
        gpa = (double) total / tcredits;
        System.out.println("The final GPA is " + gpa);
    }
}
