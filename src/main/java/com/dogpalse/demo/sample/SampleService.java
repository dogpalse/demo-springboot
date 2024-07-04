package com.dogpalse.demo.sample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.dogpalse.demo.sample.dto.SampleDto;
import com.dogpalse.demo.sample.entity.Sample;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SampleService {
    
    @Autowired
    private SampleRepository sampleRepository;

    public List<SampleDto> selectSampleList() {
        List<Sample> sampleList = sampleRepository.findAll();

        List<SampleDto> result = new ArrayList<>();
        if (!CollectionUtils.isEmpty(sampleList)) {
            for (Sample sample : sampleList) {
                result.add(sample.toDto());
            }
        }

        return result;
    }

    public SampleDto insertSample(SampleDto sampleDto) {
        log.debug("sampleDto : {}", sampleDto);
        Sample sample = sampleDto.toEntity();
        log.debug("sample : {}", sample);
        
        return sampleRepository.save(sample).toDto();
    }
}
