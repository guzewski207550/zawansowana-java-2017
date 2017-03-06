package pl.lodz.p.edu.ftims.service;

import java.util.ArrayList;

import pl.lodz.p.edu.ftims.model.Person;

public interface PersonService {

    public int totalAge();


    public ArrayList<Person> basicSortMethod(ArrayList<Person> pesons);


    public ArrayList<Person> lambdaSortMethod(ArrayList<Person> pesons);
}
