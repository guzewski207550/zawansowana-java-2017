package pl.lodz.p.edu.ftims.service;

import java.util.ArrayList;
import java.util.List;

import pl.lodz.p.edu.ftims.model.Person;

public interface PersonService {

    public int totalAge(List<Person> persons);


    public ArrayList<Person> basicAgeSortMethod(ArrayList<Person> persons);


    public ArrayList<Person> lambdaAgeSortMethod(ArrayList<Person> persons);
}
