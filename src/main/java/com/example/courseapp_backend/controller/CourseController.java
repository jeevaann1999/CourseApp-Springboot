package com.example.courseapp_backend.controller;

import com.example.courseapp_backend.model.Courses;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String AddCourse(@RequestBody Courses c){
        System.out.println(c.getCourseTitle().toString());
        System.out.println(c.getCourseDescription().toString());
        System.out.println(c.getCourseVenue().toString());
        System.out.println(c.getCourseDuration().toString());
        System.out.println(c.getCourseDate().toString());
        return "Course added successfully";
    }
}
