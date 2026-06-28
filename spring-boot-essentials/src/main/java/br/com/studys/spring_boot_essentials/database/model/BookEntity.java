package br.com.studys.spring_boot_essentials.database.model;

import java.math.BigDecimal;

public class BookEntity {

    private Integer id;
    private String title;
    private Integer pages;
    private BigDecimal price;

    public BookEntity() {
    }

    public BookEntity(Integer id, String title, Integer pages, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.pages = pages;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPages() {
        return pages;
    }
    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                '}';
    }



}
