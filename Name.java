import java.util.Scanner;
class Name implements I1{

// define---------------
public int add(int a,int b){
      return a+b;    
      }
public int add(int a,int b,int c){
      return a+b*2;    
      }
public int sub(int a,int b){
      return a+b;    
      }
public int sub(){

      return 30+23+60;    
      }
public int mult(int a,int b){
      return a*b;    
      }
public int div(int a,int b){

      return a/b;    
      }

//define end -------------------

//main start --------------
public static void main(String[] arg){
//object start
Scanner sn = new Scanner(System.in);
I1 obj = new Name();
Name ogobj = new Name();
baseclass open = new subclass();
I2 obj1 = new Name();
open.dis1();
//object end

int m = sn.nextInt();

//print start
System.out.println(obj.add(obj1.value,obj.value));
System.out.println(obj.add(obj1.value,obj.value,20));
System.out.println(obj.sub(m,I2.I3.I3Value1));
System.out.println(ogobj.sub());
//print end
}
//main end --------------
}
//i1----------------------------
interface I1 extends I2{
final String name="hello";
final int value=500;
public int add(int a,int b);
public int add(int a,int b,int c);
public int sub(int a,int b);

}
//
//i2-----------------------
interface I2{

final int value=3;
public int mult(int a,int b);
public int div(int a,int b);
interface I3{

final int I3Value1=30;
final int I3Value2=8;
}

//i3-----------------------
}

//---------------------- 
class baseclass{

public void dis1(){
System.out.println("baseclass me Called");
}
baseclass(String name){
System.out.println(name);}

}

//-------------------------------
class subclass extends baseclass {
subclass(){
super("hello world");
System.out.println("subclass Called");

}                                                                                                                                          vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
public void dis1(){
System.out.println("subclass me Called");
}
}

//------------------------------------

