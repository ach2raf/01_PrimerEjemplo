package com.salesianos.dam.primerjemplo.service;

import com.salesianos.dam.primerjemplo.error.CategoryNotFoundException;
import com.salesianos.dam.primerjemplo.model.Category;
import com.salesianos.dam.primerjemplo.repo.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

public Category findById(Long id){
    return categoryRepository.findById(id)
            .orElseThrow(()->new CategoryNotFoundException(id));
}

public Category addCategory(Category category){
    return categoryRepository.save(category);
}

}
