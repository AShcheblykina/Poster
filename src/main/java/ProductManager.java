public class ProductManager {
    private String[] allMovies = new String[0];
    private int limitMovieTitle;


    public ProductManager() {
        this.limitMovieTitle = 10;
    }

    public ProductManager(int limitMovieTitle) {
        this.limitMovieTitle = limitMovieTitle;
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

    public String[] lastMovies() {
        int resultLength;
        if (allMovies.length < limitMovieTitle) {
            resultLength = allMovies.length;
        } else {
            resultLength = limitMovieTitle;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = allMovies[allMovies.length - 1 - i];
        }
        return tmp;
    }


}