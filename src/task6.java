import java.util.Scanner;

public class task6 {

    Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        task6 task6 = new task6();
        double num1 = task6.getNumber("Enter first number");
        String operator = task6.getOperator();
        double num2 = task6.getNumber("Enter second number");

        if(operator.equals("-") && num2 == 0) {
            System.out.println("You can't divide by zero!");
        } else {
            task6.calculate(operator, num1, num2);
        }

    }

    private String getOperator(){

        String operator;

        System.out.println("Enter the operator (+, -, *, /)");
        operator = in.next();
        while (!this.isValidOperator(operator)) {
            System.out.println("That's not a valid operator!");
            operator = in.next();
        }

        return operator;

    }

    private boolean isValidOperator(String operator){

        return operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/");

    }

    private double getNumber(String info){

        System.out.println(info);

        while(!in.hasNextDouble()){
            System.out.println("That's not a valid number!");
            in.next();
        }

        return in.nextDouble();

    }

    private void calculate(String operator, double num1, double num2){

        switch(operator)
        {
            case "+" -> System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1 + num2));
            case "-" -> System.out.printf("%.2f - %.2f = %.2f", num1, num2, (num1 - num2));
            case "*" -> System.out.printf("%.2f * %.2f = %.2f", num1, num2, (num1 * num2));
            case "/" -> System.out.printf("%.2f / %.2f = %.2f", num1, num2, (num1 / num2));
        }

    }
}
