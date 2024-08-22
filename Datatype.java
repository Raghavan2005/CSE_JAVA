import java.util.Scanner;

 class Datatype {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           long number=0;
            try {
                 number = scanner.nextLong();
                System.out.println(number + "can be fitted:");
            
                if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
               
                }
                if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
                    System.out.println("* short");
                 
                }
                if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                    
                }
                if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
                    System.out.println("* long");
                   
                }

            } catch (Exception e) {
                System.out.println(number + "can't be fitted.");
            }
     
    }
}
