package OOPtask.task2;

import java.util.Arrays;

public class Library {

    private Book[] books;

    public Library(int booksCount) {
        this.books = new Book[booksCount];
    }

    public void add(Book book){
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null){
                books[i] = book;
                return;
            }

        }
    }

    public void delete(String name, String authorName){
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(name) && books[i].getAuthorName().equals(authorName)){
                books[i] = null;
                return;
            }
        }
    }

    public Book getByNameAuthorName(String name, String authorName) throws BookNotFounderException {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(name) && books[i].getAuthorName().equals(authorName)){
                return books[i];
            }

        }
        throw  new BookNotFounderException(name, authorName);
    }

    public Book[] getByAuthorName(String authorName){
        int counter = 0;

        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthorName().equals(authorName)){
                counter++;
            }

        }

        Book[] temp = new Book[counter];
        int tempIndex = 0;

        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthorName().equals(authorName)){
                temp[tempIndex] = books[i];
                tempIndex++;


            }

        }
        return temp;
    }
    public void printInfo(){
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);

        }



}}
