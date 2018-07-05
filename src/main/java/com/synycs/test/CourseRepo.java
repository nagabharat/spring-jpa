package com.synycs.test;

import io.vavr.collection.Seq;
import io.vavr.control.Option;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface CourseRepo extends CrudRepository<Course, CourseId> {

    Seq<Course> findCourseByName(String name);

    @Query("select max(t.id) from Course t")
    CourseId findTopById();

}