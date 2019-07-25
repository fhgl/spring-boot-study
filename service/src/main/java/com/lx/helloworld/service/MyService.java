package com.lx.helloworld.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public String message() {
        return "myService message!!!热部署";
    }
}
