public class ProductManager {
    String[] allMovies = new String[0];
    private int limitMovieTitle;
    private String movieTitle;

    public ProductManager(String movieTitle) {
        this.movieTitle = movieTitle;
        this.limitMovieTitle = limitMovieTitle;
        int limitMovieTitle = 10;
    }

    public ProductManager(int limitMovieTitle) {
        this.limitMovieTitle = limitMovieTitle;
    }

    public ProductManager() {

    }

    public void added(String movieTitle) {
        String[] tmp = new String[allMovies.length + 1];
        for (int i = 0; i < allMovies.length; i++) {
            tmp[i] = allMovies[i];
        }
        tmp[tmp.length - 1] = movieTitle;
        allMovies = tmp;
    }

    public String[] allMoviesTitle() {
        return allMovies;

    }

    public String[] LastMovies() {
        int resultLength;
        if (allMovies.length < 10) {
            resultLength = allMovies.length;
        } else {
            resultLength = 10;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = allMovies[allMovies.length - 1 - i];
        }
        return tmp;
    }


}