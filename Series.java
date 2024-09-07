import java.util.Scanner;

 class Series {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        int var = sn.nextInt();
        
            
        for (int i = 0; i < var; i++) {
           int a = sn.nextInt();
            int b = sn.nextInt();
            int n = sn.nextInt();
            
            int[] value = new int[n];
            
            
            for (int j = 0; j < n; j++) {
                int suum = 0;
                for (int k = 0; k <= j; k++) {
                    suum += (1 << k) * b;  
                }
                value[j] = a + suum;
            }
            
       
            for (int j = 0; j < n; j++) {
                if (j > 0) System.out.print(" ");
                System.out.print(value[j]);
            }
            System.out.println();
            
        }
  
      
    }
}
