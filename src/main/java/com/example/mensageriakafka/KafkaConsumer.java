package com.example.mensageriakafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "meu-topico", groupId = "my-group")
    public void listen(String message) {
        System.out.println("Mensagem recebida: " + message);
    }
}

