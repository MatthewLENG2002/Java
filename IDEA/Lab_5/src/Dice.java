import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random generator = new Random();
        int[] frequency = new int[7];
        for(int roll = 1; roll <= 6000; roll++){
            frequency[1+ generator.nextInt(6)]++;
        }
        System.out.printf("%s%10s\n","face","Frequency");
        for(int face=1; face< frequency.length; face++){
            System.out.printf("%4d%10d\n",face,frequency[face]);
        }
        }
    }

