package com.ing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class ZooTest {
    private Zoo zoo;

    @BeforeEach
    public void setUp() {
        zoo = new Zoo();
    }

    @Test
    void filterAndSortAnimals() {
        List<String> animals = Arrays.asList("Elefante", "Bicho Bola", "Jineta", "Asno");
        List<String> expected = Arrays.asList("bicho bola", "elefante", "jineta");

        List<String> actual = zoo.filterAnimals(animals);

        assertIterableEquals(expected, actual);
    }

    @Test
    void filterAndSortAnimalsWithNull() {

    }

    @Test
    void filterAndSortEmptyList() {
        List<String> animals =  Collections.emptyList();
        var expected = Collections.EMPTY_LIST;

        List<String> actual = zoo.filterAnimals(animals);

        assertIterableEquals(expected, actual);
    }

    @Test
    void filterAndSortEmptyListOneAnimal() {
        List<String> animals = List.of("Avestruz");
        var expected = Collections.EMPTY_LIST;

        List<String> actual = zoo.filterAnimals(animals);

        assertIterableEquals(expected, actual);
    }

    @Test
    void filterAndSortNull() {
        List<String> animals = null;
        var expected = Collections.EMPTY_LIST;

        List<String> actual = zoo.filterAnimals(animals);

        assertIterableEquals(expected, actual);

    }
}