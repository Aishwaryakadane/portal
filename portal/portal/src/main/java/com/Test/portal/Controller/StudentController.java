package com.Test.portal.Controller;

import com.Test.portal.Model.Student;
import com.Test.portal.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public String addStudent(@RequestBody Student stu){
        return studentService.addStudent(stu);
    }

    @GetMapping("student")
    public List<Student> getStudent(){
        return studentService.getStudents();
    }

    @PutMapping("update/{id}/{cell_no}")
    public String updateNoById(@PathVariable String id, @PathVariable String cell_no){
        return studentService.updateNoById(id,cell_no);
    }

    @DeleteMapping("deleting/{id}")
    public String deleteById(@PathVariable String id){
        return studentService.deleteById(id);
    }
}
