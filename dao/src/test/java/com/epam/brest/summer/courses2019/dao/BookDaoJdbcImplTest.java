package com.epam.brest.summer.courses2019.dao;

import com.epam.brest.summer.courses2019.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BookDaoJdbcImplTest {

    BookDao bookDao = new BookDaoJdbcImpl();

    @Test
    void findAll() {
        List<Book> books = bookDao.findAll();
        Assert.assertNotNull(books);
        Assert.assertTrue(books.size() > 0);
    }
}
