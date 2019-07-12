package com.epam.brest.summer.courses2019.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class BookTest {

    Book testBook = new Book();

    @Test
    public void getBookId() {
        testBook.setBookId(1);
        Assert.assertTrue(testBook.getBookId().equals(1));
    }

    @Test
    public void getBookTitle() {
        testBook.setBookTitle("Title");
        Assert.assertTrue(testBook.getBookTitle().equals("Title"));
    }

    @Test
    public void getBookAuthor() {
        testBook.setBookAuthor("Author");
        Assert.assertTrue(testBook.getBookAuthor().equals("Author"));
    }

    @Test
    public void getGenreId() {
        testBook.setGenreId(2);
        Assert.assertTrue(testBook.getGenreId().equals(2));
    }

    @Test
    public void getQuantity() {
        testBook.setQuantity(100);
        Assert.assertTrue(testBook.getQuantity().equals(100));
    }

    @Test
    public void getBooksOnHands() {
        testBook.setBooksOnHands(20);
        Assert.assertTrue(testBook.getBooksOnHands().equals(20));
    }

    @Test
    public void getBooksInHall() {
        testBook.setBooksInHall(30);
        Assert.assertTrue(testBook.getBooksInHall().equals(30));
    }

    @Test
    public void getLastIssueDate() {
        Date date = new Date();
        testBook.setLastIssueDate(date);
        Assert.assertTrue(testBook.getLastIssueDate().equals(date));
    }
}