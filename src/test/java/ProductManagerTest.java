
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {
    Ribbonposter AllMovies1 = new Ribbonposter("1");
    Ribbonposter AllMovies2 = new Ribbonposter("2");
    Ribbonposter AllMovies3 = new Ribbonposter("3");
    Ribbonposter AllMovies4 = new Ribbonposter("4");
    Ribbonposter AllMovies5 = new Ribbonposter("5");
    Ribbonposter AllMovies6 = new Ribbonposter("6");
    Ribbonposter AllMovies7 = new Ribbonposter("7");
    Ribbonposter AllMovies8 = new Ribbonposter("8");
    Ribbonposter AllMovies9 = new Ribbonposter("9");
    Ribbonposter AllMovies10 = new Ribbonposter("10");


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
        Ribbonposter[] actual = repo.AllMovies;

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
        Ribbonposter[] actual = repo.AllMovies;

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void changedOneMovies() {
        ProductManager repo = new ProductManager();
        repo.added(AllMovies1);

        Ribbonposter[] expected = {AllMovies1};
        Ribbonposter[] actual = repo.AllMovies;

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
        Ribbonposter[] actual = repo.AllMovies;

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addedOneToMovies() {
        ProductManager repo = new ProductManager();
        repo.added(AllMovies1);
        repo.added(AllMovies2);


        Ribbonposter[] expected = {AllMovies2, AllMovies1};
        Ribbonposter[] actual = repo.LastMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addedAllToMovies() {
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

        Ribbonposter[] expected = {AllMovies10, AllMovies9, AllMovies8, AllMovies7, AllMovies6, AllMovies5, AllMovies4,
                AllMovies3, AllMovies2, AllMovies1};
        Ribbonposter[] actual = repo.LastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addedToLastMovies() {
        ProductManager repo = new ProductManager();
        repo.added(AllMovies9);
        repo.added(AllMovies10);

        Ribbonposter[] expected = {AllMovies10, AllMovies9};
        Ribbonposter[] actual = repo.LastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addedThreeMovies() {
        ProductManager repo = new ProductManager();
        repo.added(AllMovies4);
        repo.added(AllMovies5);
        repo.added(AllMovies6);

        Ribbonposter[] expected = {AllMovies6, AllMovies5, AllMovies4};
        Ribbonposter[] actual = repo.LastMovies();

        Assertions.assertArrayEquals(expected,actual);
    }


}

