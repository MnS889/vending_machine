package util;



public class CoinReceiver implements PaymentReceiver{
    private int balance;

    public CoinReceiver(){
        this.balance = 0;
    }
    @Override
    public boolean acceptPayment(int amount) {
        if (amount == 10 || amount == 50 || amount == 100){
            balance += amount;
            return true;
        }else {
            System.out.println("Автомат не принимает такие монеты");
        }return false;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void displayOptions() {
        System.out.println("Вставьте монеты достоинством 10, 50 или 100");
    }


}
