package com.synycs.test;

import io.vavr.control.Option;
import org.junit.Assert;
import org.junit.Test;

public class CourseTest {
    @Test
    public void test(){
        Course course=new Course(new CourseId(1L),"1");
        Assert.assertEquals(course.getCourseId(),new CourseId(1L));
    }
}
