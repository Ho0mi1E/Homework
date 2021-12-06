package OOPtask.task1incalss;

import OOPtask.task1incalss.Exception.CorrectAmoutMoneyException;
import OOPtask.task1incalss.Exception.NotEnoughBalanceException;

public class DebitCard implements Card{
    private int balance;
    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public void deposit(int money) throws CorrectAmoutMoneyException {
        if (money < 0){
            throw new CorrectAmoutMoneyException(money);
        }
        balance += money;


    }

    @Override
    public void withDraw(int money) throws NotEnoughBalanceException, CorrectAmoutMoneyException {
        if (money <= 0){
            throw new CorrectAmoutMoneyException(money);
        }
        if (money > balance){
            throw new NotEnoughBalanceException();


        }
        balance -= money;


    }
}
