package com.designtest.webserver.application.service.adapter;

import com.designtest.webserver.domain.model.adapter.Banner;
import lombok.NonNull;

public class printBanner extends Banner implements Print{

    public printBanner(@NonNull String value) {
        super(value);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
