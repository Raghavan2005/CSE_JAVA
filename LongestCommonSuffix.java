import java.util.Scanner;
class LongestCommonSuffix{

public static void main(String args[]){
 Scanner sn = new Scanner(System.in);
 int len = sn.nextInt();
 String[] values = new String[len+1];
 for(int i =0;i<=len;i++){
values[i]=sn.nextLine().toLowerCase();
 }
 for(int i =0;i<=len;i++){
 
 if(values[i].endsWith("ing")&&i==len){
 System.out.println("'ing'"); 
 }
 }
}

}