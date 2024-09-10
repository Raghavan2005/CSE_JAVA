class DiamondProblemSolution extends baseclass{
 public void print(){
        System.out.println("Hello World Main Class");
    }
    public static void main(String args[]){
DiamondProblemSolution bc = new DiamondProblemSolution(); 
bc.print();

    }
}

class baseclass implements value1,value2{
    public void print(){
        System.out.println("Hello World");
    }
}

interface value1 {
    public void print();
}
interface value2 {
   public void print();
}