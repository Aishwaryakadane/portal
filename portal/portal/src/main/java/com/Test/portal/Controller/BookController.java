package com.Test.portal.Controller;
import com.Test.portal.Model.Book;
import com.Test.portal.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("book")
    public String addBooks(@RequestBody Book book){
        return bookService.addBooks(book);
    }

    @GetMapping("book")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PutMapping("update/book/{id}/{price}")
    public String updatePriceById(@PathVariable String id , @RequestBody String price){
        return bookService.updatePriceById(id,price);
    }

    @DeleteMapping("remove/{id}")
    public String removeById(@PathVariable String id){
        return bookService. removeById(id);
    }


}
