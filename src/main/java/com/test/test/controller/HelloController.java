package com.test.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

  @GetMapping("/")
  public String Status() {
    return "Servidor rodando, dá uma olhada na /olar";
  }

  @GetMapping("/olar")
  public String Hello() {
    return "Fala galeris do spring";
  }

}
