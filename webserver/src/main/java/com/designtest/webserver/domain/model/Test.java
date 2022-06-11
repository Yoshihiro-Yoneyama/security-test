package com.designtest.webserver.domain.model;

import lombok.*;

import java.util.Optional;

@ToString
@NoArgsConstructor
public class Test {
    @Getter
    Test1 test1;

    Test2 test2;

    public Test(@NonNull Test1 test1, Test2 test2) {
        this.test1 = test1;
        this.test2 = test2;
    }

    public Optional<Test2> getTest2 () {
        return Optional.ofNullable(test2);
    }
}
