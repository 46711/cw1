import java.util.ArrayList;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args){

        String[] myListArray = {"test0","test1", "test2", "test3", "test4", "test5", "test6", "test7"};
        ArrayList<String> outputList = new ArrayList<String>();
        Scanner in = new Scanner(System.in);

        for (String item: myListArray) {
            System.out.println("Enter "+item+":");
            outputList.add(item + ": "+ in.next());
        }
        System.out.print(String.join(", ", outputList));
    }

}
