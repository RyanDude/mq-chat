package org.example.Producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GuestProducer {
    private final RabbitTemplate rabbitTemplate;
    @Autowired
    public GuestProducer(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }
    // exchange: guest.direct,  routingKey: guest.routekey,
    public void sendMessage(String exchange, String routingKey, String message){
        rabbitTemplate.convertAndSend(exchange, routingKey, message);
        System.out.println("Message sent: " + message);
    }
}
