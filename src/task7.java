import java.util.Scanner;

public class task7 {

    Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        task7 task7 = new task7();
        task7.outputFibonacciSequence(task7.getNumber());

    }

    private int getNumber()
    {
        int number;

        do{
            System.out.println("Please enter positive number");
            while (!in.hasNextInt()) {
                System.out.println("That's not a valid number!");
                in.next();
            }
            number = in.nextInt();
        } while(number <= 0);

        return number;

    }

    private void outputFibonacciSequence(int n){

        int f0 = 0;
        int f1 = 1;
        int fn = 0;
        if(n != f0){
            if(n == f1) fn = f1;
            else {

                for(int i = 0; i < n - 1; i++){
                    fn = f0 + f1;
                    f0 = f1;
                    f1 = fn;
                }

            }
        };

        System.out.println(fn);
    }
}
