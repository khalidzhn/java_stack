package com.example.mvc.controllers;


import com.example.mvc.models.Book;
import com.example.mvc.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;


@Controller
public class BooksController {
    private final BookService bookService;

    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/books")
    public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "books/index.jsp";
    }

    @RequestMapping("/books/new")
    public String newBook(@ModelAttribute("book") Book book) {
        return "/books/new.jsp";
    }
    @RequestMapping(value="/books", method= RequestMethod.POST)
    public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "/books/new.jsp";
        } else {
            bookService.createBook(book);
            return "redirect:/books";
        }
    }
    @RequestMapping(value = "/books/{id}")
    public String show(Model model,@PathVariable("id") Long id){

        Book book = bookService.findBook(id);
        model.addAttribute("book", book);
        return "/books/show.jsp";

    }

    @RequestMapping("/books/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        System.out.println("Edit");
        Book book = bookService.findBook(id);
        model.addAttribute("book", book);
        return "/books/edit.jsp";
    }

    @RequestMapping(value="/books/{id}/update")
    public String update(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        System.out.println("update");
        if (result.hasErrors()) {
            System.out.println("Error"+result);
            return "/books/edit.jsp";
        } else {
            System.out.println("XXX"+book);
            bookService.updateBook(book);
            return "redirect:/books";
        }
    }

        // other methods removed for brevity
        @RequestMapping(value="/books/{id}/delete", method = RequestMethod.POST)
        public String destroy(@PathVariable("id") Long id) {
            System.out.println("delete");
            bookService.deleteBook(id);
            return "redirect:/books";
        }
    }


