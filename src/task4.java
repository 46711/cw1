import java.text.DecimalFormat;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int number;
        do{
            System.out.println("Please enter positive number");
            while (!in.hasNextInt()) {
                System.out.println("That's not a valid number!");
                in.next();
            }
            number = in.nextInt();
        } while(number <= 0);

        double PI = 3.14;

        double p = 4.0 * PI * Math.pow(number, 2);
        double v = 4.0/3.0 * PI * Math.pow(number, 3);

        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println("Powierzchnia kuli: " + f.format(p));
        System.out.println("Objętość kuli: " + f.format(v));

    }
}
