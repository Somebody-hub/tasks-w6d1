package org.exercises.model;


public class Task {
    private final Long id;
    private String title;
    private TaskStatus status;

    public Task(Long id, String title, TaskStatus status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }

    public Long getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Task: " + " " + title + " " + status;
    }
}
