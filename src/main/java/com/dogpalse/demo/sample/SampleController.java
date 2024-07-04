package com.dogpalse.demo.sample;

import org.springframework.web.bind.annotation.RestController;

import com.dogpalse.demo.sample.dto.SampleDto;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RestController
@RequestMapping(value = "sample")
public class SampleController {
    
    @Autowired
    private SampleService sampleService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SampleDto> selectSampleList() {

        log.debug("selectSampleList()");

        return sampleService.selectSampleList();
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public SampleDto insertSample(@RequestBody SampleDto sampleDto) {

        log.debug("insertSample : {}", sampleDto);

        return sampleService.insertSample(sampleDto);
    }
}
