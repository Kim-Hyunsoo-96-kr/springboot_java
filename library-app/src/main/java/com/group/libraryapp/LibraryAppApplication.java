package com.group.libraryapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** SpringBootApplication 어노테이션을 통해 스프링 설정을 자동으로 해줌 */
@SpringBootApplication
public class LibraryAppApplication {

  public static void main(String[] args) {

    SpringApplication.run(LibraryAppApplication.class, args);
  }

}
