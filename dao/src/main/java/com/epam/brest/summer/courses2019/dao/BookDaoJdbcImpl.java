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
            "select d.bookId, d.bookTitle from book d";

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
                namedParameterJdbcTemplate.query(SELECT_ALL, new DepartmentRowMapper());
        return books;
    }

    private class DepartmentRowMapper implements RowMapper<Book> {
        @Override
        public Book mapRow(ResultSet resultSet, int i) throws SQLException {
            Book department = new Book();
            department.setBookId(resultSet.getInt("bookId"));
            department.setBookTitle(resultSet.getString("bookTitle"));
            return department;
        }
    }

}
