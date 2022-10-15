package com.designtest.webserver.application.service.visitor;

import com.designtest.webserver.domain.model.visitor.Directory;
import com.designtest.webserver.domain.model.visitor.Entry;
import com.designtest.webserver.domain.model.visitor.File;

public class ListVisitor extends Visitor {

  private String currentDir = "";

  @Override
  public void visit(File file) {
    System.out.println(currentDir + "/" + file);
  }

  @Override
  public void visit(Directory directory) {
    System.out.println(currentDir + "/" + directory);
    String saveDir = currentDir;
    currentDir = currentDir + "/" + directory.getName();
    for (Entry entry : directory) {
      entry.accept(this);
    }
    currentDir = saveDir;
  }
}
