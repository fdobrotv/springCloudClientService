package com.fdobrotv.client_service.controller;

import com.fdobrotv.client_service.configuration.InfoPropertiesConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoRestController {

    private static Logger log = LoggerFactory.getLogger(InfoRestController.class);

    @Autowired
    private InfoPropertiesConfiguration infoPropertiesConfiguration;

    @GetMapping(value = "/getInfo")
    public String getInfoFromServer() {
        log.info("GET /getInfo");
        //Read the README.mb, how to install lombok, if your IDE prints red
        return "Data: " + infoPropertiesConfiguration.getVariable();
    }
}