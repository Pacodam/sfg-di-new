package com.demo.sfgdi.services;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "hello world";
    }
}