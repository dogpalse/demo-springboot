package com.dogpalse.demo.sample;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RestController
@RequestMapping(value = "sample")
public class SampleController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> sample() {

        log.trace("sample...");
        log.debug("sample...");
        log.info("sample...");
        log.warn("sample...");
        log.error("sample...");

        Map<String, String> result = new HashMap<>();
        result.put("sample", "sample is...");
        result.put("dogpalse", "im dogpalse");

        log.debug("result : {}", result);

        return result;
    }
}
