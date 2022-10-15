package com.designtest.webserver.presentation.controller.visitor;

import com.designtest.webserver.application.service.visitor.ListVisitor;
import com.designtest.webserver.domain.model.visitor.Directory;
import com.designtest.webserver.domain.model.visitor.File;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisitorController {

  @GetMapping("api/visitor")
  public void get() {
    Directory rootDir = new Directory("root");
    Directory binDir = new Directory("binDir");
    rootDir.add(binDir);
    binDir.add(new File("vi", 100));
    rootDir.accept(new ListVisitor());

  }
}
