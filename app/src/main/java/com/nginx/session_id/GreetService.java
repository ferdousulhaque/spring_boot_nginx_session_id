package com.nginx.session_id;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GreetService {

    private static Logger logger = LoggerFactory.getLogger(GreetService.class);
    private String[] greetings = {
            "Welcome buddy",
            "Swadekha",
            "Mingalabar"
    };

    public String greet(){
        Random rand = new Random();
        int randKey = rand.nextInt(greetings.length);
        logger.info("Request ID:" + MDC.get("X-Request-ID"));
        return greetings[randKey];
    }
}
