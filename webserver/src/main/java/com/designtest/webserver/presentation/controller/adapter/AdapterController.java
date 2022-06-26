package com.designtest.webserver.presentation.controller.adapter;

import com.designtest.webserver.application.service.adapter.Print;
import com.designtest.webserver.application.service.adapter.printBanner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdapterController {

    @GetMapping("api/adapter")
    public String get() {
        Print printedAgreement = new printBanner("test");
        printedAgreement.printStrong();
        return printedAgreement.toString();
    }
}
