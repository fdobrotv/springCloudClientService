package com.fdobrotv.client_service.controller;

import com.fdobrotv.client_service.dto.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoRestController {
    @Autowired
    private Info infoDto;

    @GetMapping(value = "/getInfo")
    public String getInfoFromServer() {
        return "Data: " + infoDto.getVariable();
    }
}