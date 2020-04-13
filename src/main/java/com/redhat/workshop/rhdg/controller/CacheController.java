package com.redhat.workshop.rhdg.controller;

import com.redhat.workshop.rhdg.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CacheController {

    @Autowired
    private CacheService cacheService;

 
    @GetMapping("/greeting")
    public String hello() {
        return "Welcome, Spring Boot Session with Red Hat Data Grid!";
    }


    // @GetMapping("/create")
    // public String createCache(@RequestParam(value = "name", defaultValue = CACHE_NAME) String cacheName) {
    //     return cacheService.createCache(cacheName);
    // }

    @GetMapping("/put")
    public String putData(@RequestParam(value = "key") String keyString, @RequestParam(value = "value") String valueString) {
        return cacheService.putSession(keyString, valueString);
    }

    @GetMapping("/get")
    public String getData(@RequestParam(value = "key") String keyString) {
       return cacheService.getSession(keyString);
    }

}