

package com.jaikant.sampleapp.cache.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jaikant.sampleapp.cache.model.Customer;
import com.jaikant.sampleapp.cache.service.CacheService;


@RestController
public class WebController {

    @Autowired
    CacheService cacheService;

    @RequestMapping("cachePut")
    public String put(@RequestParam("firstname") String firstName, @RequestParam("id") long id) {
        cacheService.putCustomer(firstName, id);
        return "Done";
    }

    @RequestMapping("cacheable")
    public Customer get(@RequestParam("id") long id) {
        return cacheService.get(id);
    }

    @RequestMapping("cacheevict")
    public String evict(@RequestParam("id") long id) {
        cacheService.evict(id);
        return "Done";
    }

}
