package org.exercises.model;


import java.util.Objects;

public class Task {
    private final Long id;
    private String text;
    private TaskStatus status;

    public Task(Long id, String text, TaskStatus status) {
        this.id = id;
        this.text = text;
        this.status = status;
    }

    public Long getId() {
        return id;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Task: " + " " + text + " " + status;
    }
}
