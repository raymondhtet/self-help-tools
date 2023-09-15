package com.raymond.selfhelptools.controller;

import com.raymond.selfhelptools.model.ResponseJWE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/decrypt")
public class DecryptController {

    Logger logger = LoggerFactory.getLogger(DecryptController.class);

    @PostMapping("/jwe")
    @ResponseStatus(OK)
    public ResponseJWE DecryptJWE(String encryptedJWT) {
        var response = new ResponseJWE();
        logger.info("Encrypted JWT: " + encryptedJWT);
        response.setDecryptedJWT("Hello World");
        // You are returning a Tweet, so you must return something.
        return response;
    }
}
