package it.agilelab.witboost.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** This is a sample class HelloAppController which implements hello() method. */
@Controller
public class HelloAppController {

    private static final Logger log = LoggerFactory.getLogger(HelloAppController.class);

    /**
     * This is a sample method created to provide the coverage.
     *
     * @return ResponseEntity
     */
    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public ResponseEntity<String> hello() {
        log.info("Received GET to /hello");
        return ResponseEntity.ok("All is good");
    }
}
