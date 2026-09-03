package org.exercises.model;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private boolean isRead;


    public Book(String title, String author, boolean isRead) {
        this.title = title;
        this.author = author;
        this.isRead = isRead;
    }

    public Book(String title, String author) {
        this(title, author, false);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(boolean isRead) {
        this.isRead = isRead;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}
