package com.yonglun.itineraryassistant.service;

import com.yonglun.itineraryassistant.entity.Job;
import com.yonglun.itineraryassistant.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    private final JobRepository repository;

    public JobService(JobRepository repository) {
        this.repository = repository;
    }

    public List<Job> getAllJobs() {
        return repository.findAll();
    }
}
