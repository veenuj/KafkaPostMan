package com.kafka.DKafka.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
@Configuration
public class TopicKConfig {

    public static final String TOPIC_NAME = "anuj3112";
    public static final String TOPIC_NAME_JSON = "anujJK3112";

    @Bean
    public NewTopic veenujTopic() {
        return TopicBuilder.name(TOPIC_NAME)
                .build();
    }

    @Bean
    public NewTopic veenujJsonTopic() {
        return TopicBuilder.name(TOPIC_NAME_JSON)
                .build();
    }


}
