package com.kgosi.jb;

import java.util.List
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JbApplication {

    public static void main(String[] args) {
        SpringApplication.run(JbApplication.class, args);
    }

    @GetMapping
    public List<Job> hello() {
        return List.of(new Job("system engineer", "blah blah blah", "01-02-2012", "hr@stripeless.com"));
    }

}
