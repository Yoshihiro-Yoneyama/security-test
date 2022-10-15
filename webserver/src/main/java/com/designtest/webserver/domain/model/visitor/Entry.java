package com.designtest.webserver.domain.model.visitor;

import lombok.ToString;


/**
 * Directory
 */
public abstract class Entry implements Element {
  public abstract String getName();
  public abstract int getSize();

  @Override
  public String toString() {
    return getName() + "(" + getSize() + ")";
  }
}
