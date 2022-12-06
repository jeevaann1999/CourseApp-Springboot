package com.example.courseapp_backend.controller;

import com.example.courseapp_backend.dao.CourseDao;
import com.example.courseapp_backend.model.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String AddCourse(@RequestBody Courses c){
        System.out.println(c.getCourseTitle().toString());
        System.out.println(c.getCourseDescription().toString());
        System.out.println(c.getCourseVenue().toString());
        System.out.println(c.getCourseDuration().toString());
        System.out.println(c.getCourseDate().toString());
        dao.save(c);
        return "Course added successfully";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Courses>  ViewCourse(){
        return (List<Courses>) dao.findAll();
    }
}
