package util;



public interface PaymentReceiver {
    boolean acceptPayment(int amount);
    int getBalance();
    void setBalance(int balance);
    void displayOptions();
}
