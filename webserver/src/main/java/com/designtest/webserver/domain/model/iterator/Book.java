package com.designtest.webserver.domain.model.iterator;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Book {
    @Getter
    private BookName name;

    public Book(@NonNull BookName name) {
        this.name = name;
    }
}
