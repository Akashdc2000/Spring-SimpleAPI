package com.springrestapi.firstrestapi.controller;


import com.springrestapi.firstrestapi.services.BookInterface;
import com.springrestapi.firstrestapi.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

 class Book{
     public String bookName;
}

@RestController
@RequestMapping("book")
public class BookController {

//    Tight Coupling of object
//    private BookService bookService=new BookService();

    
    @Autowired

//    Dependency Injection
    private BookService bookService;

//    Dependency Inversion
//    private BookInterface bookService;

    @GetMapping("")
    public String rootPath(){
        return "Welcome to Book Controller...";
    }
    @GetMapping("/books")
    public String getBook(){
        return bookService.getBooks();
    }

    @PostMapping("/books")
    public String addBook(@RequestBody Book book ){
        System.out.println(book.bookName);
        return bookService.addBook();
    }

    @PutMapping("/books/{id}")
    public String updateBook(@PathVariable String id){
        return bookService.updateBook(id);
    }

    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable String id){
        return bookService.deleteBook(id);
    }
}
