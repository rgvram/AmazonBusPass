package operations;

import Managers.BusManager;
import Managers.SeatManager;

import java.util.Scanner;

/* Visitor class
 * Visitors are users who do not have an account and want to see general information
 *
 */
public class VisitorOperation {
    public boolean showMenu(){
        boolean exitCode = false;
        Scanner inputObj = new Scanner(System.in);
        while (!exitCode) {
            System.out.println("\nChoose your category :");
            System.out.println("\n1. View details for Available routes and buses\n" +
                    "2. Display Seat Availability\n" +
                    "0. Exit to Main Menu " );
            int choice = inputObj.nextInt();
            switch (choice) {
                case 0:
                    // Exit out of Visitor menu
                    System.out.println("You have chosen to exit\n");
                    exitCode = true;
                case 1:
                    // code to display bus timings and routes
                    displayBusTimingRoutes();
                    System.out.println();
                case 2:
                    // code for display of seat availability
                    displaySeatAvailability();
                    System.out.println();
                default:
                    System.out.println("Invalid input, please inter valid input");
            }
        }
        System.out.println("Returning to previous Menu\n");
        inputObj.close();
        return true;
    }
    private void displaySeatAvailability() {
        System.out.println("Seats availible <,code not implemented>>");
        //SeatManager.getInstance().displaySeatPerRoute();
    }
    private void displayBusTimingRoutes() {
        // BusManager.getInstance().displayBusTimingsAndRoutes();
        System.out.println("bus timing & routes <<code to be implemented");
    }
}
