package com.kafka.DKafka.Kafka;

import com.kafka.DKafka.Config.TopicKConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerK {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProducerK.class);
    private KafkaTemplate<String, String> kafkaTemplate;

    public ProducerK(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        LOGGER.info(String.format("Message dileverd %s", message));
        kafkaTemplate.send(TopicKConfig.TOPIC_NAME, message);
    }


}
