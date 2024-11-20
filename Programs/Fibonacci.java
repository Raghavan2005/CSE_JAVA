import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        //https://en.wikipedia.org/wiki/Fibonacci_sequence
        //enter the element
        int n = sn.nextInt();

        List<Integer> fibonacciseries = genfib(n);
        System.out.println(fibonacciseries);
    }
    // Fibonacci series
    static List<Integer> genfib(int n) {
        List<Integer> series = new ArrayList<>();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            series.add(a);
            int next = a + b;
            a = b;
            b = next;
        }
        return series;
    }
}
