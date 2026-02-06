package com.patientmanagement.billing_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillingController {


    @GetMapping("/")
    public String hello()
    {
        return "Hello from billing service end point";
    }

}
