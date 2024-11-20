import java.util.Scanner;

 class StrongNumber {

     static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
    
        int number = sn.nextInt();
        int originalnumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10; 
            sum += factorial(digit); 
            number /= 10; 
        }
        
        if (sum == originalnumber) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a strong number");
        }
        

    }
}
