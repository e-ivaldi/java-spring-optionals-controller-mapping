package com.foolver.improvedapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class SimpleController {

    private static final Logger log = LoggerFactory.getLogger(SimpleController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json" )
    public SimpleObject test(){
        SimpleObject simpleObject = new SimpleObject();
        simpleObject.setName(Optional.of("this is my name"));
        return simpleObject;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST, produces = "application/json" )
    public SimpleObject test(@RequestBody SimpleObject simpleObject){
        log.info("name: " + simpleObject.getName());
        log.info("description: " + simpleObject.getDescription());
        log.info("age: " + simpleObject.getAge());
        return simpleObject;
    }
}
