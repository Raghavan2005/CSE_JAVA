import java.util.Scanner;
import java.text.DecimalFormat;

 class FinancialApp {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter in cents: ");
        int cents = sn.nextInt();
        double dollars = cents / 100.0;
        DecimalFormat f = new DecimalFormat("0.00");
        System.out.println(f.format(dollars));
    }
}
