package pl.lodz.p.edu.ftims;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import pl.lodz.p.edu.ftims.singly.SinglyLinked;

public class SinglyLinkedTest {

    private static SinglyLinked<Integer> integerList;


    @Before
    public void init() {
        integerList = new SinglyLinked<>();
    }


    @Test
    public void addIntegerElementTest() {
        integerList.addElement(2);
        integerList.addElement(8);
        integerList.addElement(1);

        assertEquals(3, integerList.getListSize());
    }


    @Test
    public void clearIntegerListTest() {
        integerList.addElement(2);
        integerList.addElement(8);
        integerList.addElement(1);

        assertEquals(3, integerList.getListSize());

        integerList.clearList();

        assertEquals(0, integerList.getListSize());
    }


    @Test
    public void getFirstIntegerElementTest() {
        integerList.addElement(2);
        integerList.addElement(8);

        assertEquals(2, integerList.getListSize());
        assertEquals(2, integerList.getElement(0).intValue());
    }


    @Test
    public void checkAllIntegerElementsTest() {
        integerList.addElement(2);
        integerList.addElement(8);
        integerList.addElement(1);

        assertEquals(3, integerList.getListSize());
        assertEquals(2, integerList.getElement(0).intValue());
        assertEquals(8, integerList.getElement(1).intValue());
        assertEquals(1, integerList.getElement(2).intValue());
    }
}
