import java.util.Scanner;
class PalindromeString{

public static void main(String args[]){
 Scanner sn = new Scanner(System.in);
 String value = sn.nextLine();

StringBuffer sb = new StringBuffer(value);
String revstr = sb.reverse().toString().toLowerCase();	
if(revstr.equals(sb.toString().toLowerCase())){
System.out.println(true);
}
else
{
System.out.println(false);
} 

}

}