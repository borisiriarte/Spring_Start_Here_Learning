package org.example.A1_02_Example_StereotypeAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var p = ctx.getBean(Parrot.class);

    System.out.println(p.getName());
  }
}
