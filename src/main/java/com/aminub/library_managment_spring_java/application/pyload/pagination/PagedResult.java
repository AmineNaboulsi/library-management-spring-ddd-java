package com.aminub.library_managment_spring_java.application.pyload.pagination;

import lombok.Data;

import java.util.List;

@Data
public class PagedResult<T> {
    private int page;
    private int size;
    private long totalElements;
    private int totalPages;
    private boolean last;
    private T entities;
}