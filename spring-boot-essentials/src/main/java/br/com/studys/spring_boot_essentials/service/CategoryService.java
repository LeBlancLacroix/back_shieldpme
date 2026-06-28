package br.com.studys.spring_boot_essentials.service;

import br.com.studys.spring_boot_essentials.database.model.CategoryEntity;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {

    public static final List<CategoryEntity> CATEGORIES = new ArrayList<>();

    static {
        CATEGORIES.add(new CategoryEntity(1, "Fantasy"));
        CATEGORIES.add(new CategoryEntity(2, "Horror"));
        CATEGORIES.add(new CategoryEntity(3, "Suspense"));
        CATEGORIES.add(new CategoryEntity(4, "Drama"));
        CATEGORIES.add(new CategoryEntity(5, "Romance"));
    }
}
