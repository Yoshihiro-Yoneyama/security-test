package com.designtest.webserver.domain.model.iterator;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class BookName {
    @Getter
    private final String value;

    public BookName(@NonNull String value) {
        this.value = value;
    }
}
