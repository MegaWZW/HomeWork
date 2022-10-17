package war_and_peace.searchers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EasySearchTest {

    @Test
    public void searchTest1() {
        EasySearch s = new EasySearch();
        Assertions.assertEquals(1, s.search("Мама мыла раму", "мыла"));
    }

    @Test
    public void searchTest2() {
        EasySearch s = new EasySearch();
        Assertions.assertEquals(0, s.search("Мама мыла раму", "мыл "));
    }

    @Test
    public void searchTest3() {
        EasySearch s = new EasySearch();
        Assertions.assertEquals(1, s.search("привет, как дела!", "привет"));
        Assertions.assertEquals(1, s.search("привет, как дела!", "как"));
        Assertions.assertEquals(1, s.search("привет, как дела!", "дела"));
    }

    @Test
    public void searchTest4() {
        EasySearch s = new EasySearch();
        Assertions.assertEquals(1, s.search("привет,какдела!", "какдела"));
        Assertions.assertEquals(1, s.search("привет,какдела!", "привет"));
    }

    @Test
    public void searchTest5() {
        EasySearch s = new EasySearch();
        Assertions.assertEquals(1, s.search("бабушка бабушке бабушку!", "бабушка"));
        Assertions.assertEquals(1, s.search("бабушка бабушке бабушку!", "бабушке"));
        Assertions.assertEquals(1, s.search("бабушка бабушке бабушку!", "бабушку"));
    }
}
