import java.io.IOException;

public class TaskThree {
    public static void main(String[] args) throws IOException {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        printNumberMultipleOfThree(numbers);
        int x = System.in.read();
    }
    private static void printNumberMultipleOfThree(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%3==0){
                System.out.println(numbers[i]);
            }
        }
    }
}