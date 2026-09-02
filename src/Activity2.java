import java.util.Scanner;

public class Activity2 {

    Scanner sc = new Scanner(System.in);

    public void start() {

        double basePrice = 0;
        double peakFee = 0;
        String format = "";

        System.out.println("=== CINEMA TICKET SYSTEM ===");

        System.out.print("Select Format (1: REGULAR, 2: 3D, 3: IMAX): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            format = "REGULAR";
            basePrice = 350;

        } else if (choice == 2) {
            format = "3D";
            basePrice = 400;

        } else if (choice == 3) {
            format = "IMAX";
            basePrice = 450;

        } else {
            System.out.println("Invalid Format!");
            return;
        }

        System.out.print("Enter Screening Hour (24-Hour Format, e.g., 18): ");
        int hour = sc.nextInt();

        // Peak hours: 5 PM to 8 PM
        if (hour >= 17 && hour <= 20) {
            peakFee = 50;
        }

        double totalCost = basePrice + peakFee;

        System.out.println();
        System.out.println("--- TICKET BREAKDOWN ---");
        System.out.println("Screening Format: " + format);
        System.out.printf("Base Ticket Price: PHP %.2f%n", basePrice);
        System.out.printf("Peak Hour Fee:     PHP %.2f%n", peakFee);
        System.out.println("--------------------------------");
        System.out.printf("TOTAL TICKET COST: PHP %.2f%n", totalCost);
        System.out.println("STATUS:            SEAT RESERVED");
    }
}
