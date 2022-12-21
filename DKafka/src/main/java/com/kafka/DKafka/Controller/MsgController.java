package com.kafka.DKafka.Controller;

import com.kafka.DKafka.Kafka.ProducerK;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MsgController {

    private ProducerK producerK;

    public MsgController(ProducerK producerK) {
        this.producerK = producerK;
    }

    @GetMapping("/publish") // http://localhost:3112/api/publish?message=anujdhiman
    public ResponseEntity<String> publish(@RequestParam("message") String message) {
        producerK.sendMessage(message);
        return ResponseEntity.ok("Message deliver to Topic");
    }
}
