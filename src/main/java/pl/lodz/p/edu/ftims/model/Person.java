package pl.lodz.p.edu.ftims.model;

import java.util.UUID;

public class Person {

    UUID id;

    String name;

    int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}
