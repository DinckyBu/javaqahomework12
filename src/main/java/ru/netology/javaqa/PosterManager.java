package ru.netology.javaqa;

public class PosterManager {
    private String[] posters = new String[0];
    private int limit;

    public PosterManager() {
        this.limit = 5;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    //Added posters
    public void add(String poster) {
        String[] tmp = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    //вывод в порядке добавления
    public String[] findAll() {
        return posters;
    }

    //вывод в обратном порядке
    public String[] findlast() {
        int resultLength;
        if (posters.length < limit) {
            resultLength = posters.length;
        } else {
            resultLength = limit;
        }
        String[] reversed = new String[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = posters[resultLength - 1 - i];
        }
        return reversed;
    }
}
