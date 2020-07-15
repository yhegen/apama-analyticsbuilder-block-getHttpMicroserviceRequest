package com.softwareag.example.rest;

import java.util.UUID;

import javax.ws.rs.core.MediaType;

//import com.cumulocity.rest.representation.event.EventsApiRepresentation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleRestController {

    final Logger logger = LoggerFactory.getLogger(ExampleRestController.class);

    //@Autowired
    //EventsApiRepresentation events;

    @RequestMapping(value = "/uuid", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN)
    public String uuid() {
        final String uuid = UUID.randomUUID().toString();
        logger.info("Created uuid = " + uuid);
        return uuid;
    }

    /*@RequestMapping(value = "/hello", method = RequestMethod.POST, produces = MediaType.TEXT_PLAIN)
    public String hello(String name) {
        return "Hello " + name + "!";
    }*/

    //@Scheduled(cron = "0 5-59/10 * * * *")
    /*@Scheduled(fixedRate = 60000) // unit = milliseconds
    public void processNewDeviceRequests() {
        logger.info("Cron job is running!");
        
    }*/
}
