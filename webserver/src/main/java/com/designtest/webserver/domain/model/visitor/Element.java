package com.designtest.webserver.domain.model.visitor;

import com.designtest.webserver.application.service.visitor.Visitor;

public interface Element {
  public abstract void accept(Visitor v);
}