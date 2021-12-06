package OOPtask.task2;

public class BookNotFounderException extends Exception{

    public BookNotFounderException(String name, String authorName){
        super("У автора по имени " + authorName + ", книги с названием " + name + " не существует");
    }
}
