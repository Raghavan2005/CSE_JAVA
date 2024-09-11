import java.util.Scanner;

class MoveallZeroes{

public static void main(String[] args){

Scanner sn = new Scanner(System.in);
int len = sn.nextInt();
int[] array = new int[len];
int numval=0;
int zeroval=0;
//
for(int i=0;i<len;i++){
array[i]=sn.nextInt();
}
//
//moving
for(int i =0;i<len;i++){
  if(array[i]!=0){
    numval++;
    
}else{zeroval++;}
}
//

int[] num = new int[numval];
int[] zero = new int[zeroval];
//sort
int indexlen=0;
int indexlen1=0;
for(int i=0;i<len;i++){
 if(array[i]!=0){
     num[indexlen]=array[i];
         indexlen++;

   }else{
     zero[indexlen1]=array[i];
indexlen1++;

   } 
 
 }


//
array = new int[len];
//adding array
int index=0;
for(int i=0;i<numval;i++){
  array[index]=num[i];
index++;
 }
for(int i=0;i<zeroval;i++){
  array[index]=zero[i];
index++;
 }
//printing
for(int i=0;i<(numval+zeroval);i++){
System.out.println(array[i]);
}



}

}