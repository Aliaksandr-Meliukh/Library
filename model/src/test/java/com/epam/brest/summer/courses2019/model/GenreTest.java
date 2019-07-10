package com.epam.brest.summer.courses2019.model;

import org.junit.Assert;
import org.junit.Test;

public class GenreTest {

    Genre testGerne = new Genre();

    @Test
    public void getGenreName() {
    testGerne.setGerneName("Fantastic");
        Assert.assertTrue(testGerne.getGerneName().equals("Fantastic"));
    }
}
