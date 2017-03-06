package pl.lodz.p.edu.ftims;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

    @Test
    public void TmpClassTest() {
        int value = 5;
        TmpClass tmpClass = new TmpClass();
        assertEquals(value, tmpClass.OnlyForTest(value));
    }
}
