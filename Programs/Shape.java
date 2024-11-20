import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        // Read the input from user
        System.out.print("Circle/Rectangle/Triangle \n");
        String shapeyype = sn.nextLine().trim().toLowerCase();
  
        double area = 0;

        switch (shapeyype) {
            case "circle":
                System.out.print("Enter the radius: ");
                double radius = sn.nextDouble();
                area = CalculateCircleArea(radius);
                System.out.println((int) area); 
                break;

            case "rectangle":
                System.out.print("Enter the length: ");
                double length = sn.nextDouble();
                System.out.print("Enter the width: ");
                double width = sn.nextDouble();
                area = CalculateRectangleArea(length, width);
                System.out.println((int) area); 
                break;

            case "triangle":
                System.out.print("Enter the base: ");
                int base = sn.nextInt();
                System.out.print("Enter the height: ");
                int height = sn.nextInt();
                area = CalculateTriangleArea(base, height);
                System.out.println(area);
                break;

            default:
                System.out.println("Unknown");
                break;
        }

     
    }


    static double CalculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

   
    static double CalculateRectangleArea(double length, double width) {
        return length * width;
    }

  
    static double CalculateTriangleArea(int base, int height) {
        return 0.5 * base * height;
    }
}
