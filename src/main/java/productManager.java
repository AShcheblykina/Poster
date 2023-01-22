public class productManager {
    productManager[] AllMovies = new productManager[0];
    private int limitMovieTitle;
    private String movieTitle;

    public productManager(String movieTitle) {
        this.movieTitle = movieTitle;
        this.limitMovieTitle = limitMovieTitle;
        int limitMovieTitle = 10;
    }

    public productManager(int limitMovieTitle) {
        this.limitMovieTitle = limitMovieTitle;
    }

    public productManager() {

    }

    public void added(productManager movieTitle) {
        productManager[] tmp = new productManager[AllMovies.length + 1];
        for (int i = 0; i < AllMovies.length; i++) {
            tmp[i] = AllMovies[i];
        }
        tmp[tmp.length - 1] = movieTitle;
        AllMovies = tmp;
    }

    public productManager[] AllMoviesTitle() {
        return AllMovies;

    }

    public productManager[] LastMovies() {
        int resultLength;
        if (AllMovies.length < 10) {
            resultLength = AllMovies.length;
        } else {
            resultLength = 10;
        }
        productManager[] tmp = new productManager[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = AllMovies[AllMovies.length - 1 - i];
        }
        return tmp;
    }


}

