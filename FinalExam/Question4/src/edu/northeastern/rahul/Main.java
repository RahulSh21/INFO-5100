package edu.northeastern.rahul;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Platform netflix = new Platform("Netflix");
        netflix.setGenres(addingGenre());
        Genre comedy = netflix.getGenres( "Comedy" );
        addAction(comedy);
        Genre action = netflix.getGenres("Action");
        addAction(action);


    }

    public static ArrayList<Genre> addingGenre(){
        Genre comedy = new Genre("Comedy");
        Genre action = new Genre("Action");
        ArrayList<Genre> list = new ArrayList<>();
        list.add(comedy);
        list.add(action);

        return list;

    }

    public static void addComedy(Genre genres){
        genres.addMovies(new Movie("abc", "1988/2/2", "actor1", "director1"));
        genres.addMovies(new Movie("def", "2000/2/2", "actor2", "director2"));
        genres.addMovies(new Movie("ghi", "2010/2/2", "actor3", "director3"));
    }

    public static void addAction(Genre genres){
        genres.addMovies(new Movie("xyz", "1979/2/2", "actor4", "director4"));
        genres.addMovies(new Movie("qwe", "1999/2/2", "actor5", "director5"));
        genres.addMovies(new Movie("asd", "2001/2/2", "actor6", "director6"));
    }

}
