package br.com.studys.spring_boot_essentials.database.model;

import java.math.BigDecimal;

public class LivroEntity {

    private Integer id;
    private String titulo;
    private Integer paginas;
    private BigDecimal preco;

    public LivroEntity() {
    }

    public LivroEntity(Integer id, String titulo, String autor, Integer paginas, BigDecimal preco, String categoria) {
        this.id = id;
        this.titulo = titulo;
        this.paginas = paginas;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getPaginas() {
        return paginas;
    }
    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "LivroEntity{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", paginas=" + paginas +
                ", preco=" + preco +
                ", autor='" + autor + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }



}
