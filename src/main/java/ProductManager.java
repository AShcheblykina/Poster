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




}

