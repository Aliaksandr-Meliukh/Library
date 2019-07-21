package com.epam.brest.summer.courses2019.dao;

import com.epam.brest.summer.courses2019.model.Book;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class BookDaoJdbcImpl implements BookDao {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private final static String SELECT_ALL =
            "select b.bookId, b.bookTitle, b.bookAuthor,b.genreId,b.quantity,b.booksOnHands,b.booksInHall,b.lastIssueDate from book b";

    public BookDaoJdbcImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public Book add(Book book) {
        return null;
    }

    @Override
    public void update(Book book) {

    }

    @Override
    public void delete(Integer bookId) {

    }

    @Override
    public List<Book> findAll() {
        List<Book> books =
                namedParameterJdbcTemplate.query(SELECT_ALL, new BookRowMapper());
        return books;
    }

    private class BookRowMapper implements RowMapper<Book> {
        @Override
        public Book mapRow(ResultSet resultSet, int i) throws SQLException {
            Book book = new Book();
            book.setBookId(resultSet.getInt("bookId"));
            book.setBookTitle(resultSet.getString("bookTitle"));
            book.setBookAuthor(resultSet.getString("bookAuthor"));
            book.setGenreId(resultSet.getInt("genreId"));
            book.setQuantity(resultSet.getInt("quantity"));
            book.setBooksOnHands(resultSet.getInt("booksOnHands"));
            book.setBooksInHall(resultSet.getInt("booksInHall"));
            book.setLastIssueDate(resultSet.getDate("lastIssueDate"));
            return book;
        }
    }

}
