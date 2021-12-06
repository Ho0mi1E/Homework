package lesson9.task3.Comporator;

import lesson9.task3.Book;

import java.util.Comparator;

public class YearSort implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {

        return Integer.toString(o1.getEditionYear()).compareTo(Integer.toString(o2.getEditionYear()));
    }
}
