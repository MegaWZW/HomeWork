package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MakePhoneNumberTest {

    @Test
    public void createPhoneNumberTest1() {
        Assertions.assertEquals("(123) 456-7890", MakePhoneNumber.createPhoneNumber(new int[] {1,2,3,4,5,6,7,8,9,0}));
    }

    @Test
    public void createPhoneNumberTest2() {
        Assertions.assertNull(MakePhoneNumber.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 78, 8, 9, 0}));
    }

    @Test
    public void createPhoneNumberTest3() {
        Assertions.assertNull(MakePhoneNumber.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void createPhoneNumberTest4() {
        Assertions.assertEquals("(125) 853-7890", MakePhoneNumber.createPhoneNumber(new int[] {1,2,5,8,5,3,7,8,9,0}));
    }
}
