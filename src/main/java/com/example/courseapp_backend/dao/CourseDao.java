package com.example.courseapp_backend.dao;

import com.example.courseapp_backend.model.Courses;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Courses,Integer> {
}
