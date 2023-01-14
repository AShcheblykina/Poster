
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {
    Ribbonposter AllMovies1 = new Ribbonposter("bloodshot");
    Ribbonposter AllMovies2 = new Ribbonposter("gentlemen");
    Ribbonposter AllMovies3 = new Ribbonposter("invisibleMan");
    Ribbonposter AllMovies4 = new Ribbonposter("up");
    Ribbonposter AllMovies5 = new Ribbonposter("loathsomeEight");
    Ribbonposter AllMovies6 = new Ribbonposter("konstantin");
    Ribbonposter AllMovies7 = new Ribbonposter("shrek");
    Ribbonposter AllMovies8 = new Ribbonposter("veryScaryMovie");
    Ribbonposter AllMovies9 = new Ribbonposter("hercules");
    Ribbonposter AllMovies10 = new Ribbonposter("smurfs");

    @Test
    public void addedAllMovies() {
        ProductManager repo = new ProductManager();
        repo.added(AllMovies1);
        repo.added(AllMovies2);
        repo.added(AllMovies3);
        repo.added(AllMovies4);
        repo.added(AllMovies5);
        repo.added(AllMovies6);
        repo.added(AllMovies7);
        repo.added(AllMovies8);
        repo.added(AllMovies9);
        repo.added(AllMovies10);

        Ribbonposter[] expected = {AllMovies1, AllMovies2, AllMovies3, AllMovies4, AllMovies5, AllMovies6, AllMovies7,
                AllMovies8, AllMovies9, AllMovies10};
        Ribbonposter[] actual = repo.getAllMovieTitle();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addedFiveMovies() {
        ProductManager repo = new ProductManager();
        repo.added(AllMovies1);
        repo.added(AllMovies2);
        repo.added(AllMovies3);
        repo.added(AllMovies4);
        repo.added(AllMovies5);

        Ribbonposter[] expected = {AllMovies1, AllMovies2, AllMovies3, AllMovies4, AllMovies5};
        Ribbonposter[] actual = repo.getAllMovieTitle();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void changedOneMovies() {
        ProductManager repo = new ProductManager();
        repo.added(AllMovies1);

        Ribbonposter[] expected = {AllMovies1};
        Ribbonposter[] actual = repo.getAllMovieTitle();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void changedNineMovies() {
        ProductManager repo = new ProductManager();
        repo.added(AllMovies1);
        repo.added(AllMovies2);
        repo.added(AllMovies3);
        repo.added(AllMovies4);
        repo.added(AllMovies5);
        repo.added(AllMovies6);
        repo.added(AllMovies7);
        repo.added(AllMovies8);
        repo.added(AllMovies9);
        
        Ribbonposter[] expected = {AllMovies1, AllMovies2, AllMovies3, AllMovies4, AllMovies5, AllMovies6, AllMovies7,
                AllMovies8, AllMovies9};
        Ribbonposter[] actual = repo.getAllMovieTitle();

        Assertions.assertArrayEquals(expected, actual);
    }

}

