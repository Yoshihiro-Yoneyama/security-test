package com.designtest.webserver.presentation.view.iterator;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class IteratorResponseItem {
    private final String book;

    public IteratorResponseItem(String book) {
        this.book = book;
    }
}
