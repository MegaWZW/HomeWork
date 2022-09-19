package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertNumberToBinaryStringTest {

    @Test
    public void toBinaryStringTest1() {
        Assertions.assertEquals("00000000", ConvertNumberToBinaryString.toBinaryString((byte)0));
    }

    @Test
    public void toBinaryStringTest2() {
        Assertions.assertEquals("10000000", ConvertNumberToBinaryString.toBinaryString((byte)-128));
    }

    @Test
    public void toBinaryStringTest3() {
        Assertions.assertEquals("00101101", ConvertNumberToBinaryString.toBinaryString((byte)45));
    }

    @Test
    public void toBinaryStringTest4() {
        Assertions.assertEquals("11010011", ConvertNumberToBinaryString.toBinaryString((byte)-45));
    }
}
