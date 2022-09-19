package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4_4Test {

    @Test
    public void bitesToKilobitesTest1(){
        Assertions.assertEquals(0.244140625, Task4_4.bitesToKilobites(250));
    }

    @Test
    public void bitesToKilobitesTest2(){
        Assertions.assertEquals(1.0, Task4_4.bitesToKilobites(1024));
    }

    @Test
    public void kilobitesToBitesTest1(){
        Assertions.assertEquals(1024, Task4_4.kilobitesToBites(1));
    }

    @Test
    public void kilobitesToBitesTest2(){
        Assertions.assertEquals(0, Task4_4.kilobitesToBites(0));
    }

    @Test
    public void kilobitesToBitesTest3(){
        Assertions.assertEquals(25600, Task4_4.kilobitesToBites(25));
    }
}
