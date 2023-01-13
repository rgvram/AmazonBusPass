package operations;
import java.util.Scanner;

/*
* Home page or the Outer layer
*
* Menu :
* 1. Admin
* 2. User
* 3. Visitor
*
*/

public class AppDriver {
    public void initiate(){
        boolean exitCode = false;
        String welcomeMessage = "Welcome to Amazon's BusPass Management Application";
        System.out.println(welcomeMessage);
        Scanner inputObj = new Scanner(System.in);
        while (!exitCode){
            System.out.println("\nChoose your category :");
            System.out.println("\n1. Admin\n2. User\n3. Visitor\n4. Exit\n");
            int choice = inputObj.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Welcome Administrator\n");
                    // Admin code
                    // OperationFactory.getAdminLoginInstance().showMenu();
                    break;
                case 2:
                    System.out.println("Welcome User\n");
                    break;
                case 3:
                    System.out.println("Welcome Visitor\n");
                    break;
                case 4:
                    System.out.println("You have chosen to exit\n");
                    exitCode = true;
                    break;
                default:
                    System.out.println("Incorrect input: Please enter a valid operation\n");
            }
        }
        inputObj.close();// closing scanner class object
        System.out.println("Exiting now, Thank you.");
    }
}
