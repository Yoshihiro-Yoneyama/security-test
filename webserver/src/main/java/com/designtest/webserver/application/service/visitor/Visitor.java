package com.designtest.webserver.application.service.visitor;

import com.designtest.webserver.domain.model.visitor.Directory;
import com.designtest.webserver.domain.model.visitor.File;

public abstract class Visitor {
  public abstract void visit(File file);
  public abstract void visit(Directory directory);
}
