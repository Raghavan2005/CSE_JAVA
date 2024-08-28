import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        List<List<Integer>> pt = generatePascalTriangle(n);

        printPatten(pt, n);
    }

    
     static List<List<Integer>> generatePascalTriangle(int n) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1); 
            for (int j = 1; j < i; j++) {
                List<Integer> prevRow = triangle.get(i - 1);
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            
            if (i > 0) {
                row.add(1); 
            } 
        
            triangle.add(row);
        }
        
        return triangle;
    }

    
     static void printPatten(List<List<Integer>> pascalTriangle, int n) {
       
        for (int i = 0; i < n; i++) {
            printRow(pascalTriangle.get(i), n);
        }
        
        
        for (int i = n - 2; i >= 0; i--) {
            printRow(pascalTriangle.get(i), n);
        }
    }

 
     static void printRow(List<Integer> row, int n) {
        int numSpaces = n - row.size();
        for (int i = 0; i < numSpaces; i++) {
            System.out.print(" "); 
        }
         
        for (int nums : row) {
            System.out.print(nums + " "); }
        
        System.out.println(); 
    }
}
