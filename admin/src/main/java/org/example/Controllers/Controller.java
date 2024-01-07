package org.example.Controllers;

import org.example.Producer.AdminProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {
    private final AdminProducer adminProducer;
    public Controller(AdminProducer  adminProducer){
        this.adminProducer = adminProducer;
    }
    @GetMapping("/hi")
    public String hi(){return "hi";}
    @PostMapping("/sendMsg")
    public void sendMsg(@RequestParam("msg") String msg){
        adminProducer.sendMessage("my.direct", "my.routekey", msg);
    }
}
