package com.kgosi.jb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobsRepository extends JpaRepository<Job, Long> {

}
