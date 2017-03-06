package pl.lodz.p.edu.ftims.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import pl.lodz.p.edu.ftims.model.Person;

public class PersonServiceImpl implements PersonService {

    public int totalAge(List<Person> persons) {
        return (int) persons.stream().mapToInt(p -> p.getAge()).summaryStatistics().getSum();
    }


    public List<Person> basicAgeSortMethod(List<Person> persons) {
        Collections.sort(persons, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        return persons;
    }


    public List<Person> lambdaAgeSortMethod(List<Person> persons) {
        // TODO Auto-generated method stub
        return null;
    }

}
