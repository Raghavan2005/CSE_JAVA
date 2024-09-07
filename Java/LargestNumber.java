import java.util.Scanner;

 class LargestNumber {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
      
        int N = sn.nextInt();
        String numstr = String.valueOf(N);
        
        int smallestdigit = Character.getNumericValue(numstr.charAt(0));
        int largestdigit = Character.getNumericValue(numstr.charAt(0));
        
        for (int i = 1; i < numstr.length(); i++) {
            int digit = Character.getNumericValue(numstr.charAt(i));
            if (digit < smallestdigit) {
                smallestdigit = digit;
            }
            if (digit > largestdigit) {
                largestdigit = digit;
            }
        }
        System.out.println(smallestdigit + " " + largestdigit);
        
        
    }
}
