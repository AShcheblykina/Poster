
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class productManagerTest {
    productManager AllMovies1 = new productManager("1");
    productManager AllMovies2 = new productManager("2");
    productManager AllMovies3 = new productManager("3");
    productManager AllMovies4 = new productManager("4");
    productManager AllMovies5 = new productManager("5");
    productManager AllMovies6 = new productManager("6");
    productManager AllMovies7 = new productManager("7");
    productManager AllMovies8 = new productManager("8");
    productManager AllMovies9 = new productManager("9");
    productManager AllMovies10 = new productManager("10");


    @Test
    public void addedAllMovies() {
        productManager repo = new productManager();
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

        productManager[] expected = {AllMovies1, AllMovies2, AllMovies3, AllMovies4, AllMovies5, AllMovies6, AllMovies7,
                AllMovies8, AllMovies9, AllMovies10};
        productManager[] actual = repo.AllMovies;

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addedFiveMovies() {
        productManager repo = new productManager();
        repo.added(AllMovies1);
        repo.added(AllMovies2);
        repo.added(AllMovies3);
        repo.added(AllMovies4);
        repo.added(AllMovies5);

        productManager[] expected = {AllMovies1, AllMovies2, AllMovies3, AllMovies4, AllMovies5};
        productManager[] actual = repo.AllMovies;

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void changedOneMovies() {
        productManager repo = new productManager();
        repo.added(AllMovies1);

        productManager[] expected = {AllMovies1};
        productManager[] actual = repo.AllMovies;

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void changedNineMovies() {
        productManager repo = new productManager();
        repo.added(AllMovies1);
        repo.added(AllMovies2);
        repo.added(AllMovies3);
        repo.added(AllMovies4);
        repo.added(AllMovies5);
        repo.added(AllMovies6);
        repo.added(AllMovies7);
        repo.added(AllMovies8);
        repo.added(AllMovies9);

        productManager[] expected = {AllMovies1, AllMovies2, AllMovies3, AllMovies4, AllMovies5, AllMovies6, AllMovies7,
                AllMovies8, AllMovies9};
        productManager[] actual = repo.AllMovies;

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addedOneToMovies() {
        productManager repo = new productManager();
        repo.added(AllMovies1);
        repo.added(AllMovies2);


        productManager[] expected = {AllMovies2, AllMovies1};
        productManager[] actual = repo.LastMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addedAllToMovies() {
        productManager repo = new productManager();
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

        productManager[] expected = {AllMovies10, AllMovies9, AllMovies8, AllMovies7, AllMovies6, AllMovies5, AllMovies4,
                AllMovies3, AllMovies2, AllMovies1};
        productManager[] actual = repo.LastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addedToLastMovies() {
        productManager repo = new productManager();
        repo.added(AllMovies9);
        repo.added(AllMovies10);

        productManager[] expected = {AllMovies10, AllMovies9};
        productManager[] actual = repo.LastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addedThreeMovies() {
        productManager repo = new productManager();
        repo.added(AllMovies4);
        repo.added(AllMovies5);
        repo.added(AllMovies6);

        productManager[] expected = {AllMovies6, AllMovies5, AllMovies4};
        productManager[] actual = repo.LastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }


}

