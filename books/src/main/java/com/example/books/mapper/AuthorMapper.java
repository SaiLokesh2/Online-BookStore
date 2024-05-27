package com.example.books.mapper;

import com.example.books.dto.AuthorDto;
import com.example.books.entity.Author;

public class AuthorMapper {
    public static AuthorDto mapToAuthorDto(Author author) {
        AuthorDto authorDto = new AuthorDto();
        authorDto.setName(author.getName());
        authorDto.setBio(author.getBio());
        authorDto.setCountry(author.getCountry());
        return authorDto;
    }

    public static Author mapToAuthor(AuthorDto authorDto) {
        Author author = new Author();
        author.setName(authorDto.getName());
        author.setBio(authorDto.getBio());
        author.setCountry(authorDto.getCountry());
        return author;
    }
}
