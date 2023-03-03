package com.springrestapi.firstrestapi.services;

public interface BookInterface {

    public String getBooks();
    public String updateBook(String id);
    public String deleteBook(String id);
    public String addBook();
}
