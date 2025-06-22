package com.aminub.library_managment_spring_java.infractructure.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;

/**
 * Book Filter DTO
 * Used for filtering and searching books
 */
@Data
public class BookFilter {
    private String title;
    private String author;
    private String genre;
    private String isbn;

    @Min(value = 1000, message = "Publication year must be at least 1000")
    @Max(value = 3000, message = "Publication year must be at most 3000")
    private Integer publicationYear;

    @Min(value = 1000, message = "Start year must be at least 1000")
    @Max(value = 3000, message = "Start year must be at most 3000")
    private Integer publicationYearStart;

    @Min(value = 1000, message = "End year must be at least 1000")
    @Max(value = 3000, message = "End year must be at most 3000")
    private Integer publicationYearEnd;

}
