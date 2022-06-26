package com.designtest.webserver.domain.model.instance;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Item {
    public String name;
    public int price;
    public void printInfo() {
        System.out.println(name + "," + price);
    }
}
