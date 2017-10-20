import java.util.*;

public class QEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A:");
        double a = in.nextInt();
        System.out.print("Enter B:");
        double b = in.nextDouble();
        System.out.print("Enter C:");
        double c = in.nextDouble();
        System.out.print(a + "x^2 + " + b + "x + " + c + " = 0 has ");
        root(a, b, c);
    }

    public static void root(double a, double b, double c) {
        if (a == 0) {
            a = -(c / b);
            System.out.println("1 root: " + a);
            System.exit(0);
        }
        double dis = Math.pow(b, 2) - (4 * a * c);
        double x1 = (-b + Math.sqrt(dis)) / (2 * a);
        double x2 = (-b - Math.sqrt(dis)) / (2 * a);
        print(x1, x2, dis);
    }

    public static void print(double x1, double x2, double dis) {
        if (dis < 0)
            System.out.println("no real roots");
        if (dis > 0)
            System.out.println("2 real roots: " + x1 + ", " + x2);
        if (dis == 0) {
            if (x1 > 0 && x2 < 0)
                System.out.println("1 real roots: " + x1);
            if (x2 > 0 && x1 < 0)
                System.out.println("1 real roots: " + x2);
        }
    }
}