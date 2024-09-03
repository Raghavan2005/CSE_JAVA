import java.util.Scanner;

 class OneNumber {
    public static void main(String[] arg) {
        Scanner sn = new Scanner(System.in);
    
        int n = sn.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
    
            int m=1;
            for (int j = n; j >= i; j--) {
               
                System.out.print( m++); 
            }
    
            System.out.println();
        }
 
    }
}