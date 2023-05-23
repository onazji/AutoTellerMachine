public interface ATMInterface {
    void checkBalance();//doesnt return anything. Prints the current
    void withdrawMoney(double amount);

    void depositMoney(double amount);
    void changePin(int oldPin, int newPin);
}
