package com.Test.portal.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {
    @Id
    private String courseId;
    private String courseTitle;
    private String Description;
    private String courseDuration;

    @ManyToMany
    @JoinTable(name="m_m",joinColumns = @JoinColumn(name = "aaaa"),inverseJoinColumns = @JoinColumn(name="bbbb"))
    List<Student> studentSet;
}
