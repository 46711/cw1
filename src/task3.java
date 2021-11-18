import java.util.Arrays;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int [] inputs = new int[5];

        int number = 0;
        do {
            System.out.println("Please enter number "+(number+1)+"");
            while (!in.hasNextInt()) {
                System.out.println("That's not a number!");
                in.next();
            }
            inputs[number] = in.nextInt();
            number++;
        } while (number < 5);

        Arrays.sort(inputs);
        System.out.println(Arrays.toString(inputs));
    }
}
