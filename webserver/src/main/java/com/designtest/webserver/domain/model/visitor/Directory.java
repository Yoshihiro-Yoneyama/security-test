package com.designtest.webserver.domain.model.visitor;

import com.designtest.webserver.application.service.visitor.Visitor;
import com.designtest.webserver.domain.model.visitor.Entry;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@AllArgsConstructor
public class Directory extends Entry implements Iterable<Entry> {
  private String name;
  private List<Entry> directory = new ArrayList<>();

  public Directory(String name) {
    this.name = name;
  }

  public Entry add(Entry entry) {
    directory.add(entry);
    return this;
  }

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
    int size = 0;
    for (Entry entry : directory) {
      return size += entry.getSize();
    }
    return size;
  }

  @Override
  public Iterator<Entry> iterator() {
    return directory.iterator();
  }
}
