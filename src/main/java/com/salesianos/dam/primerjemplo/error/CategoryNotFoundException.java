package com.salesianos.dam.primerjemplo.error;

import com.salesianos.dam.primerjemplo.model.Category;

public class CategoryNotFoundException extends RuntimeException {

    public CategoryNotFoundException(Long id) {
        super("Category not found with id " + id);
    }

    public CategoryNotFoundException(String message) {
        super(message);
    }
}
