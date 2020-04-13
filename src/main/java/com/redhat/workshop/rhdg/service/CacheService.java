package com.redhat.workshop.rhdg.service;

import org.infinispan.client.hotrod.RemoteCache;
import org.infinispan.client.hotrod.RemoteCacheManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.TimeUnit;

@Service
public class CacheService {

    private static final String CACHE_NAME = "default";
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    private final RemoteCacheManager cacheManager;

    @Autowired
    public CacheService(RemoteCacheManager cacheManager) {
        this.cacheManager = cacheManager;
        cacheManager.administration().getOrCreateCache(CACHE_NAME, "org.infinispan.DIST_SYNC");
        logger.info(String.format("'%s' cache has been created!!!", CACHE_NAME));
    }

    public String putSession(String keyString, String valueString) {
        
        cacheManager.getCache(CACHE_NAME).put(keyString, valueString);
        return String.format("The < %s , %s > session is stored!!", keyString, valueString);
    
    }

    public String getSession(@RequestParam(value = "key") String keyString) {
        cacheManager.administration().getOrCreateCache(CACHE_NAME, "org.infinispan.DIST_SYNC");
        return String.format("The stored seesion value is %s!!", cacheManager.getCache(CACHE_NAME).get(keyString));

    }

    // public String createCache(String cacheName) {

    //     cacheManager.administration().getOrCreateCache(CACHE_NAME, "org.infinispan.DIST_SYNC");
    //     return String.format("'%s' cache has been created", CACHE_NAME);
    
    // }

}