package com.hayba.kafkatransformer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class KafkaTransformerApplication {

  public static void main(String[] args) {
    SpringApplication.run(KafkaTransformerApplication.class, args);
  }

  @Bean
  Function<String, String> greet() {
    return name -> new StringBuilder("Happy new year ").append(name).toString();
  }
}
