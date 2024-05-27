package com.example.books.service.impl;

import com.example.books.dto.BookDto;
import com.example.books.entity.Author;
import com.example.books.entity.Book;
import com.example.books.mapper.BooksMapper;
import com.example.books.repository.AuthorRepository;
import com.example.books.repository.BooksRepository;
import com.example.books.service.IBooksService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class BooksService implements IBooksService {
    BooksRepository booksRepository;
    AuthorRepository authorRepository;

    @Override
    public void addBook(BookDto bookDto) {
        Book book = BooksMapper.maptoBook(bookDto);
        Optional<Book> optionalBook = booksRepository.findByTitle(book.getTitle());
        if (optionalBook.isPresent()) {
            throw new RuntimeException("Book already exists");
        }
        booksRepository.save(book);
        Optional<Author> optionalAuthor = authorRepository.findByName(bookDto.getAuthorName());
        if (optionalAuthor.isEmpty()) {
            createAuthor(book);
        }
    }

    private void createAuthor(Book book) {
        Author author = new Author();
        author.setName(book.getAuthorName());
    }

    @Override
    public BookDto getBook(String name, String authorName) {
        return null;
    }

    @Override
    public void deleteBook(String name, String authorName) {

    }

    @Override
    public boolean updateBook(int BookId, BookDto bookDto) {
        return false;
    }
}
