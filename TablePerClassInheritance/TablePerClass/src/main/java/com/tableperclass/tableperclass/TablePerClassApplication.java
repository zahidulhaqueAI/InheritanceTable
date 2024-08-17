package com.tableperclass.tableperclass;

import com.tableperclass.tableperclass.model.BlogType;
import com.tableperclass.tableperclass.model.Book;
import com.tableperclass.tableperclass.repository.BlogTypeI;
import com.tableperclass.tableperclass.repository.BookRepoI;
import com.tableperclass.tableperclass.repository.PublisherRepoI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TablePerClassApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                SpringApplication.run(TablePerClassApplication.class, args);

        PublisherRepoI bookRepo = context.getBean(BookRepoI.class);
        PublisherRepoI blogRepo = context.getBean(BlogTypeI.class);


        Book book = new Book();
        book.setAuthor("Jack Bauer");
        book.setPages(500L);
        bookRepo.save(book);

        BlogType blog = new BlogType();
        blog.setTitle("Java Inheritance");
        blog.setDescription("Java book on inheritance");
        blogRepo.save(blog);


    }

}
