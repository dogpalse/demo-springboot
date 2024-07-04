package com.dogpalse.demo.sample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dogpalse.demo.sample.dto.SampleDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
@Entity
@Table(name = "TB_SAMPLE")
public class Sample {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public SampleDto toDto() {
        SampleDto sampleDto = SampleDto.builder()
                                .id(this.id)
                                .name(this.name)
                                .build();

        return sampleDto;
    }
}
