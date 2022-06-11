package com.designtest.webserver.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@EqualsAndHashCode
public class Test1 {
    @Getter
    String value;

    public Test1(@NonNull String value) {
        this.value = value;
    }
}
