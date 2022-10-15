package com.designtest.webserver.application.service.visitor;

import com.designtest.webserver.application.service.visitor.Visitor;
import com.designtest.webserver.domain.model.visitor.Directory;
import com.designtest.webserver.domain.model.visitor.Entry;
import com.designtest.webserver.domain.model.visitor.File;

import java.util.ArrayList;
import java.util.List;

public class FileFindVisitor extends Visitor {
  private String fileType;
  private List<File> foundFiles = new ArrayList<>();

  public FileFindVisitor(String fileType) {
    this.fileType = fileType;
  }

  public Iterable<File> getFoundFiles() {
    return foundFiles;
  }

  @Override
  public void visit(File file) {
    if (file.getName().endsWith(fileType)){
      foundFiles.add(file);
    }
  }

  @Override
  public void visit(Directory directory) {
    for (Entry entry: directory) {
      entry.accept(this);
    }
  }
}
