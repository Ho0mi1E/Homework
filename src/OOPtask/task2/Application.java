package OOPtask.task2;

public class Application {
    public static void main(String[] args) {
        Library library = new Library(3);

        Book book = new Book("Java", "Гербер", 2010);
        Book book1 = new Book("Java Core", "Гербер", 2012);
        Book book2 = new Book("", "Пушкин", 1834);

        library.add(book);
        library.add(book1);
        library.add(book2);

        library.printInfo();

        library.delete("Java", "Гербер");

        library.printInfo();
    }
}
