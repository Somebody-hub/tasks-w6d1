package org.exercises.service;

import org.exercises.model.Book;

import java.util.*;
import java.util.stream.Collectors;

public class BookService {

    public void showBookList(List<Book> allBooks) {
        System.out.println("==Book List==");
        int c = 0;
        for (Book book : allBooks) {
                c++;
                System.out.println(book);

        }
        if (c == 0) {
            System.out.println("EMPTY");
        }
    }

    public Optional<Book> findBookByTitle(List<Book> allBooks, String title) {
        if (allBooks == null || title == null) {
            return Optional.empty();
        }
        for (Book book : allBooks) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();

    }

    public void addBook(List<Book> allBooks, Book newBook) {
        allBooks.add(newBook);
        System.out.println("Book added: " + newBook);
    }


    public List<Book> findBooksByAuthor(List<Book> allBooks, String author) {
        List<Book> foundBooks = allBooks.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());

        int count = foundBooks.size();
        System.out.println("Found " + count + " book" + (count > 1 ? "s" : "") + " by " + author);

        return foundBooks;
    }

    public void markAsReadByTitle(List<Book> allBooks, String title) {
        Optional<Book> bookOpt = findBookByTitle(allBooks, title);
        if (bookOpt.isEmpty()) {
            System.out.println("Book not found");
        } else {
            bookOpt.get().setIsRead(true);
            System.out.println("Book read: " + bookOpt.get());
        }
    }


    public List<Book> findBooksIsRead(List<Book> allBooks) {
        List<Book> readBooks = new ArrayList<>();
        int c = 0;
        for (Book book : allBooks) {
            if (!book.getIsRead()) {
                readBooks.add(book);
                c++;
            }
        }
        if (c == 0) {
            System.out.println("No read books");
            return readBooks;
        }
        System.out.println("Found " + c + " read book" + ((c > 1) ? "s" : ""));
        return readBooks;
    }

}
