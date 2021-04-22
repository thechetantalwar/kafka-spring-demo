package com.thinknyx.kafkademo2.controller;

import com.thinknyx.kafkademo2.consumer.MyTopicConsumer;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KafkaController {

    private KafkaTemplate<String, String> template;
    private MyTopicConsumer myConsumer;
    public KafkaController(KafkaTemplate<String, String> template, MyTopicConsumer myConsumer) {
        this.template = template;
        this.myConsumer= myConsumer;
    }

    @GetMapping("/kafka/produce")
    public void produce(@RequestParam String message) {
        template.send("demo", message);
    }
    @GetMapping("/kafka/messages")
    public List<String> getMessages(){
        return myConsumer.getMessages();
    }
    @GetMapping("/")
    public List<String> getMessages2(){
        return myConsumer.getMessages();
    }
}
