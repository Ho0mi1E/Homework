package OOPtask.task1incalss.Exception;

public class IncorrectTypeException extends Exception{

    public IncorrectTypeException(String cardType){
        super("Нет карты с типом " + cardType);
    }
}
