package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testhascit()
    {
        CustomList li = new CustomList();
        City calg = new City("Calgary","AB");
        li.addCity(calg);
        assertTrue(li.hasCity(calg));
    }
    @Test
    public void testdelcit(){
        CustomList li = new CustomList();
        City calg = new City("Calgary","AB");
        li.addCity(calg);
        assertTrue(li.hasCity(calg));
        li.deleteCity(calg);
        assertFalse(li.hasCity(calg));
    }
    @Test
    public void testCountCit()
    {
        CustomList li = new CustomList();
        City calg = new City("Calgary","AB");
        City e = new City("Edmonton","AB");
        assertEquals(0, li.countCities());
        li.addCity(calg);
        assertEquals(1, li.countCities());
        li.addCity(e);
        assertEquals(2, li.countCities());
    }
}
