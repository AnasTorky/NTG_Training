package com.example.Session1_Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    public CourseRepo repo;
    public Course create(Course course){
        return repo.save(course);
    }
}
