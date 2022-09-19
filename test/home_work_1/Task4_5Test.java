package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4_5Test {

    @Test
    public void letterOrOtherCharacterTest1() {
        Assertions.assertEquals("Letter", Task4_5.letterOrOtherCharacter('b'));
    }

    @Test
    public void letterOrOtherCharacterTest2() {
        Assertions.assertEquals("Other character", Task4_5.letterOrOtherCharacter('&'));
    }

    @Test
    public void letterOrOtherCharacterTest3() {
        Assertions.assertEquals("Other character", Task4_5.letterOrOtherCharacter('9'));
    }

    @Test
    public void letterOrOtherCharacterTest4() {
        Assertions.assertEquals("Letter", Task4_5.letterOrOtherCharacter('Q'));
    }

    @Test
    public void letterOrOtherCharacterTest5() {
        Assertions.assertEquals("Letter", Task4_5.letterOrOtherCharacter('щ'));
    }
}
