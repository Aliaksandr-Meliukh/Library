package com.epam.brest.summer.courses2019.model;

import java.util.Date;

/**
 * POJO Book for model.
 */
public class Book {

    /**
     * Book Id.
     */
    private Integer bookId;

    /**
     * Book title.
     */
    private String bookTitle;

    /**
     * Author of this book.
     */
    private String bookAuthor;

    /**
     * Genre Id.
     */
    private Integer genreId;

    /**
     * Total quantity of books.
     */
    private Integer quantity;

    /**
     * Quantity of books on the hand.
     */
    private Integer booksOnHands;

    /**
     * Quantity of books in the hall
     */
    private Integer booksInHall;

    /**
     * Last issue date
     */
    private Date lastIssueDate;

    /**
     * Returns <code>Integer</code> representation of this getBookId.
     *
     * @return getBookId Book Id.
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * Sets the book's identifier.
     *
     * @param bookId Book Id.
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * Returns <code>String</code> representation of this bookTitle.
     *
     * @return bookTitle Book Title.
     */
    public String getBookTitle() {
        return bookTitle;
    }

    /**
     * Sets the book's title.
     *
     * @param bookTitle Book Title.
     */
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getBooksOnHands() {
        return booksOnHands;
    }

    public void setBooksOnHands(Integer booksOnHands) {
        this.booksOnHands = booksOnHands;
    }

    public Integer getBooksInHall() {
        return booksInHall;
    }

    public void setBooksInHall(Integer booksInHall) {
        this.booksInHall = booksInHall;
    }

    public Date getLastIssueDate() {
        return lastIssueDate;
    }

    public void setLastIssueDate(Date lastIssueDate) {
        this.lastIssueDate = lastIssueDate;
    }

}
