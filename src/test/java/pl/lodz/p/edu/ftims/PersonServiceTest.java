package pl.lodz.p.edu.ftims;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import pl.lodz.p.edu.ftims.model.Person;
import pl.lodz.p.edu.ftims.service.PersonService;
import pl.lodz.p.edu.ftims.service.PersonServiceImpl;

public class PersonServiceTest {

    @Test
    public void ageCounterTest() {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Person_1", 5));
        personList.add(new Person("Person_2", 6));

        PersonService personService = new PersonServiceImpl();

        assertEquals(11, personService.totalAge(personList));
    }
}
