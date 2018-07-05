package com.synycs.test;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
public class Course {

    private Course(){

    }

    @EmbeddedId
    private CourseId courseId;

    private String name;

}
