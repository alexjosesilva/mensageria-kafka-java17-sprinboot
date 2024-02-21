package com.example.mensageriakafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MensageriakafkaApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(MensageriakafkaApplication.class, args);
        KafkaProducer producer = context.getBean(KafkaProducer.class);
        producer.sendMessage("primeira mensagem apache kafka 2024");
    }

}
