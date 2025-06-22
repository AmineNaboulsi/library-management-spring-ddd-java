package com.aminub.library_managment_spring_java.application.pyload.pagination;

import com.aminub.library_managment_spring_java.domain.enums.SortDirectionEnum;
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
    private SortDirectionEnum sortDirection;
    private T filter ;
}
