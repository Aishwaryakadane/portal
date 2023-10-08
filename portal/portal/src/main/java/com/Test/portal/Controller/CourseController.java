package com.Test.portal.Controller;

import com.Test.portal.Model.Book;
import com.Test.portal.Model.Course;
import com.Test.portal.Service.BookService;
import com.Test.portal.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping("course")
    public String addBooks(@RequestBody Course course){
        return courseService.addCourse(course);
    }

    @GetMapping("course")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @PutMapping("update/course/{id}/{duration}")
    public String updatePriceById(@PathVariable String id , @RequestBody String duration){
        return courseService.updatePriceById(id,duration);
    }

    @DeleteMapping("course/remove/{id}")
    public String removeById(@PathVariable String id){
        return courseService. removeById(id);
    }


}

