package com.Test.portal.Repo;

import com.Test.portal.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo extends JpaRepository<Book,String> {
}
