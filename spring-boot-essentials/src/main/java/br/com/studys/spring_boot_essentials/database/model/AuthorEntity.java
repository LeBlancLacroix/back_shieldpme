package br.com.studys.spring_boot_essentials.database.model;

public class AuthorEntity {

    private Integer id;
    private String name;

    public AuthorEntity() {
    }

    public AuthorEntity(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
