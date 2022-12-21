package com.kafka.DKafka.Kafka;

import com.kafka.DKafka.Config.TopicKConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerK {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerK.class);

    @KafkaListener(topics= TopicKConfig.TOPIC_NAME, groupId="veenuj")
    public void consume(String message) {
        LOGGER.info(String.format("Message received -> %s", message));

    }


}
