package com.designtest.webserver.application.service.visitor;

import com.designtest.webserver.domain.model.visitor.Directory;
import com.designtest.webserver.domain.model.visitor.Entry;
import com.designtest.webserver.domain.model.visitor.File;

import java.util.Set;


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

class A {
  public double x;
  public double y;
}

class B {

  public static void test () {
    A a = new A();
    a.x = 1;
    Double c = a.x;
  }
}


