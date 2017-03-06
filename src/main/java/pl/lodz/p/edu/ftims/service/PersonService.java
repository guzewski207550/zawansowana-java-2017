package pl.lodz.p.edu.ftims.service;

import java.util.List;

import pl.lodz.p.edu.ftims.model.Person;

public interface PersonService {

    public int totalAge(List<Person> persons);


    public List<Person> basicAgeSortMethod(List<Person> persons);


    public List<Person> lambdaAgeSortMethod(List<Person> persons);


    public List<Person> getPersonList();
}
