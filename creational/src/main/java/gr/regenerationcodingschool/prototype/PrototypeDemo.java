package gr.regenerationcodingschool.prototype;

public class PrototypeDemo {

    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Pirates of the Caribbean");
        printMovie(movie);

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("Gang of Four");
        printMovie(anotherMovie);


        //We change the case color and print again the movies
        anotherMovie.getItemCase().setColor("red");
        printMovie(movie);
        printMovie(anotherMovie);
    }

    private static void printMovie(Movie movie) {
        System.out.println(movie);
        System.out.println("\n");
    }
}
