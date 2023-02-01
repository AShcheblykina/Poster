
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
        ProductManager manager = new ProductManager();
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

        String[] expected = {allMovies1, allMovies2, allMovies3, allMovies4, allMovies5, allMovies6, allMovies7,
                allMovies8, allMovies9, allMovies10};
        String[] actual = manager.lastMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addedFiveMovies() {
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

    @Test
    public void changedOneMovies() {
        ProductManager manager = new ProductManager();
        manager.added(allMovies1);

        String[] expected = {allMovies1};
        String[] actual = manager.lastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void changedNineMovies() {
        ProductManager manager = new ProductManager();

        manager.added(allMovies1);
        manager.added(allMovies2);
        manager.added(allMovies3);
        manager.added(allMovies4);
        manager.added(allMovies5);
        manager.added(allMovies6);
        manager.added(allMovies7);
        manager.added(allMovies8);
        manager.added(allMovies9);

        String[] expected = {allMovies1, allMovies2, allMovies3, allMovies4, allMovies5, allMovies6, allMovies7,
                allMovies8, allMovies9};
        String[] actual = manager.lastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addedOneToMovies() {
        ProductManager manager = new ProductManager();

        manager.added(allMovies1);
        manager.added(allMovies2);


        String[] expected = {allMovies1, allMovies2,};
        String[] actual = manager.lastMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addedAllToMovies() {
        ProductManager manager = new ProductManager();

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

        String[] expected = {allMovies10, allMovies9, allMovies8, allMovies7, allMovies6, allMovies5, allMovies4,
                allMovies3, allMovies2, allMovies1};
        String[] actual = manager.lastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addedToLastMovies() {
        ProductManager manager = new ProductManager();

        manager.added(allMovies9);
        manager.added(allMovies10);

        String[] expected = {allMovies10, allMovies9};
        String[] actual = manager.lastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addedThreeMovies() {
        ProductManager manager = new ProductManager(5);

        manager.added(allMovies1);
        manager.added(allMovies2);
        manager.added(allMovies3);

        String[] expected = {allMovies3, allMovies2, allMovies1};
        String[] actual = manager.lastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AboveMinMovies() {
        ProductManager manager = new ProductManager();

        manager.lastMovies();

        String[] expected = {};
        String[] actual = manager.lastMovies();

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
        ProductManager manager = new ProductManager(10);

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

        String[] expected = {allMovies10, allMovies9, allMovies8, allMovies7, allMovies6, allMovies5, allMovies4, allMovies3, allMovies2, allMovies1};
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
        manager.added(allMovies6);
        manager.added(allMovies7);
        manager.added(allMovies8);

        String[] expected = {allMovies8,allMovies7,allMovies6,allMovies5, allMovies4};
        String[] actual = manager.lastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

}

