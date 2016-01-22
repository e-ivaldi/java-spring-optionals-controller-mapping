package com.foolver.improvedapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@ComponentScan
@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Component
    static class Runner implements CommandLineRunner {

        @Autowired
        ObjectMapper mapper;

        @Override
        public void run(String... args) throws Exception {

        }

        @PostConstruct
        public void configureMapper(){
            mapper.registerModule(new Jdk8Module());
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
