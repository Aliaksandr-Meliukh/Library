package com.epam.brest.summer.courses2019.dao;

import com.epam.brest.summer.courses2019.model.Book;

import java.util.List;

public interface BookDao {

    Book add(Book book);

    void update(Book book);

    void delete(Integer bookId);

    List<Book> findAll();

}
