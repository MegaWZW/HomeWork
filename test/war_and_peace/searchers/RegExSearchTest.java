package war_and_peace.searchers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegExSearchTest {

    @Test
    public void searchTest1() {
        RegExSearch s = new RegExSearch();
        Assertions.assertEquals(1, s.search("Мама мыла раму", "мыла"));
    }

    @Test
    public void searchTest2() {
        RegExSearch s = new RegExSearch();
        Assertions.assertEquals(0, s.search("Мама мыла раму", "мыл "));
    }

    @Test
    public void searchTest3() {
        RegExSearch s = new RegExSearch();
        Assertions.assertEquals(1, s.search("привет, как дела!", "привет"));
        Assertions.assertEquals(1, s.search("привет, как дела!", "как"));
        Assertions.assertEquals(1, s.search("привет, как дела!", "дела"));
    }

    @Test
    public void searchTest4() {
        RegExSearch s = new RegExSearch();
        Assertions.assertEquals(1, s.search("привет,какдела!", "какдела"));
    }

    @Test
    public void searchTest5() {
        RegExSearch s = new RegExSearch();
        Assertions.assertEquals(1, s.search("бабушка бабушке бабушку!", "бабушка"));
        Assertions.assertEquals(1, s.search("бабушка бабушке бабушку!", "бабушке"));
        Assertions.assertEquals(1, s.search("бабушка бабушке бабушку!", "бабушку"));
    }
}
