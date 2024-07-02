package com.dogpalse.demo.sample;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "sample")
public class SampleController {
    
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> sample() {

        System.err.println("sample");
        Map<String, String> result = new HashMap<>();
        result.put("sample", "sample is...");
        result.put("dogpalse", "im dogpalse");

        return result;
    }
}
