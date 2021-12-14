package edu.northeastern.rahul;

import java.util.Date;

public class Movie {
    public String getTitleOfMovie() {
        return titleOfMovie;
    }

    public void setTitleOfMovie(String titleOfMovie) {
        this.titleOfMovie = titleOfMovie;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    String titleOfMovie;
    Date releaseDate;
    String actor;
    String director;

    Movie(String titleOfMovie, String releaseDate, String actor, String director){
        this.titleOfMovie = titleOfMovie;
        this.actor = actor;
        this.director = director;
        String[] date = releaseDate.split("/");
        int year = Integer.parseInt(date[0]) - 1900);
        int month = Integer.parseInt(date[1]) - 1;
        int day = Integer.parseInt(date[2]);
        this.releaseDate = new Date(year,month,day);
    }
}
