package com.softwareag.example;

import com.cumulocity.microservice.autoconfigure.MicroserviceApplication;
import com.cumulocity.microservice.context.annotation.EnableContextSupport;
import com.cumulocity.microservice.subscription.service.MicroserviceSubscriptionsService;
import com.cumulocity.sdk.client.inventory.ManagedObjectReferenceCollection;
import com.softwareag.example.rest.ExampleRestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@MicroserviceApplication
@EnableScheduling
@EnableContextSupport
@EnableAsync
public class App{

    @Autowired
    MicroserviceSubscriptionsService subscriptionsService;
    
    @Autowired
    ExampleRestController exampleRestController;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}