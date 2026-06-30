package com.yonglun.jobtracker.service;

import com.yonglun.jobtracker.entity.Job;
import com.yonglun.jobtracker.repository.JobRepository;
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
