package com.Test.portal.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Null;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Student {
    @Id
    private String studentId;
    private String studentName;
    private String studentAge;
    private String phoneNumber;
    private String branch;
    private String department;

    @OneToOne
    @JoinColumn(name = "fkey_address_Id")
     Address address;
}
