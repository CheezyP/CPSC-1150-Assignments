import java.util.Scanner;

class Lab4 {
    final static int TRIANGLE_CHOICE = 1;
    final static int CIRCLE_CHOICE = 2;

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int userOption = menuInterface(userInput);
        menuSelection(userOption, userInput);
        userInput.close();
    }

    public static int menuInterface(Scanner userInput) {
        System.out.println("This program determines the perimeter of a triangle, a circle, or a line");
        System.out.println("Choose one of the following options" + "\n1.Triangle" + "\n2.Circle"
                + "\nAny other input will close the program");
        System.out.println("Please enter your option: ");
        return userInput.nextInt();
    }

    public static void menuSelection(int userOption, Scanner scanner) {
        switch (userOption) {
        case 1:
            System.out.println("You have selected Triangle");
            triangleOption(scanner);
            break;
        case 2:
            System.out.println("You have selected Circle");
            circleOption(scanner);
            break;
        default:
            System.out.println("The program will now close, thank you!");
            System.exit(0);
        }
    }

    public static void triangleOption(Scanner pointScanner) {
        double x1, x2, x3, y1, y2, y3;
        System.out.print("Please enter the x-coordinate of point 1: ");
        x1 = pointScanner.nextDouble();
        System.out.print("Please enter the y-coordinate of point 1: ");
        y1 = pointScanner.nextDouble();
        System.out.print("Please enter the x-coordinate of point 2: ");
        x2 = pointScanner.nextDouble();
        System.out.print("Please enter the y-coordinate of point 2: ");
        y2 = pointScanner.nextDouble();
        System.out.print("Please enter the x-coordinate of point 3: ");
        x3 = pointScanner.nextDouble();
        System.out.print("Please enter the y-coordinate of point 3: ");
        y3 = pointScanner.nextDouble();
        System.out.println("The perimeter of a Triangle with point1 (" + x1 + ", " + y1 + "), point2 (" + x2 + ", " + y2
                + "), point3 (" + x3 + ", " + y3 + ") is " + pCalculation(x1, x2, x3, y1, y2, y3));
    }

    public static double pCalculation(double x1, double x2, double x3, double y1, double y2, double y3) {
        double s1, s2, s3;
        return s1 + s2 + s3;
    }

    public static void circleOption(Scanner pointScanner) {

    }
}