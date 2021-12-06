package lesson9.task3;

public class check {
    public static void main(String[] args) {
        ListLibrary library = new ListLibrary();
        Book english = new Book(1,"English","Putin","Russia",2000);
        Book english2 = new Book(2,"Ene","Putin","Russia",2000);
        Book english3 = new Book(3,"En","Puti1","Russia",2000);
        library.addBook(english);
        library.addBook(english2);
        library.addBook(english3);
        System.out.println(library.countLibrary());
        for (Book b: library.getAllBooksSortByAuthorNameAndBookName()) {
            System.out.println(b.getAuthorName() + " " + b.getName());

        }
    }
}
