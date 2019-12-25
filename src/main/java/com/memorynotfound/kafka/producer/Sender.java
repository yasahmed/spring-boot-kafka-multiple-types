package com.memorynotfound.kafka.producer;

import com.memorynotfound.kafka.Baar;
import com.memorynotfound.kafka.Foo;
import com.memorynotfound.kafka.Base;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class Sender {

    private static final Logger LOG = LoggerFactory.getLogger(Sender.class);

    @Autowired
    private KafkaTemplate<String, Base> kafkaTemplateBaar;

    private String topic="test1";


    public void sender(Base data){
        LOG.info("sending Base data='{}' to topic='{}'", data, topic);

        Message<Base> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, topic)
                .build();

        kafkaTemplateBaar.send(message);
    }

}