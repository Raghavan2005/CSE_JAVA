import java.util.Scanner;

public class DuckandDisarium {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);      
        String number = sn.nextLine();
    //check the number is duck
    //https://www.naukri.com/code360/library/write-a-program-to-check-whether-a-number-is-duck-or-not-in-java#:~:text=A%20Duck%20number%20is%20a,are%20not%20considered%20Duck%20Numbers.
        boolean isDuck = isDucknumber(number);
        
        //https://www.javatpoint.com/program-to-check-disarium-number
        boolean isDisarium = isDisariumnumber(number);
        
        // it for only output , if else only in single line 
        // condition?true part : false part;
        String result = number + " is ";
        result += isDuck ? "a Duck number" : "not a Duck number";
        result += " but ";
        result += isDisarium ? "it is a Disarium number." : "it is not a Disarium number.";
        
        System.out.println(result);
    }
    

    static boolean isDucknumber(String number) {
   
        String tn = number.replaceFirst("^0+", "");//remove the first zero on the string
      
        return tn.contains("0");//then check for other 0 in the number
    }
    
 
    static boolean isDisariumnumber(String number) {
        //sometimes when it run i face run time error so i tryed it like numberformat and i do type convert inside to be safe
        try {
            int num = Integer.parseInt(number);
            int sum = 0;
            char[] digits = number.toCharArray();
            //the litter to char array
            // using the math class we can incress the power of it
            for (int i = 0; i < digits.length; i++) {
                int digit = Character.getNumericValue(digits[i]);
                sum += Math.pow(digit, i + 1);
            }
            
            return sum == num;
        } catch (Exception e) {
            
            return false;
        }
    }
}
