package com.designtest.webserver.domain.model.adapter;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Banner {
    @Getter
    private final String value;

    public Banner(@NonNull String value) {
        this.value = value;
    }

    public String showWithParen () {
        return  "(" + this.value + ")";
    }

    public String showWithAster () {
        return  "*" + this.value + "*";
    }
}
