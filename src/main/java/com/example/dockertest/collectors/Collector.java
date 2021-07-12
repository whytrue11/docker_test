package com.example.dockertest.collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Collector {
  private static final int a = 617;
  private static final int b = 383;

  @GetMapping("/sum")
  public ResponseEntity<String> getSum() {
    return new ResponseEntity<>(Integer.toString(a + b), HttpStatus.OK);
  }

  @GetMapping("/min")
  public ResponseEntity<String> getMin() {
    return new ResponseEntity<>(Integer.toString(Math.min(a, b)), HttpStatus.OK);
  }
}
