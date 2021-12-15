package edu.northeastern.rahul;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Platform netflix = new Platform("Netflix");
        netflix.setGenres(addingGenre());
        Genre comedy = netflix.getGenres( "Comedy" );
        addComedy(comedy);
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

    netflix.list.stream()
            .flatMap(genre -> genre.list.stream())
            .filter(movie -> movie.ReleaseDate.before(twoThousand))
            .forEach(movie -> movie.Title = movie.Title + "(Classic)");


    List<Movie> ans = netflix.list.stream().flatMap(genre -> genre.list.stream()).sorted(new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.ReleaseDate.compareTo(o1.ReleaseDate);
        }
    }).limit(3).collect(Collectors.toList());


    <Movie> listOfAllMovie = netflix.list.stream().flatMap(genre -> genre.list.stream()).collect(Collectors.toList());
    Predicate<Movie> dateBefore2000 = movie -> movie.ReleaseDate.before(twoThousand);
    Predicate<Movie> dateAfter1990 = movie -> movie.ReleaseDate.after(nineteenHundred);
    printMovieInRange((ArrayList<Movie>) listOfAllMovie, dateBefore2000, dateAfter1990);


        for(Movie movie : listOfAllMovie) addReleaseYear(movie);


        Collections.sort(listOfAllMovie, new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.Title.compareTo(o2.Title);
        }
    });
}

    private static void printMovieInRange(ArrayList<Movie> res, Predicate<Movie> condition1, Predicate<Movie> condition2){
        for (Movie movie: res) {
            if(condition1.test(movie) && condition2.test(movie)){
                System.out.println(movie.titleOfMovie);
            }
        }
    }

    private static void addReleaseYear(Movie movie) {
        SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy");
        String year = dayFormat.format(movie.releaseDate);
        movie.titleOfMovie = movie.titleOfMovie + year;
    }


}
