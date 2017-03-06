package pl.lodz.p.edu.ftims;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import pl.lodz.p.edu.ftims.model.Person;
import pl.lodz.p.edu.ftims.service.PersonService;
import pl.lodz.p.edu.ftims.service.PersonServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class PersonServiceTest {

    PersonService personService = Mockito.mock(PersonServiceImpl.class);


    @SuppressWarnings("unchecked")
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Person_1", 5));
        personList.add(new Person("Person_2", 6));
        personList.add(new Person("Person_3", 2));

        Mockito.when(personService.totalAge(Matchers.anyList())).thenCallRealMethod();
        Mockito.when(personService.basicAgeSortMethod(Matchers.anyList())).thenCallRealMethod();
        Mockito.when(personService.lambdaAgeSortMethod(Matchers.anyList())).thenCallRealMethod();

        Mockito.when(personService.getPersonList()).thenReturn(personList);
    }


    @Test
    public void ageCounterTest() {
        assertEquals(13, personService.totalAge(personService.getPersonList()));
    }


    @Test
    public void basicSortTest() {
        List<Person> sortedPersonList = personService.basicAgeSortMethod(personService.getPersonList());

        assertTrue(!sortedPersonList.isEmpty());
        assertEquals(2, sortedPersonList.get(0).getAge());
        assertEquals(6, sortedPersonList.get(2).getAge());
    }


    @Test
    public void lambdaSortTest() {
        List<Person> sortedPersonList = personService.basicAgeSortMethod(personService.getPersonList());

        assertTrue(!sortedPersonList.isEmpty());
        assertEquals(2, sortedPersonList.get(0).getAge());
        assertEquals(6, sortedPersonList.get(2).getAge());
    }
}
