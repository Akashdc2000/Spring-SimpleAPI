package com.springrestapi.firstrestapi.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service

public class BookService implements BookInterface{
    @Override
    public String getBooks() {
        return "All Book List Here...";
    }

    @Override
    public String updateBook(String id) {
        return "Book Id: "+id+" => This Book Updated Successfully...";
    }

    @Override
    public String deleteBook(String id) {
        return "Book Id: "+id+" => This Book Deleted Successfully...";
    }

    @Override
    public String addBook() {
        return "Book Added Successfully...";
    }
}
