package com.designtest.webserver.presentation.controller.instance;

import com.designtest.webserver.domain.model.instance.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstanceTestController {

    @GetMapping("api/instance-test")
    public String get() {
        Item itemA = new Item();
        Item itemB = new Item();
        itemA.name = "A";
        itemB.name = "B";
        itemA.price = 10;
        itemB.price = 20;
        itemA = itemB;
        itemB.name = "C";
        itemA.price = 30;
        itemA.printInfo();
        return itemA.name + "," +itemA.price;
    }
}
