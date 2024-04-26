package util;



import java.util.InputMismatchException;
import java.util.Scanner;

public class CardReceiver implements PaymentReceiver{
    private int balance;

    private Scanner scan;

    public  CardReceiver(){
        this.balance = 0;
        this.scan = new Scanner(System.in);
    }
    @Override
    public boolean acceptPayment(int amount ) {
        try {
            System.out.print("Введите номер карты:");
            int cardNumber = scan.nextInt();
            System.out.print("Введите одноразовый пароль");
            int oneTimeNumber = scan.nextInt();


            if (validateCardDetails(cardNumber, oneTimeNumber)){
                System.out.println(balance);
                balance += amount;
                System.out.println("Платеж успешно принят. Ваш балансе: " + balance);
                return true;
            }else {
                System.out.println("неверные данные карты или пароль. Попробуйте еще раз");

            }
        }catch (InputMismatchException | NumberFormatException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    private  boolean validateCardDetails(int cardNumber, int oneTimePassword ){
        return true;
    }

    @Override
    public int getBalance() {
        return balance;
    }
    @Override
    public void setBalance(int balance){
        this.balance = balance;
    }

    @Override
    public void displayOptions() {
        System.out.println("Для оплаты введите сумму");
    }
}
