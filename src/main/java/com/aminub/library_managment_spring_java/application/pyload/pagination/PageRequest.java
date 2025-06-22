package com.aminub.library_managment_spring_java.application.pyload.pagination;

import com.aminub.library_managment_spring_java.domain.SortDirectionEnum;
import lombok.Data;
import org.hibernate.query.SortDirection;

/**
 *
 * @param <T>
 */
@Data
public class PageRequest<T> {
    private int page ;
    private int size ;
    private SortDirection sortDirection;
    private T filter ;
}
