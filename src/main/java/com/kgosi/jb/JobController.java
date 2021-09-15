package com.kgosi.jb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/jobs")
public class JobController {

    private final JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping
    public List<Job> getJobs() {
        return jobService.getJobs();
    }

    @PostMapping
    public void registerJob(@RequestBody Job job) {
        jobService.addNewJob(job);
    }

    @DeleteMapping(path = "jobId")
    public void deleteStudent(@PathVariable("id") Long id) {
        jobService.deleteStudent(id);
    }

    @PutMapping(path = "{id}")
    public void updateJob(@PathVariable("id") Long id, @RequestParam(required = false) String name,
            @RequestParam(required = false) String description, @RequestParam(required = false) String dueDate,

            @RequestParam(required = false) String email) {
        jobService.updateJob(id, name, description, dueDate, email);
    }

}
