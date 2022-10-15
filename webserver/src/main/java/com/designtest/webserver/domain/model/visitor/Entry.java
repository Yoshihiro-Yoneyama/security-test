package com.designtest.webserver.domain.model.visitor;

import lombok.ToString;

@ToString
/**
 * Directory
 */
public abstract class Entry implements Element {
  public abstract String getName();
  public abstract int getSize();
}
