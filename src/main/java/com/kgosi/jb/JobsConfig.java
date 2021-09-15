package com.kgosi.jb;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JobsConfig {

    @Bean
    CommandLineRunner commandLineRunner(JobsRepository jobsRepository) {
        return args -> {
            Job job1 = new Job("system engineer", "blah blah blah", "01-02-2012", "hr@stripeless.com");
            Job job2 = new Job("project manager", "yeah yeah ", "21-03-2021", "hiring@123.com");

            jobsRepository.saveAll(List.of(job1, job2));

        };
    }
}
