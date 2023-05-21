package org.example;

import java.util.ArrayList;
import java.util.List;

public class Viewer {
    private String nickname;
    private int age;
    private int watchedMoviesCount;
    private List<Cinema> watchedMovies = new ArrayList<>();

    public Viewer(String nickname, int age, int watchedMoviesCount) {
        this.nickname = nickname;
        this.age = age;
        this.watchedMoviesCount = watchedMoviesCount;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWatchedMoviesCount() {
        return watchedMoviesCount;
    }

    public void addMovie(Cinema movie) {
        watchedMovies.add(movie);
        watchedMoviesCount = watchedMovies.size();
    }
}
