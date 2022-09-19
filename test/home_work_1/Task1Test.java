package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1Test {

    @Test
    public void bitwiseAndTest() {
        Assertions.assertEquals(13, Task1.bitwiseAnd(45, 77));
    }

    @Test
    public void bitwiseOrTest() {
        Assertions.assertEquals(109, Task1.bitwiseOr(45, 77));
    }
}
