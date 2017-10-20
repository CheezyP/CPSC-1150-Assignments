import java.util.Scanner;

public class Arrow {
    public static void main(String[] args) {
        System.out.print("Please enter a number for the height of the head of the arrow: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        arrPrint(num);
        tailPrint(num);
        sc.close();
    }

    public static void arrPrint(int num) {
        int blank = num;
        for (int line = 0; line < num; line++) {
            blank--;
            for (int spc = 0; spc < blank; spc++) {
                System.out.print(" ");
            }
            for (int star = 0; star < num - blank; star++) {
                System.out.print("*");
            }
            for (int star2 = 0; star2 < num - blank - 1; star2++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void tailPrint(int num) {
        for (int ln = 0; ln < (int)num/2.0;ln++) {
            for (int spc = 0; spc < num-1; spc++) { 
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
