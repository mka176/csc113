package project113;
import java.util.*;
public class ATMsystem {
static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

// add ATM obj
ATM atm=new ATM("QuickTeller ATM" , "Located in Riyadh" , "RYD001", 50000);

// Ask the user if they want to log in or sign up
        System.out.println("Welcome to the ATM System!");
        System.out.println("1. Log in");
        System.out.println("2. Sign up");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
               System.out.println("You chose to log in.") 
                do {
    System.out.println("Please enter your account ID:");
    int id = input.nextInt();
    
    // Search for the customer and return the object
    Customer foundCustomer = atm.searchCustomer(id);
    
    if (foundCustomer != null) {
        boolean validPIN = false;
        do {
            System.out.println("Please enter your PIN:");
            int pin = input.nextInt();
            
            // Validate the PIN
            if (atm.validatePIN(pin, foundCustomer)) {
                System.out.println("You have successfully logged in. Welcome, " + foundCustomer.getName());
                validPIN = true;
                loggedIn = true;
            } else {
                System.out.println("Invalid PIN. Please try again.");
            }
        } while (!validPIN); // Repeat until a valid PIN is entered
    } else {
        System.out.println("Invalid Account ID. Please try again.");
    }
} while (!loggedIn); // Repeat until the user successfully logs in
                 
                break;
            case 2:
                System.out.println("You chose to sign up.");
//add customer obj
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 for log in or 2 for sign up.");
        }
	}

}
