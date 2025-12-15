package ru.job4j.articles.model;

public class Article {

    private int id;

    private final String text;

    public Article(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public Article(String text) {
        this.text = text;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }
}
