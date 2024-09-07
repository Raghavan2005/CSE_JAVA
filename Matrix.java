import java.util.Scanner;
class Matrix{

public static void main(String[] arg){
Scanner sn = new Scanner(System.in);
int len = 3;
int[] matrix1 = new int[3];
int[] matrix2 = new int[3];
int[] matrix3 = new int[3];

for(int i=0;i<len;i++){
matrix1[i]=sn.nextInt();  //line 1 123
}
for(int i=0;i<len;i++){
matrix2[i]=sn.nextInt(); //line 2 456
}
for(int i=0;i<len;i++){
matrix3[i]=sn.nextInt(); //line 3 789
}

for(int i=0;i<len;i++){
System.out.println(matrix1[i]+" "+matrix2[i]+" "+matrix3[i]);
}

}

}