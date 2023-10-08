package com.Test.portal.Repo;

import com.Test.portal.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptopRepo extends JpaRepository<Laptop, String> {
}
