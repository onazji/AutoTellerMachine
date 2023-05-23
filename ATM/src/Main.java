import java.util.Scanner;
public class Main {
//static = only one copy of variable belong to class
public static void exit(){
    System.out.println("You have left the ATM safely");
}
    public static void main(String[]args){
        ATM atm = new ATM();
        int quit = 0;
        // Set initial card number and PIN
        atm.setCardNumber("1234 5678 9012 3456");
        atm.setPin(1234);

        // Create scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        Scanner pressToStop = new Scanner(System.in);





        // Display welcome message and ask for PIN
        System.out.println("Welcome to the ATM.");
        System.out.print("Please enter your PIN: ");
        int enteredPin = scanner.nextInt();
    //while(quit != 'q' && enteredPin == atm.getPin()) {
        // Check if entered PIN matches the actual PIN
        while (quit != 5 && enteredPin == atm.getPin()) {






            // Display options menu
            System.out.println("Please select an option: Reminder pressing any invalid number will exit the ATM");// small bug when user inputs a char before int option
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw money");
            System.out.println("3. Deposit money");
            System.out.println("4. Change PIN");

            // Read user's selected option
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Check balance
                    atm.checkBalance();
                    break;
                case 2:
                    // Withdraw money
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdrawMoney(withdrawAmount);
                    break;
                case 3:
                    // Deposit money
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.depositMoney(depositAmount);
                    break;
                case 4:
                    // Change PIN
                    System.out.print("Enter old PIN: ");
                    int oldPin = scanner.nextInt();
                    System.out.print("Enter new PIN: ");
                    int newPin = scanner.nextInt();
                    atm.changePin(oldPin, newPin);
                    break;
                default:
                    System.out.println("Invalid option.");
                    quit = 5;
                    exit();
                    break;

            }
        }





    }
}

// sentinel loop: option.