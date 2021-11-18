import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int [] inputs = new int[3];

        int number = 0;
        do {
            System.out.println("Please enter a number "+(number+1)+"");
            while (!in.hasNextInt()) {
                System.out.println("That's not a number!");
                in.next();
            }
            inputs[number] = in.nextInt();
            number++;
        } while (number < 3);

        System.out.println(Arrays.stream(inputs).max().getAsInt());
    }
}
