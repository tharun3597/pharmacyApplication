package com.billing.pharmacyApplication.Controller;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SampleController {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

}
