package com.Test.portal.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Laptop {
    @Id
    private String laptopId;
    private String laptopName;
    private String laptopBrand;
    private String laptopPrice;


    @OneToOne
    @JoinColumn(name = "fkey_student_id")
    Student student;
}
