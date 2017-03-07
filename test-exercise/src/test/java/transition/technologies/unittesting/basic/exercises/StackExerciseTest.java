package transition.technologies.unittesting.basic.exercises;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StackExerciseTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private StackExercise sut;


    @Before
    public void initializeSut() {
        sut = new StackExercise();
    }


    @Test
    public void shouldBeEmptyWhenNothingPushed() {
        assertTrue(sut.isEmpty());
    }


    @Test
    public void shouldTopReturnLastPushedValue() throws StackEmptyException {
        pushValuesToStack(5);

        assertTrue(!sut.isEmpty());
        assertEquals("5", sut.top());
    }


    @Test
    public void shouldNotFailWhen200ElementsPushed() throws StackEmptyException {
        pushValuesToStack(200);

        assertTrue(!sut.isEmpty());
        assertEquals("200", sut.top());
    }


    private void pushValuesToStack(int numElements) {
        for (int i = 0; i < numElements; i++) {
            sut.push(Integer.toString(i + 1));
        }
    }


    @Test
    public void shouldBeEmptyWhenAllPopped() throws StackEmptyException {
        pushValuesToStack(5);

        while (!sut.isEmpty()) {
            sut.pop();
        }

        assertTrue(sut.isEmpty());
    }


    @Test(expected = StackEmptyException.class)
    public void shouldThrowStackEmptyExceptionWhenEmptyPopped() throws StackEmptyException {
        sut.pop();
    }

}
