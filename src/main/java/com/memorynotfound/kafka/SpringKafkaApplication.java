package com.memorynotfound.kafka;

import com.memorynotfound.kafka.producer.BaarSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringKafkaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringKafkaApplication.class, args);
    }



    @Autowired
    private  BaarSender baarSender;

    @Override
    public void run(String... strings) throws Exception {
        Foo foo = new Foo("Spring Kafka", "sending and receiving JSON messages");
        Baar baar=new Baar("hahaha");

        baarSender.sendBaar(baar);
        baarSender.sendFoo(foo);
    }
}