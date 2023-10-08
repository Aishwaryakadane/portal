package com.Test.portal.Repo;

import com.Test.portal.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student,String> {
}
