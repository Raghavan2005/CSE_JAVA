class UseDefault implements Value{

   public void sayhello(){
           System.out.println("Hello");
       
   }

public static void main(String[] args){
 
Value ud = new UseDefault();
ud.sayhello();
ud.printme("Hello World");
}

}

interface Value{

  default public void printme(String msg){
    System.out.println(msg);
  }
  public void sayhello();
  
} 