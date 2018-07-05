package com.synycs.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JpaIdGenerator implements CourseIdGenerator {
    private final CourseRepo issueRepository;

    @Autowired
    public JpaIdGenerator(CourseRepo issueRepository) {
        this.issueRepository = issueRepository;
    }

    @Override
    public CourseId nextId() {
        CourseId currentId = issueRepository.findTopById();
        return currentId == null ? CourseId.from("1") : currentId.next();
    }
}
