package br.com.studys.spring_boot_essentials.service;

import br.com.studys.spring_boot_essentials.database.model.AuthorEntity;

import java.util.ArrayList;
import java.util.List;

public class AuthorService {

    public static final List<AuthorEntity> AUTHORS = new ArrayList<>();

    static {
        AUTHORS.add(new AuthorEntity(1, "Dante Alighieri"));
        AUTHORS.add(new AuthorEntity(2, "Nagatsuki Tappei"));
        AUTHORS.add(new AuthorEntity(3, "Stephen King"));
        AUTHORS.add(new AuthorEntity(4, "Vladimir Nabokov"));
        AUTHORS.add(new AuthorEntity(5, "Brandon Sanderson"));
    }
}
