import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void films1() {
        PosterManager manager = new PosterManager();
        manager.addMovie("Films I");
        String[] expected = {"Films I"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void noFilms() {
        PosterManager manager = new PosterManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void severalFilms() {
        PosterManager manager = new PosterManager();
        manager.addMovie("Films I");
        manager.addMovie("Films II");
        manager.addMovie("Films III");
        manager.addMovie("Films IV");
        String[] expected = {"Films I", "Films II", "Films III", "Films IV"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void severalFilms1() {
        PosterManager manager = new PosterManager();
        manager.addMovie("Films I");
        manager.addMovie("Films II");
        manager.addMovie("Films III");
        manager.addMovie("Films IV");
        manager.addMovie("Films V");
        String[] expected = {"Films I", "Films II", "Films III", "Films IV", "Films V"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void severalFilms2() {
        PosterManager manager = new PosterManager();
        manager.addMovie("Films I");
        manager.addMovie("Films II");
        manager.addMovie("Films III");
        manager.addMovie("Films IV");
        manager.addMovie("Films V");
        manager.addMovie("Films VI");
        String[] expected = {"Films I", "Films II", "Films III", "Films IV", "Films V", "Films VI"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void moviesReverse() {
        PosterManager manager = new PosterManager();
        manager.addMovie("Films I");
        manager.addMovie("Films II");
        manager.addMovie("Films III");
        String[] expected = {"Films III", "Films II", "Films I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}



