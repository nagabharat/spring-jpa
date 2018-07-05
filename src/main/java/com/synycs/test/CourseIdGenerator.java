package com.synycs.test;

import org.springframework.data.jpa.repository.Query;

public interface CourseIdGenerator {

    CourseId nextId();

}
