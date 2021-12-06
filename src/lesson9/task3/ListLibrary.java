package lesson9.task3;

import com.sun.source.tree.IfTree;
import lesson9.task3.Comporator.AuthorComparator;
import lesson9.task3.Comporator.BookComparator;
import lesson9.task3.Comporator.YearSort;

import java.util.*;

public class ListLibrary implements Library{

    private List<Book> library;

    public ListLibrary() {
        library = new ArrayList<>(10);
    }

    @Override
    public void addBook(Book book) {
        library.add(book.getId() - 1 ,book);
    }

    @Override
    public void deleteBook(int id) {
        library.remove(id - 1);

    }

    @Override
    public void deleteBook(String authorName, String bookName) {
        for (Book book : library) {
            if (book.getAuthorName().equals(authorName) && book.getName().equals(bookName))
                library.remove(book);
                return;


        }

    }

    @Override
    public Book updateBook(int id, BookUpdateInfo bookUpdateInfo) {
        Book book = library.get(id);
        book = (Book) bookUpdateInfo;

        return book;
    }

    @Override
    public Collection<Book> getBooksByAuthorName(String authorName) {
        ArrayList<Book> author = new ArrayList<>();
        for (Book a: library) {
            if (a.getAuthorName().equals(authorName)){
                author.add(a);
            }

        }
        return author;
    }

    @Override
    public void addAllBooks(Collection<Book> books) {
        library.addAll(books);


    }

    @Override
    public Collection<Book> getAllBooksSortByAuthorNameAndBookName() {
        TreeSet<Book> sort= new TreeSet<>(new AuthorComparator().thenComparing(new BookComparator()));
        sort.addAll(library);
        return sort;
    }

    @Override
    public Collection<Book> getAllBooksSortByEditionYear() {
        TreeSet<Book> sort= new TreeSet<>(new YearSort());
        sort.addAll(library);
        return sort;
    }

    @Override
    public Map<Integer, Book> getBooksAsMap() {
        Map<Integer, Book> l2 = new HashMap<>();
        for (Book b:library) {
            l2.put(b.getId(),b);

        }
        return l2;
    }

    @Override
    public Map<String, Collection<Book>> getBooksAsMapByAuthorName() {
        Map<String,Collection<Book>> l3= new HashMap<>();
        TreeSet<Book> sort= new TreeSet<>(new AuthorComparator());
        sort.addAll(library);
        ArrayList<Book> check = new ArrayList<>();
        check.add(sort.first());
        for (Book b: sort) {
            if (!b.getAuthorName().equals(check.get(check.size() - 1).getAuthorName())) {
                l3.put(check.get(check.size() - 1).getAuthorName(), check);
                check.clear();
            }
            check.add(b);


        }

         return l3;
    }

    public int countLibrary(){
        return library.size();


    }
}
