package com.epam.brest.summer.courses2019.dao;

import com.epam.brest.summer.courses2019.model.Book;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:test-db.xml", "classpath*:test-dao.xml"})

public class BookDaoJdbcImplTest {

    @Autowired
    BookDao bookDao;

    @Test
    public void findAll() {
        List<Book> books = bookDao.findAll();
        Assert.assertNotNull(books);
        Assert.assertTrue(books.size() > 0);
    }
}
