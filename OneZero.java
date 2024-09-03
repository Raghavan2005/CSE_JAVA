import java.util.Scanner;

 class OneZero {
    public static void main(String[] arg) {
        Scanner sn = new Scanner(System.in);
    
        int n = sn.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            int startDigit = i % 2; 
            
            for (int j = 1; j <= i; j++) {
                System.out.print(startDigit + " ");
               
                startDigit = 1 - startDigit; 
            }
    
            System.out.println();
        }
 
    }
}
