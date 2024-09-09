import java.util.Arrays;
import java.util.Scanner;

 class DataAnalysis {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);   
       //read the array len
        int n = sn.nextInt();
        int[] nub = new int[n];
        for (int i = 0; i < n; i++) {
            nub[i] = sn.nextInt();
        }
 
// check the number is contiguous or not 
//https://stackoverflow.com/questions/3988575/what-does-this-definition-of-contiguous-subsequences-mean
        if (contiguous(nub)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    
    static boolean contiguous(int[] nub) {
        // sort the array first 
        Arrays.sort(nub);
        
        // Check for gaps in the sorted sequence
        for (int i = 1; i < nub.length; i++) {
            if (nub[i] != nub[i - 1] && nub[i] != nub[i - 1] + 1) {
                return false;
            }
        }
        //[8 6 7 7 9 8 6] sort it first
        //when i=1 , leb =7
        //nub[i] != nub[i - 1] 
        //6 != 8 not equal and 6 != 8+1,9
        //repeat for exit when the nub[i] and nub[i - 1] + 1 as 
        return true;
    }
}
