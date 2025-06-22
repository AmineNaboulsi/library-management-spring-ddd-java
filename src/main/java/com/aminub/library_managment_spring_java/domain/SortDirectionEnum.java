package com.aminub.library_managment_spring_java.domain;

import org.springframework.data.domain.Sort;

public enum SortDirectionEnum {
    ASC, DESC ;
    public Sort.Direction toSpringDirection() {
        return this == ASC ? Sort.Direction.ASC : Sort.Direction.DESC;
    }
}
