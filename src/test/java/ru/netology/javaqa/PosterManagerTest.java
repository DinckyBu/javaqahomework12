package ru.netology.javaqa;
//import org.junit.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    PosterManager manager = new PosterManager();

    @BeforeEach
    public void setup() {
        manager.add("Poster I");
        manager.add("Poster II");
        manager.add("Poster III");
        manager.add("Poster IV");
        manager.add("Poster V");
        manager.add("Poster VI");
    }

    @Test
    public void savedPoster() {

        String[] expected = {"Poster I", "Poster II", "Poster III", "Poster IV", "Poster V", "Poster VI"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {

        String[] expected = {"Poster V", "Poster IV", "Poster III", "Poster II", "Poster I"};
        String[] actual = manager.findlast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastAboveLimit() {
        PosterManager manager = new PosterManager(5);

        manager.add("Poster I");
        manager.add("Poster II");
        manager.add("Poster III");
        manager.add("Poster IV");
        manager.add("Poster V");
        manager.add("Poster VI");


        String[] expected = {"Poster V", "Poster IV", "Poster III", "Poster II", "Poster I"};
        String[] actual = manager.findlast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastBeforeLimit() {
        PosterManager manager = new PosterManager(5);

        manager.add("Poster I");
        manager.add("Poster II");
        manager.add("Poster III");

        String[] expected = {"Poster III", "Poster II", "Poster I"};
        String[] actual = manager.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
