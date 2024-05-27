package com.example.books.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AuthorDto {

    @Schema(
            description = "Name of the Author", example = "Sai Lokesh"
    )
    @NotEmpty(message = "Name can not be a null or empty")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @NotEmpty(message = "Email can not be a null or empty")
    @Email(message = "Email should be valid")
    private String email;

    @NotEmpty(message = "Country can not be a null or empty")
    @Size(min = 3, max = 50, message = "Country must be between 3 and 50 characters")
    private String country;

    @NotEmpty(message = "Bio can not be a null or empty")
    @Size(min = 3, max = 100, message = "Bio must be between 3 and 100 characters")
    private String bio;
}
