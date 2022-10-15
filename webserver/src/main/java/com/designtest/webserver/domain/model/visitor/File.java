package com.designtest.webserver.domain.model.visitor;

import com.designtest.webserver.application.service.visitor.Visitor;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class File extends Entry {
  private String name;
  private int size;


  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getSize() {
    return size;
  }
}
