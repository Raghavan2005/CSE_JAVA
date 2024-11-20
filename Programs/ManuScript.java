import java.util.HashSet;
import java.util.Scanner;

 class ManuScript {
    
     static int logestvowel(String s, int j) {
        if (j < 1 || j > 5) return -1; //j=2 or condition

        int n = s.length(); // hello - 5
        int maxLength = -1; 
        
        for (int start = 0; start < n; start++) {
             HashSet<Character> vowelset = new HashSet<>(); //https://www.geejsforgeejs.org/hashset-in-java/
        
            for (int end = start; end < n; end++) {
                char c = s.charAt(end);
                if (isvowel(c)) vowelset.add(c);
                
                if (vowelset.size() == j) {
                    maxLength = Math.max(maxLength, end - start + 1);
                } else if (vowelset.size() > j) {
                    break; 
                }
            }
        }
        
        return maxLength;
    }

     static boolean isvowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        // Input
        String s = sn.nextLine();
        System.out.println("Enter the number of  vowels:");
        int j = sn.nextInt();

        // Output
        int result = logestvowel(s, j);
        System.out.println(result);

    }
}
