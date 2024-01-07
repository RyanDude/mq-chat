package org.example.Controllers;

import org.example.Producer.GuestProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    private final GuestProducer guestProducer;
    public Controller(GuestProducer  guestProducer){
        this.guestProducer = guestProducer;
    }
    @PostMapping("/sendMsg")
    public void sendMsg(@RequestParam("msg") String msg){
        guestProducer.sendMessage("guest.direct", "guest.routekey", msg);
    }
}
