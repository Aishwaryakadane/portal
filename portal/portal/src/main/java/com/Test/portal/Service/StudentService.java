package com.Test.portal.Service;

import com.Test.portal.Model.Student;
import com.Test.portal.Repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentRepo studentRepo;

    public String addStudent(Student stu) {
        studentRepo.save(stu);
        return "student added";
    }

    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    public String updateNoById(String id, String cell_no) {
        Student stu = studentRepo.findById(id).orElse(null);
        if(stu == null){
            return "Id not found";
        }else{
            stu.setPhoneNumber(cell_no);
            studentRepo.save(stu);
            return "updated";
        }
    }

    public String deleteById(String id) {
        studentRepo.deleteById(id);
        return "deleted";
    }
}
