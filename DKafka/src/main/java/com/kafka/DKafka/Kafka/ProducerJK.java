package com.kafka.DKafka.Kafka;

import com.kafka.DKafka.Config.TopicKConfig;
import com.kafka.DKafka.PayLoad.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class ProducerJK {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProducerJK.class);

    private KafkaTemplate<String, User> kafkaTemplate;

    public ProducerJK(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(User payload) {

        LOGGER.info(String.format("Message delivered %s", payload.toString()));

        Message<User> message = MessageBuilder
                .withPayload(payload)
                .setHeader(KafkaHeaders.TOPIC, TopicKConfig.TOPIC_NAME_JSON)
                .build();



        kafkaTemplate.send(message);
    }


}
