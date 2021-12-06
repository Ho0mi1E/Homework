package OOPtask.task1incalss;

import OOPtask.task1incalss.Exception.CorrectAmoutMoneyException;
import OOPtask.task1incalss.Exception.IncorrectTypeException;
import OOPtask.task1incalss.Exception.NotEnoughBalanceException;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Выберите тип карты: DEBIT или CREDIT");
        Scanner sc = new Scanner(System.in);

        String cardTypeStr = sc.nextLine();

        CardHolder cardHolder = new CardHolder();
        try {
            Card card = cardHolder.getCard(cardTypeStr);
            System.out.println("Стартовый баланс. " + card.getBalance());

            card.deposit(400);

            System.out.println("Баланс после пополнения " + card.getBalance());

            card.withDraw(300);
            System.out.println("Баланс после снятия " + card.getBalance());

            card.withDraw(300);
            System.out.println("Баланс после снятия " + card.getBalance());

        }catch (IncorrectTypeException | CorrectAmoutMoneyException | NotEnoughBalanceException e){
            System.out.println(e.getMessage());
        }


    }
}