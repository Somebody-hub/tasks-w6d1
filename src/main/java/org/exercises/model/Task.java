package org.exercises.model;


import java.util.Objects;

public class Task {
    private Long id;
    private String text;
    private TaskStatus status;
    private boolean deleted;

    public Task(Long id, String text, TaskStatus taskStatus) {
        this.id = id;
        this.text = text;
        this.status = taskStatus;
        this.deleted = false;
    }

    public Task(Long id, String text) {
        this(id, text, TaskStatus.NEW);
    }

    public Task(Long id) {
        this(id, "", TaskStatus.NEW);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Task: " +id + " " + text + " " + status;
    }
}
