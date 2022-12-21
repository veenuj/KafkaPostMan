package com.kafka.DKafka.Kafka;

import com.kafka.DKafka.Config.TopicKConfig;
import com.kafka.DKafka.PayLoad.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerJK {


    private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerJK.class);

    @KafkaListener(topics= TopicKConfig.TOPIC_NAME_JSON, groupId="veenujJK")
    public void consume(User data) {
        LOGGER.info(String.format("Message received -> %s", data.toString()));

    }


}
