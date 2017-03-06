package pl.lodz.p.edu.ftims.service;

import java.util.ArrayList;
import java.util.List;

import pl.lodz.p.edu.ftims.model.Person;

public class PersonServiceImpl implements PersonService {

    public int totalAge(List<Person> persons) {
        return (int) persons.stream().mapToInt(p -> p.getAge()).summaryStatistics().getSum();
    }


    public ArrayList<Person> basicAgeSortMethod(ArrayList<Person> persons) {

        return null;
    }


    public ArrayList<Person> lambdaAgeSortMethod(ArrayList<Person> persons) {
        // TODO Auto-generated method stub
        return null;
    }

}
