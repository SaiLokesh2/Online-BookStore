package com.example.books.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor @Getter
@Setter
@NoArgsConstructor
@Table(name = "authors")
public class Author extends BaseEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private Long authorId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "bio", nullable = false)
    private String bio;

    @Column(name = "country", nullable = false)
    private String country;
}
