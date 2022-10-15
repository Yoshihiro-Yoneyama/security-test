package com.designtest.webserver.application.service.visitor;

import com.designtest.webserver.domain.model.visitor.Directory;
import com.designtest.webserver.domain.model.visitor.Entry;
import com.designtest.webserver.domain.model.visitor.File;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SizeVisitor extends Visitor {
  private int size = 0;



  @Override
  public void visit(File file) {
    size += file.getSize();
  }

  @Override
  public void visit(Directory directory) {
    for (Entry entry: directory) {
      entry.accept(this);
    }
  }
}
