import java.util.Scanner;

public class switcc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day of the week (e.g., Monday, Tuesday, etc.): ");
        String day = scanner.nextLine();
        
        switch (day.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println(day + " is a weekday.");
                break;
            case "saturday":
            case "sunday":
                System.out.println(day + " is a weekend.");
                break;
            default:
                System.out.println("Invalid day entered.");
                break;
        }
        
        scanner.close();
    }
}
