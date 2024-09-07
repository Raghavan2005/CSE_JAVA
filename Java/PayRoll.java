import java.util.Scanner;

 class PayRoll {

    public static void main(String[] args) {

      Scanner sn = new Scanner(System.in);
    int initsal = sn.nextInt();
    double perinc = sn.nextDouble();
     System.out.println((initsal * (perinc/100.0))+initsal);
    }

}
