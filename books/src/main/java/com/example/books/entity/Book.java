package com.example.books.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor @Getter
@Setter @NoArgsConstructor
@Table(name = "books")
public class Book extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long bookId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private Long authorId;

    @Column(name = "genre", nullable = false)
    private String genre;

    @Column(name = "published_year", nullable = false)
    private Long publishedYear;

    @Column(name = "quantity_available", nullable = false)
    private Long quantityAvailable;
}
