package io.codelex.classesandobjects.practice.Exercise4;


public class Main {
    public static void main(String[] args) {

        Movie movie1 = new Movie("Casino Royale", "Eon Productions", "PG-13");
        Movie movie2 = new Movie("Glass", "Buena Vista International", "PG-13");
        Movie movie3 = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG");

        Movie[] movies = {movie1, movie2, movie3};
        getPG(movies);
    }

    private static Movie[] getPG(Movie[] movies) {
        Movie[] pgMovies = new Movie[movies.length];
        int movieIter = 0;
        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                pgMovies[movieIter] = movie;
                movieIter++;
            }
        }
        return pgMovies;
    }
}
