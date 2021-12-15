package edu.northeastern.rahul;

import java.util.ArrayList;
import java.util.List;

public class Platform {
    String name;
    public ArrayList<Genre> genres;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Genre> getGenres(String name) {
        return genres;
    }

    public void setGenres(ArrayList<Genre> genres) {
        this.genres = genres;
    }

    Platform(String name){
        this.name = name;
        genres = new ArrayList<Genre>();
    }

    public void addGenre(Genre genre){
        this.genres.add(genre);
    }
}
