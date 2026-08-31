package org.exercises;

import org.exercises.model.*;
import org.exercises.service.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        BookService bookService = new BookService();
        List<Book> TanenbaumBooks = new LinkedList<>();

        Book b1 = new Book(0L, "Structured Computer Organization", "Andrew Stuart Tanenbaum");
        Book b2 = new Book(2L, "The Art Of Computer Programming", "Donald Knuth");
        Book b3 = new Book(1L, "Core Java", "Key Horstmann");
        Book b4 = new Book(3L, "Modern Operating Systems", "Andrew Stuart Tanenbaum");
        bookService.showBookList(bookList);
        //AddBook
        bookService.addBook(bookList, b1);
        bookService.addBook(bookList, b2);
        bookService.addBook(bookList, b3);
        bookService.addBook(bookList, b4);
        bookService.showBookList(bookList);
        //FindByAuthor
        bookService.findBooksByAuthor(bookList, "Alexandr Pushkin");
        TanenbaumBooks = bookService.findBooksByAuthor(bookList, "Andrew Stuart Tanenbaum");
        bookService.showBookList(TanenbaumBooks);
        //CountRead
        bookService.markAsReadByTitle(bookList, "Core Java");
        bookService.markAsReadByTitle(bookList, "The Art Of Computer Programming");
        bookService.findBooksIsRead(bookList);


        List<Task> taskList = new ArrayList<>();
        TaskService taskService = new TaskService();

        Task t1 = new Task(0L, "Buy milk");
        Task t2 = new Task(1L, "Do homework");
        Task t3 = new Task(2L, "Read book");
        //Add task
        taskService.addTask(taskList, t1);
        taskService.addTask(taskList, t2);
        taskService.addTask(taskList, t3);
        taskService.showTaskList(taskList);
        //Change status
        taskService.changeTaskStatus(taskList, 1, TaskStatus.ACTIVE);
        taskService.changeTaskStatus(taskList, 2, TaskStatus.ACTIVE);
        //Show active
        taskService.showActiveTasks(taskList);


        List<Product> productList = new ArrayList<>();
        ProductService productService = new ProductService();

        Product p1 = new Product(0L, "Milk", 1.49);
        Product p2 = new Product(1L, "Bread", 0.49);
        Product p3 = new Product(2L, "Water", 0.99);

        productService.addProduct(productList, p1);
        productService.addProduct(productList, p2);
        productService.addProduct(productList, p3);
        productService.showProductList(productList);

        productService.findMoreExpensiveThan(productList, 0.5);
        productService.calculateTotalCost(productList);


        List<Student> studentList = new ArrayList<>();
        StudentService studentService = new StudentService();

        Student s1 = new Student(0L, "Alice", 4.24);
        Student s2 = new Student(1L, "Nick", 3.59);
        Student s3 = new Student(2L, "Bob", 4.71);

        studentService.addStudent(studentList, s1);
        studentService.addStudent(studentList, s2);
        studentService.addStudent(studentList, s3);

        studentService.showStudentList(studentList);

        studentService.findStudentByName(studentList, "Nick");

        studentService.calculateAvgGrade(studentList);
    }
}