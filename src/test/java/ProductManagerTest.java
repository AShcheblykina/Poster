
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {
    String allMovies1 = new String();
    String allMovies2 = new String();
    String allMovies3 = new String();
    String allMovies4 = new String();
    String allMovies5 = new String();
    String allMovies6 = new String();
    String allMovies7 = new String();
    String allMovies8 = new String();
    String allMovies9 = new String();
    String allMovies10 = new String();
    String allMovies11 = new String();
    String allMovies12 = new String();
    String allMovies13 = new String();
    String allMovies14 = new String();
    String allMovies15 = new String();


    @Test
    public void addedAllMovies() {
        ProductManager repo = new ProductManager();
        repo.added(allMovies1);
        repo.added(allMovies2);
        repo.added(allMovies3);
        repo.added(allMovies4);
        repo.added(allMovies5);
        repo.added(allMovies6);
        repo.added(allMovies7);
        repo.added(allMovies8);
        repo.added(allMovies9);
        repo.added(allMovies10);

        String[] expected = {allMovies1, allMovies2, allMovies3, allMovies4, allMovies5, allMovies6, allMovies7,
                allMovies8, allMovies9, allMovies10};
        String[] actual = repo.allMovies;

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addedFiveMovies() {
        ProductManager manager = new ProductManager();
        manager.added(allMovies1);
        manager.added(allMovies2);
        manager.added(allMovies3);
        manager.added(allMovies4);
        manager.added(allMovies5);

        String[] expected = {allMovies1, allMovies2, allMovies3, allMovies4, allMovies5};
        String[] actual = manager.allMovies;

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void changedOneMovies() {
        ProductManager repo = new ProductManager();
        repo.added(allMovies1);

        String[] expected = {allMovies1};
        String[] actual = repo.allMovies;

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void changedNineMovies() {
        ProductManager repo = new ProductManager();
        repo.added(allMovies1);
        repo.added(allMovies2);
        repo.added(allMovies3);
        repo.added(allMovies4);
        repo.added(allMovies5);
        repo.added(allMovies6);
        repo.added(allMovies7);
        repo.added(allMovies8);
        repo.added(allMovies9);

        String[] expected = {allMovies1, allMovies2, allMovies3, allMovies4, allMovies5, allMovies6, allMovies7,
                allMovies8, allMovies9};
        String[] actual = repo.allMovies;

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addedOneToMovies() {
        ProductManager repo = new ProductManager();
        repo.added(allMovies1);
        repo.added(allMovies2);


        String[] expected = {allMovies1, allMovies2,};
        String[] actual = repo.lastMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addedAllToMovies() {
        ProductManager repo = new ProductManager();
        repo.added(allMovies1);
        repo.added(allMovies2);
        repo.added(allMovies3);
        repo.added(allMovies4);
        repo.added(allMovies5);
        repo.added(allMovies6);
        repo.added(allMovies7);
        repo.added(allMovies8);
        repo.added(allMovies9);
        repo.added(allMovies10);

        String[] expected = {allMovies10, allMovies9, allMovies8, allMovies7, allMovies6, allMovies5, allMovies4,
                allMovies3, allMovies2, allMovies1};
        String[] actual = repo.lastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addedToLastMovies() {
        ProductManager repo = new ProductManager();
        repo.added(allMovies9);
        repo.added(allMovies10);

        String[] expected = {allMovies10, allMovies9};
        String[] actual = repo.lastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addedThreeMovies() {
        ProductManager repo = new ProductManager();
        repo.added(allMovies4);
        repo.added(allMovies5);
        repo.added(allMovies6);

        String[] expected = {allMovies6, allMovies5, allMovies4};
        String[] actual = repo.lastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AboveMinMovies() {
        ProductManager repo = new ProductManager();
        repo.lastMovies();

        String[] expected = {};
        String[] actual = repo.lastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AboveMaxMovies() {
        ProductManager manager = new ProductManager(15);
        manager.added(allMovies1);
        manager.added(allMovies2);
        manager.added(allMovies3);
        manager.added(allMovies4);
        manager.added(allMovies5);
        manager.added(allMovies6);
        manager.added(allMovies7);
        manager.added(allMovies8);
        manager.added(allMovies9);
        manager.added(allMovies10);
        manager.added(allMovies11);
        manager.added(allMovies12);
        manager.added(allMovies13);
        manager.added(allMovies14);
        manager.added(allMovies15);


        String[] expected = {allMovies15, allMovies14, allMovies13, allMovies12, allMovies11, allMovies10, allMovies9, allMovies8, allMovies7, allMovies6, allMovies5, allMovies4,
                allMovies3, allMovies2, allMovies1};
        String[] actual = manager.lastMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void LimitProduct() {
        ProductManager manager = new ProductManager(5);

        manager.added(allMovies1);
        manager.added(allMovies2);
        manager.added(allMovies3);
        manager.added(allMovies4);
        manager.added(allMovies5);
        manager.added(allMovies6);
        manager.added(allMovies7);
        manager.added(allMovies8);

        String[] expected = {allMovies5, allMovies4, allMovies3, allMovies2, allMovies1};
        String[] actual = manager.lastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void LimitFiveProduct() {
        ProductManager manager = new ProductManager(5);

        manager.added(allMovies1);
        manager.added(allMovies2);
        manager.added(allMovies3);
        manager.added(allMovies4);
        manager.added(allMovies5);

        String[] expected = {allMovies5, allMovies4, allMovies3, allMovies2, allMovies1};
        String[] actual = manager.lastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

}

