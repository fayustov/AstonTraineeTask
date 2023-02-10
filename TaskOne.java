import java.io.IOException;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        System.out.println(printWelcome(num));
        in.close();
    }
    private static String printWelcome(int number){
        if (number>=7){
            return "Привет";
        }
        return "";
    }
}