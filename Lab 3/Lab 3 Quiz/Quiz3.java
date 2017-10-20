public class Quiz3 {
    public static void main(String[] args) {
        int x = 10;
        int n = 50;
        y(n);
        z(x, n);
    }

    public static void y(int n) {
        double y = 0;
        for (double i = 0; i <= n; i++) {
            double sum = (i + 1) / (i + 2);
            y += sum;
        }
        System.out.println(y);
    }

    public static void z(int x, int n) {
        double z = 0;
        for (double i = 1; i <= n; i++) {
            double sum = (x + i) / (Math.pow(x, i));
            z += sum;
        }
        System.out.println(z);
    }
}