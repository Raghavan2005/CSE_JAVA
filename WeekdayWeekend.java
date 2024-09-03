import java.util.Scanner;

 class WeekdayWeekend {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        String day = sn.nextLine().toLowerCase();
        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("It's a weekday");
                break;
            case "saturday":
            case "sunday":
                System.out.println("It's a weekend");
                break;
            default:
                System.out.println("Invalid day");
                break;
        } 
        

    }
}
