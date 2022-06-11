package com.designtest.webserver.domain.model;

import lombok.*;

@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Test2 {
    @Getter
    Integer value;

    public Test2(@NonNull Integer value) {
        this.value = value;
    }

}
