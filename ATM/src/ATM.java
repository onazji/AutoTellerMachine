public class ATM implements ATMInterface{
    private String cardNumber;
    private int pin;
    private double balance;


    @Override
    public void checkBalance() {
        System.out.println("Your current balance is: "+balance);
    }

    @Override
    public void withdrawMoney(double amount) {
        if(balance == 0) {
            System.out.println("No available funds!");
        }
        if(amount < balance) {
            balance -= amount;
            System.out.println("Withdrew :" + amount + " from balance with no overdraft");
        }
    }

    @Override
    public void depositMoney(double amount) {
        balance += amount;
        System.out.println("You have deposited: "+ amount+". Thanks!");
        System.out.println("Your current balance is: "+balance);
    }

    @Override
    public void changePin(int oldPin, int newPin) {
    if(oldPin == pin){
        pin = newPin;
    }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
