package com.designtest.webserver.presentation.view.iterator;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@EqualsAndHashCode
public class IteratorResponse {
    @Getter
    private final List<IteratorResponseItem> items;

    public IteratorResponse(List<IteratorResponseItem> items) {
        this.items = items;
    }
}
