class Staticmethod implements Value{

  public void sayhello(){
           System.out.println("Hello");
       
   }

public static void main(String[] args){
 
Value ud = new Satticmethod();
ud.sayhello();
Value.printme("Hello World");
}
}

interface Value{

  static public void printme(String msg){
    System.out.println(msg);
  }
  public void sayhello();
  
} 