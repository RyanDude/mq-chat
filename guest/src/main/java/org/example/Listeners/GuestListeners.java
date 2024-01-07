package org.example.Listeners;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class GuestListeners {
    @RabbitListener(queues = "test")
    public void handleMessage(String message) {
        System.out.println("Received message: " + message);
        // Process the received message as needed
    }
}
