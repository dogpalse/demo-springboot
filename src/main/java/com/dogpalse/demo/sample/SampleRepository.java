package com.dogpalse.demo.sample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dogpalse.demo.sample.entity.Sample;

@Repository
public interface SampleRepository extends JpaRepository<Sample, Long> {
    
}
