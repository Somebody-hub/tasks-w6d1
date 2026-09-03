package org.exercises.service;


import org.exercises.model.Task;
import org.exercises.model.TaskStatus;

import java.util.List;
import java.util.Optional;

public class TaskService {

    public void showTaskList(List<Task> allTasks) {
        System.out.println("==Task List==");
        int c = 0;
        for (Task task : allTasks) {
                c++;
                System.out.println(task);
        }
        if (c == 0) {
            System.out.println("EMPTY");
        }
    }

    public void addTask(List<Task> allTasks, Task newTask) {
        allTasks.add(newTask);
        System.out.println("Added " + newTask);
    }

    public Optional<Task> findTaskById(List<Task> allTasks, int id) {
        if (allTasks == null) {
            return Optional.empty();
        }
        for (Task task : allTasks) {
            if (task.getId() == id) {
                return Optional.of(task);
            }
        }
        return Optional.empty();
    }


    public void changeTaskStatus(List<Task> allTasks, int id, TaskStatus taskStatus) {
        Optional<Task> foundTask = findTaskById(allTasks, id);
        if (foundTask.isEmpty()) {
            System.out.println("Task not found");
        } else {
            foundTask.get().setStatus(taskStatus);
            System.out.println("Status changed");
        }
    }

    public void showActiveTasks (List<Task> allTasks) {
        for (Task task: allTasks) {
            if((task.getStatus() == TaskStatus.ACTIVE)) {
                System.out.println(task);
            }
        }
    }
}




