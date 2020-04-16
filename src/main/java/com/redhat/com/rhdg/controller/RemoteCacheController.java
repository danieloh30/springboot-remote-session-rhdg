package com.redhat.com.rhdg.controller;

import javax.servlet.http.HttpServletRequest;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;

import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.spring.remote.session.configuration.EnableInfinispanRemoteHttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @EnableInfinispanRemoteHttpSession
public class RemoteCacheController {

    // private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    // private final RemoteCacheManager cacheManager;

    // @Autowired
    // public RemoteCacheController(RemoteCacheManager cacheManager) {
    //     this.cacheManager = cacheManager;
    //     this.cacheManager.administration().getOrCreateCache("sessions", "org.infinispan.DIST_SYNC");
    // }

    // @RequestMapping("/session")
    // public Map<String, String> session(HttpServletRequest request) {
    //     Map<String, String> result = new HashMap<>();
    //     String sessionId = request.getSession(true).getId();
    //     result.put("created:", sessionId);
    //     logger.info(String.format("sessionId: %s", sessionId));

    //     // By default Infinispan integration for Spring Session will use 'sessions' cache.
    //     logger.info(String.format("BBB: %s", cacheManager.getCache("sessions").get("created:")));
       
    //     result.put("active:", cacheManager.getCache("sessions").keySet().toString());
    //     return result;
    // }

    // @GetMapping("/put")
    // public String putData(@RequestParam(value = "key") String keyString, @RequestParam(value = "value") String valueString) {
    //     return cacheManager.getCache("sessions").put(keyString, valueString).toString();
    // }

    // @GetMapping("/get")
    // public String getData(@RequestParam(value = "key") String keyString) {
    //    return cacheManager.getCache("sessions").get(keyString).toString();
    // }

}