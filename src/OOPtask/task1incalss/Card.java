package OOPtask.task1incalss;

import OOPtask.task1incalss.Exception.CorrectAmoutMoneyException;
import OOPtask.task1incalss.Exception.NotEnoughBalanceException;

public interface Card {

    int getBalance();
    void deposit(int money) throws CorrectAmoutMoneyException;
    void withDraw(int money) throws NotEnoughBalanceException, CorrectAmoutMoneyException;
}
