package com.Test.portal.Service;

import com.Test.portal.Model.Book;
import com.Test.portal.Repo.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    IBookRepo bookRepo;

    public String addBooks(Book book) {
        bookRepo.save(book);
        return "book added";
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public String updatePriceById(String id, String price) {
        Book book = bookRepo.findById(id).orElse(null);
        if(book!=null){
            book.setBookPrice(price);
            bookRepo.save(book);
            return "book price updated";
        }
        else{
            return id+"Id not found";
        }
    }

    public String removeById(String id) {
        bookRepo.deleteById(id);
        return "deleted";
    }
}
