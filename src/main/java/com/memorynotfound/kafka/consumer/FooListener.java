package com.memorynotfound.kafka.consumer;

import com.memorynotfound.kafka.Baar;
import com.memorynotfound.kafka.Foo;
import com.memorynotfound.kafka.base;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class FooListener {

    private static final Logger LOG = LoggerFactory.getLogger(FooListener.class);

    @KafkaListener(id="listener1",topics = "test1")
    public void receive(@Payload base data,
                        @Headers MessageHeaders headers) {

        if(data instanceof Baar)
        LOG.info("received Baar data='{}'", data);

        if(data instanceof Foo)
            LOG.info("received Foo data='{}'", data);
    }

}
