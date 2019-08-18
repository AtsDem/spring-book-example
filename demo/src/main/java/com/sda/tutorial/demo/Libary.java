package com.sda.tutorial.demo;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Libary {

    private List<Book> bookList;
    private String name;
    private String adress;

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Libary{" +
                "bookList=" + bookList +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
