package com.example.books.service;

import com.example.books.dto.BookDto;

public interface IBooksService {
    void addBook(BookDto bookDto);

    BookDto getBook(String name , String authorName);

    void deleteBook(String name , String authorName);

    boolean updateBook(int BookId, BookDto bookDto);
}
