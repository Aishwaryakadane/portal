package com.Test.portal.Service;

import com.Test.portal.Model.Course;
import com.Test.portal.Repo.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    ICourseRepo courseRepo;


    public String addCourse(Course course) {
        courseRepo.save(course);
        return "book added";
    }

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public String updatePriceById(String id, String duration) {
        Course course = courseRepo.findById(id).orElse(null);
        if(course!=null){
            course.setCourseDuration(duration);
            courseRepo.save(course);
            return "book price updated";
        }
        else{
            return id+"Id not found";
        }
    }

    public String removeById(String id) {
        courseRepo.deleteById(id);
        return "deleted";
    }
}