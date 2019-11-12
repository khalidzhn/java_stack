package com.example.mvc.services;

import com.example.mvc.models.Book;
import com.example.mvc.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }

    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }

    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }


    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    public Book update(Long id, String title, String description,String language, Integer pages){
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            Book updatedBook = optionalBook.get();
            updatedBook.setTitle(title);
            updatedBook.setDescription(description);
            updatedBook.setLanguage(language);
            updatedBook.setNumberOfPages(pages);
            return bookRepository.save(updatedBook);
        } else {
            return null;
        }
    }

}
