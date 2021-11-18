import java.text.DecimalFormat;
import java.util.Scanner;

public class task5 {

    Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        task5 task5 = new task5();

        int amount = task5.setInputValue("amount of loan", 50000);
        int months = task5.setInputValue("number of months", 48);

        task5.countMonthRate(amount, months);

    }

    public int setInputValue(String type, int max){

        int output;
        boolean alert = false;
        System.out.println("Please enter " + type + ", max: " + max);
        do {
            if(alert) System.out.println("That's not a valid number!");
            while (!in.hasNextInt()) {
                System.out.println("That's not a valid number!");
                in.next();
            }
            output = in.nextInt();
            alert = true;
        } while(output <= 0 || output > max);

        return output;
    }

    private void countMonthRate(int amount, int months){

        double rate = this.getRate(months);

        double loan = rate * amount + amount;

        double monthlyPayment = loan / months;

        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println("The monthly instalment is " + f.format(monthlyPayment));

    }

    private double getRate(int months){

        if(months <= 12) return 0.03;
        else if(months <= 24) return 0.06;
        else return 0.1;

    }
}
