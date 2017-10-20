public class Quiz2 {
    public static void main(String[] args) {
        double a = 1.85;
        double b = 1.34;
        part1(a, b);
        part2(a, b);
    }

    public static void part1(double a, double b) {
        double p1 = Math.pow(b, 2) / (a + b);
        double p2 = Math.sqrt(a * b + (a / Math.sqrt(1 + Math.pow(b, 3))));
        double p3 = 1 + (a + b) / b;
        double x = (p1 + p2) / p3;
        System.out.println("x = " + x);
    }

    public static void part2(double a, double b) {
        double p1 = Math.cos(b * Math.pow(a, 2));
        double p2 = Math.sin(a * b);
        double p3 = Math.PI * Math.cos(a * b);
        double y = (p1 + p2) / p3;
        System.out.println("y = " + y);
    }
}