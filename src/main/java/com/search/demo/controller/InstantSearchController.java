package com.search.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.search.demo.service.InstantSearchService;

@RestController
public class InstantSearchController {

    @Autowired
    InstantSearchService service;

    @GetMapping(value = "/search/{key}")
    public String[] instantSearch(@PathVariable String key) {
        return service.getMatchingStrings(key);
    }
}
