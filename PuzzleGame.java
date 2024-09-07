import java.util.Scanner;

 class PuzzleGame {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int on = sn.nextInt();
        int rn = reversenumber(on);
        String msg1="The reversed number is ";

        if (rn == on) {
            System.out.println(msg1+ rn + ". It is the same as the original.");
        } else {
            System.out.println(msg1 + rn + ". It is not the same as the original.");
        }


    }


     static int reversenumber(int or) {
        int rev = 0;
    
        while (or != 0) {
            int number = or % 10; 
            rev = rev * 10 + number; 
            or /= 10; 
        }

        return rev;
    }
}
