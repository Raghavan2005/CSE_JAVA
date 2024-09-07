class JavaClass extends base1 {

//main start----------------
public static void main(String[] atgs){
     
     base2 bs2 = new base1(name);
     base3 bs3 = new base1();
     printing();
     StringBuffer sb = new StringBuffer("hello world");
     String sm = new String("REC");
     System.out.println(sb);
     System.out.println(sm);
     System.out.println(bs3.add(20,50));
     System.out.println(bs3.sub(200,530));
  }
//main end----------------
//static start----------------
public static void printing(){
System.out.println("Execting Static Function");
}
//static end----------------

 }

//class base 1
class base1 extends base2{
 public static String name = "Raghavan";
base1(){
System.out.println("base 1");
}
base1(String msg){
System.out.println(msg);
}
}
//class base 1

//class base 2
class base2 extends base3{

base2(){
System.out.println("base 2");
}
}

//class base 2

//class base 3
class base3 extends hello{
public  int sub(int a,int b){return a-b;}
public  int add(int a,int b){return a+b;}
base3(){
System.out.println("base 3");
}
}
//class base 3

//class abstract 
abstract class hello{
abstract public  int sub(int a,int b); 
abstract public  int add(int a,int b);
}
//class abstract 