import java.io.IOException;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.next();
        System.out.println(printWelcome(name));
        in.close();
    }
    private static String printWelcome(String name){
        if (name.equals("Вячеслав")){
            return "Привет, Вячеслав";
        }
        return "Нет такого имени";
    }
}