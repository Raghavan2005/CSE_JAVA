import java.util.Scanner;

class Count{

	public static void main(String[] arg)	{
	Scanner sn = new Scanner(System.in);
	int length = sn.nextInt();
	int[] arr= new int[length];
	for(int i=0;i<length;i++){
	 arr[i]=sn.nextInt();
	}

	int startvalue = sn.nextInt();
 	int temp=startvalue;

	for(int i=0;i<length;i++){
	 if(startvalue==arr[i]){
	for(int j=0;j<startvalue;j++){
      
	 temp =temp*2;
	
	}
         System.out.println(temp);
	}
	
	}

	
	}
}