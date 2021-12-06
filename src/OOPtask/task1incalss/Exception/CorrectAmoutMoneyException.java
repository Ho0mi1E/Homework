package OOPtask.task1incalss.Exception;

public class CorrectAmoutMoneyException extends Exception{
    public CorrectAmoutMoneyException(int money) {
        super("Введено некорректное значение " + money);
    }
}
