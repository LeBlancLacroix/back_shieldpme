package br.com.studys.spring_boot_essentials.database.model;

public class AutorEntity {

    private Integer id;
    private String nome;

    public AutorEntity() {
    }

    public AutorEntity(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

}
