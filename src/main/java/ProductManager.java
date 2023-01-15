public class ProductManager {
    Ribbonposter[] AllMovies = new Ribbonposter[0];

    public void added(Ribbonposter movieTitle) {
        Ribbonposter[] tmp = new Ribbonposter[AllMovies.length +1];
        for (int i = 0; i < AllMovies.length; i++ ) {
            tmp[i] = AllMovies[i];
        }
        tmp[tmp.length-1] = movieTitle;
        AllMovies = tmp;
    }
    public Ribbonposter[] AllMoviesTitle() {
        return AllMovies;

    }
    public Ribbonposter[] LastMovies() {
        int resultLength;
        if (AllMovies.length < 10) {
            resultLength = AllMovies.length;
        } else {
            resultLength = 10;
    }
        Ribbonposter[] tmp = new Ribbonposter[resultLength];
        for (int i = 0; i < tmp.length; i ++) {
            tmp[i] = AllMovies[AllMovies.length -1 - i];
        }
        return tmp;
    }



}

