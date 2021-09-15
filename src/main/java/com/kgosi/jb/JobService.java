package com.kgosi.jb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    private final JobsRepository jobsRepository;

    @Autowired
    public JobService(JobsRepository jobsRepository) {
        this.jobsRepository = jobsRepository;
    }

    public List<Job> getJobs() {
        return jobsRepository.findAll();
    }

    public void addNewJob(Job job) {
        System.out.println(job);
    }

    public void deleteStudent(Long id) {
        boolean exists = jobsRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException("student does not exist");
        }
        jobsRepository.deleteById(id);
    }

    public void updateJob(Long id, String name, String description, String dueDate, String email) {
    }

}
