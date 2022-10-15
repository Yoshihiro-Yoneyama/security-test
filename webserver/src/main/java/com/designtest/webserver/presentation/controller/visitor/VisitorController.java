package com.designtest.webserver.presentation.controller.visitor;

import com.designtest.webserver.application.service.visitor.ListVisitor;
import com.designtest.webserver.domain.model.visitor.Directory;
import com.designtest.webserver.domain.model.visitor.File;
import com.designtest.webserver.application.service.visitor.FileFindVisitor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisitorController {

  @GetMapping("api/visitor")
  public void get() {
    Directory rootDir = new Directory("root");
    Directory binDir = new Directory("binDir");
    Directory usrDir = new Directory("user");

    rootDir.add(binDir);
    rootDir.add(usrDir);

    binDir.add(new File("vi", 10000));
    binDir.add(new File("latex", 20000));

    rootDir.accept(new ListVisitor());

    Directory yuki = new Directory("yuki");
    usrDir.add(yuki);
    yuki.add(new File("diary.html", 100));
    yuki.add(new File("composite.java", 200));



    FileFindVisitor fileFindVisitor = new FileFindVisitor(".html");
    rootDir.accept(fileFindVisitor);

    System.out.println("HTML files are:");
    for (File file: fileFindVisitor.getFoundFiles()) {
      System.out.println(file);
    }
  }
}
