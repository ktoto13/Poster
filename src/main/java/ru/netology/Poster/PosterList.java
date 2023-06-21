package ru.netology.Poster;

public class PosterList {
    private String[] movies = new String[0]; // нет фильмов после создания
    private final int defaultCountMovie; // количество фильмов по умолчанию

    public PosterList(int defaultCountMovie) {
        this.defaultCountMovie = defaultCountMovie;
    }

    public PosterList() {
        this.defaultCountMovie = 10;
    }

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < defaultCountMovie) {
            resultLength = movies.length;
        } else {
            resultLength = defaultCountMovie;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
