import java.util.Scanner;
import java.util.Arrays;
class MergeandSort{

public static void main(String[] arg){
Scanner sn = new Scanner(System.in);
int len1 = sn.nextInt();
int[] arr1 = new int[len1];
for(int i=0;i<len1;i++){
arr1[i]=sn.nextInt(); }
System.out.println();
int len2 = sn.nextInt();
int[] arr2 = new int[len2];
for(int i=0;i<len2;i++){
arr2[i]=sn.nextInt(); }
int[] arrmain = new int[len1+len2];
System.out.println();
int index=0;
for(int i=0;i<len1;i++){
  arrmain[index]=arr1[i];
index++;
 }
for(int i=0;i<len2;i++){
  arrmain[index]=arr2[i];
index++;
 }

System.out.println();
Arrays.sort(arrmain);
// print merged list
for(int elent :arrmain){
  System.out.println(elent);
 }
//-----------------------

}

}