import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double pcp = input.nextDouble();
        while (pcp < 1) {
            System.out.print("Please enter a valid input: ");
            pcp = input.nextDouble();
        }
        calP(pcp);
    }

    public static void calP(double pcp) {
        int month = 0;
        int year = 0;
        double store = pcp;
        do {
            if (pcp > 100000) {
                System.out.println("The interest will cover the tuition fees");
                System.exit(0);
            } else if (pcp < 500) {
                System.out.println("The account has less than 500$");
                System.exit(0);
            }
            pcp = pcp * (1 + (0.06 / 12));
            System.out.println(pcp);
            pcp -= 500;
            month++;
            if (month == 12) {
                year++;
                month = 0;
            }
        } while (pcp >= 500);
        printDate(store, month, year);
    }

    public static void printDate(double pcp, int month, int year) {
        if (month > 0 && year > 0)
            System.out.println("With the principal $" + pcp + ", the account will deplete in " + year + " years, and "
                    + month + "months");
        else if (month > 0 && year == 0)
            System.out.println("With the principal $" + pcp + ", the account will deplete in " + month + " months");
        else if (year > 0 && month == 0)
            System.out.println("With the principal $" + pcp + ", the account will deplete in " + month + " years");

    }
}