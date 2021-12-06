package lesson9.task3;/*
 * Copyright 2001-2021 by HireRight, Inc. All rights reserved.
 * This software is the confidential and proprietary information
 * of HireRight, Inc. Use is subject to license terms.
 */

import java.util.Collection;
import java.util.Map;

/**
   Интерфейс, описывающий бибилиотеку
   (сущность, которая хранит и возвращает список книг).
 */
public interface Library {

    /**
     * Добавляет книгу в библиотеку
     * @param book объект типа Book
     */
    void addBook(Book book);

    /**
     * Удаляет книгу по идентификатору
     * @param id идентификатор книги
     */
    void deleteBook(int id);

    /**
     * Удаляет книгу по имени автора и названию книги
     * @param authorName имя автора
     * @param bookName название книги
     */
    void deleteBook(String authorName, String bookName);

    /**
     * Обновляет информацию о книге. Принимает объект, в котором хранится
     * информация для обновления.
     * @param bookUpdateInfo информация для обновления
     * @param id идентификатор книги
     * @return Обновленная книга
     */
    Book updateBook(int id, BookUpdateInfo bookUpdateInfo);

    /**
     * Возвращает коллекцию книг по имени автора
     * @param authorName имя автора
     * @return коллекция книг
     */
    Collection<Book> getBooksByAuthorName(String authorName);

    /**
     * Добавить все книги к библиотеке
     * @param books коллекция книг
     */
    void addAllBooks(Collection<Book> books);

    /**
     * Вернуть коллекцию, хранящая все книги библиотеки, отсортированные по
     * имени автора и названию книги
     * @return коллекция книг
     */
    Collection<Book> getAllBooksSortByAuthorNameAndBookName();

    /**
     * Вернуть коллекцию, хранящая все книги библиотеки, отсортированные по
     * году издания
     * @return коллекция книг
     */
    Collection<Book> getAllBooksSortByEditionYear();

    /**
     * Возвращает Map, которая хранит все книги в библиотеке.
     * По Ключу будет находиться идентификатор книги.
     * @return Map
     */
    Map<Integer, Book> getBooksAsMap();

    /**
     * Возвращает Map, которая хранит все книги в библиотеке.
     * По Ключу нахоится имя автора, по значению коллекция книг, у которых
     * общий автор и имя автора совпадает со значением ключа.
     * @return Map
     */
    Map<String, Collection<Book>> getBooksAsMapByAuthorName();
}
