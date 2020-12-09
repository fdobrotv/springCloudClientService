package com.fdobrotv.client_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/predicatePath")
public class GatewayRestController {
    @GetMapping("/message")
    public String getMessage() {
        System.out.println("GET /predicatePath/message");
        return "Some answer";
    }
}