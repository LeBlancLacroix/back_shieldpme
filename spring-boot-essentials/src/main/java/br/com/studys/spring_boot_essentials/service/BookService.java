package br.com.studys.spring_boot_essentials.service;

import br.com.studys.spring_boot_essentials.database.model.AuthorEntity;
import br.com.studys.spring_boot_essentials.database.model.BookEntity;
import br.com.studys.spring_boot_essentials.database.model.CategoryEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    public static final List<AuthorEntity> AUTHORS = new ArrayList<>();

    static {
        AUTHORS.add(new AuthorEntity(1, "Dante Alighieri"));
        AUTHORS.add(new AuthorEntity(2, "Nagatsuki Tappei"));
        AUTHORS.add(new AuthorEntity(3, "Stephen King"));
        AUTHORS.add(new AuthorEntity(4, "Vladimir Nabokov"));
        AUTHORS.add(new AuthorEntity(5, "Brandon Sanderson"));
    }




}
