package com.Test.portal.Repo;

import com.Test.portal.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address, Long> {
}
