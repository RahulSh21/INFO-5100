package edu.northeastern.rahul;

import java.util.ArrayList;
import java.util.List;

public class Genre {

    public ArrayList<Movie> movies;
    String name;

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Genre(String name){
        this.name = name;
        movies = new ArrayList<Movie>();
    }

    public void addMovies(Movie movies){
        this.movies.add(movies);
    }
}
