package com.dogpalse.demo.sample.dto;

import com.dogpalse.demo.sample.entity.Sample;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SampleDto {
    
    private Long id;
    private String name;

    public Sample toEntity() {
        Sample sample = Sample.builder()
                            .id(this.id)
                            .name(this.name)
                            .build();
                            
        return sample;
    }
}
