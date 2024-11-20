class ExceptionHandling{


public static void main(String[] args){

 try{
 int a=0,b=3;

 System.out.println(3/0);
 throw new Exception();

  }
catch(ArrayIndexOutOfBoundsException ea){
System.out.println("Array Error");
System.out.println(ea);
 }
 catch(Exception ea){
 System.out.println(ea);
 }
finally{
try{
 add();
}catch(Exception ea){
 System.out.println(ea);
 }
}
}

  static void add() throws ArrayIndexOutOfBoundsException,ArithmeticException {
 int[] a = new int[2];
 a[20]=30;
 }

}