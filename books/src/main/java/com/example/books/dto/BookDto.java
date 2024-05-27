package com.example.books.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class BookDto {
    @Schema(
            description = "Name of the Book", example = "Atomic Habits"
    )
    @NotEmpty(message = "Title can not be a null or empty")
    @Size(min = 3, max = 50, message = "Title must be between 3 and 50 characters")
    private String title;

    @Schema(
            description = "Author of the Book", example = "Sai Lokesh"
    )
    @NotEmpty(message = "Author can not be a null or empty")
    @Size(min = 3, max = 50, message = "Author must be between 3 and 50 characters")
    private String authorName;

    @Schema(
            description = "Genre of the Book", example = "Self Help"
    )
    @NotEmpty(message = "Genre can not be a null or empty")
    private String genre;

    @Schema(
            description = "Published Year of the Book", example = "2020"
    )
    @NotEmpty(message = "Published Year can not be a null or empty")
    @DateTimeFormat(pattern = "yyyy")
    private Long publishedYear;
}
