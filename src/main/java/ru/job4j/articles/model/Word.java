package ru.job4j.articles.model;

public class Word {

    private int id;

    private final String value;

    public Word(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }
}
