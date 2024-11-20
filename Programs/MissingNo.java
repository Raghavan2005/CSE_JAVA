import java.util.Scanner;
class MissingNo{

public static void main(String[] arg){
Scanner sn = new Scanner(System.in);
int len = sn.nextInt();
int[] missarry = new int[len];
int[] naturlnumber = new int[len+4];
for(int i=0;i<len;i++){
missarry[i]=sn.nextInt();
}
int value=1;
for(int i=0;i<naturlnumber.length;i++){ //12456
naturlnumber[i]=value++; //1234
}
 
for(int i=0;i<len;i++){
if(missarry[i]!=naturlnumber[i]){
System.out.println("Missing Number :"+naturlnumber[i]);
break;
 }

}

}

}