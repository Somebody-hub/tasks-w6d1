package org.exercises.model;

import java.util.Objects;

public class Book {
    private Long id;
    private String title;
    private String author;
    private boolean isRead;
    private boolean deleted;

    public Book(Long id, String title, String author, boolean isRead) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isRead = isRead;
        this.deleted = false;
    }

    public Book(Long id) {
        this(id, "", "", false);
    }

    public Book(Long id, String title, String author) {
        this(id, title, author, false);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public boolean isDeleted() {
        return !deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id != null && Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}
