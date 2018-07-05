package com.synycs.test;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Embeddable;
import java.io.Serializable;

@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class CourseId implements Serializable  {
    private Long id;

    private CourseId(){

    }
    public static CourseId from(String issueId) {
        return new CourseId(Long.valueOf(issueId));
    }

    public Long value() {
        return id;
    }

    public CourseId next() {
        return new CourseId(++id);
    }
}
