package com.example.books.mapper;

import com.example.books.dto.BookDto;
import com.example.books.entity.Book;

public class BooksMapper {
    public static BookDto maptoBookDto(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setTitle(book.getTitle());
        bookDto.setGenre(book.getGenre());
        bookDto.setPublishedYear(book.getPublishedYear());
        return bookDto;
    }

    public static Book maptoBook(BookDto bookDto) {
        Book book = new Book();
        book.setTitle(bookDto.getTitle());
        book.setGenre(bookDto.getGenre());
        book.setPublishedYear(bookDto.getPublishedYear());
        return book;
    }
}
