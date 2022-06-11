package com.designtest.webserver.application.service.iterator;

import com.designtest.webserver.domain.model.book.Book;

import java.util.Iterator;

public class BookShelf implements Iterable<Book>{
    private final Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}


