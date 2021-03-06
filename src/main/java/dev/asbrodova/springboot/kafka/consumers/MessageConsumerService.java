package dev.asbrodova.springboot.kafka.consumers;

import dev.asbrodova.springboot.kafka.model.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class MessageConsumerService {

    private static final String TOPIC = "messages";
    private static final String GROUP_ID = "message_group_id";

    @KafkaListener(topics = TOPIC, groupId = GROUP_ID)
    public void consume(Message message){
        System.out.println("Consuming the message: " + message);
    }
}
