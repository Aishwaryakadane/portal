package com.Test.portal.Repo;

import com.Test.portal.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepo extends JpaRepository<Course,String> {
}
