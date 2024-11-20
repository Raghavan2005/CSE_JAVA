import java.util.Scanner;
class RomanNumerals{
    
        
     public static void main(String arg[]){

 Scanner sn = new Scanner(System.in);
     String value = sn.nextLine();
value=value.toUpperCase();
     StringBuffer sb = new StringBuffer(value);	
     
     char[] arraylist = new char[sb.length()];
     for(int i =0 ;i<sb.length();i++){
       arraylist[i]=sb.charAt(i);
        }
      
int totalsum=0;
for(int i =0 ;i<sb.length();i++){
    
switch(arraylist[i]){

case 'I':
totalsum+=1;
break;
case 'V':
totalsum+=5;
break;
case 'X':
totalsum+=10;
break;
case 'L':
totalsum+=50;
break;
case 'C':
totalsum+=100;
break;
case 'D':
totalsum+=500;
break;
case 'M':
totalsum+=1000;
break;
default:
System.out.println(arraylist[i]+" "+"Invaild");
break;


}


 }
System.out.println(totalsum);


}

    
     
 }