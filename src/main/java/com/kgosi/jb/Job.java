package com.kgosi.jb;

import javax.persistence.*;

@Entity
@Table
public class Job {
    @Id
    @SequenceGenerator(name = "job_sequence", sequenceName = "job_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "job_sequence")
    private Long id;
    private String name;
    private String description;
    private String dueDate;
    private String email;

    public Job() {
    }

    public Job(String name, String description, String dueDate, String email) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
