package com.synycs.test;

import io.vavr.control.Option;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.*;
import javax.transaction.Transactional;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseRepoIT {
    @Autowired
    CourseRepo courseRepo;
    @Autowired
    CourseIdGenerator courseIdGenerator;

    @SpringBootApplication
    static class Configuration {}

    @Test
    public void readsPersonIntoJavaslangOptionById() {

        Course first = courseRepo.save(new Course(courseIdGenerator.nextId(),"first"));

        Optional<Course> result = courseRepo.findById(first.getCourseId());

        assertThat(result.isPresent()).isTrue();
        assertThat(result.get()).isEqualTo(first);
    }
}
