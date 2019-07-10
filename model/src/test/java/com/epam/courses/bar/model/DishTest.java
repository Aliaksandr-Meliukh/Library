package com.epam.courses.bar.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class DishTest {

    Dish Pizza=new Dish();

    @Test
    public void titleVerification() {
        Pizza.setTitle("New Pizza");
        assertTrue(Pizza.getTitle().equals("New Pizza"));
    }

    @Test
    public void DescriptionVerification() {
        Pizza.setDescription("New Pizza");
        assertTrue(Pizza.getDescription().equals("New Pizza"));
    }
}