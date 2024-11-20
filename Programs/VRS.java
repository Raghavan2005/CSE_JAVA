import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class VRS {

    public static String genPlate(String s) {
      
        List<Character> upperLetters = new ArrayList<>();
        List<Character> lowerLetters = new ArrayList<>();

        //divided the uppercasee and lowercase letter into two lines
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperLetters.add(c);
            } else if (Character.isLowerCase(c)) {
                lowerLetters.add(c);
            }
        }
           // and sort it
        
        Collections.sort(upperLetters);
        Collections.sort(lowerLetters);

        // do the result on sung string buffer
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        while (i < upperLetters.size() || j < lowerLetters.size()) {
            if (i < upperLetters.size()) {
                result.append(upperLetters.get(i++));
            }
            if (j < lowerLetters.size()) {
                result.append(lowerLetters.get(j++));
            }
        }
// append the each char
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);

        System.out.println("Enter the license plate :");
        String s = sb.nextLine();

        String result = genPlate(s);
        System.out.println(result);

    }
}
