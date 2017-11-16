import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n = takeInput(userInput);
        whileLoop(n);
        userInput.close();

    }

    public static int takeInput(Scanner userInput) {
        System.out.print("Enter the n value: ");
        int n = userInput.nextInt();
        while (n % 2 == 0) {
            System.out.print("Please enter an odd value: ");
            n = userInput.nextInt();
        }
        return n;
    }

    public static void whileLoop(int n) {
        double y;
        double value;
        while (n > 0) {
            y = 0;
            value = n;
            while (value > 0) {
                y += (value + 1) / value;
                value -= 2;
            }
            printAnswer(n, y);
            n -= 2;
        }
    }

    public static void printAnswer(int n, double y) {
        System.out.println("n = " + n + " , y = " + y);
    }
}