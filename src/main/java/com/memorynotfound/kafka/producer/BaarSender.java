package com.memorynotfound.kafka.producer;

import com.memorynotfound.kafka.Baar;
import com.memorynotfound.kafka.Foo;
import com.memorynotfound.kafka.base;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class BaarSender {

    private static final Logger LOG = LoggerFactory.getLogger(BaarSender.class);

    @Autowired
    private KafkaTemplate<String, base> kafkaTemplateBaar;

    private String topic="test1";

    public void sendBaar(Baar data){
        LOG.info("sending BAAR data='{}' to topic='{}'", data, topic);

        Message<Baar> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, topic)
                .build();

        kafkaTemplateBaar.send(message);
    }

    public void sendFoo(Foo data){
        LOG.info("sending BAAR data='{}' to topic='{}'", data, topic);


        Message<Foo> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, topic)
                .build();

        kafkaTemplateBaar.send(message);
    }
}