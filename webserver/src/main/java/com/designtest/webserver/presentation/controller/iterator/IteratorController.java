package com.designtest.webserver.presentation.controller.iterator;

import com.designtest.webserver.application.service.iterator.BookShelf;
import com.designtest.webserver.domain.model.iterator.Book;
import com.designtest.webserver.domain.model.iterator.BookName;
import com.designtest.webserver.presentation.view.iterator.IteratorResponse;
import com.designtest.webserver.presentation.view.iterator.IteratorResponseItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class IteratorController {

    @GetMapping(value = "/api/iterator-design", produces = "application/json")
    public IteratorResponse showBookShelf() {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book(new BookName("Around the World in 80 Days")));
        bookShelf.appendBook(new Book(new BookName("Bible")));
        bookShelf.appendBook(new Book(new BookName("Cinderella")));
        bookShelf.appendBook(new Book(new BookName("Linux")));

        List<String> bookList = new ArrayList<>();
        //明示的にIteratorを使う
        for (Book book : bookShelf) {
            bookList.add(book.getName().getValue());
        }
        return new IteratorResponse(bookList.stream()
                .map(IteratorResponseItem::new)
                .collect(Collectors.toList())
        );
    }
}

