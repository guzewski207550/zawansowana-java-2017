package pl.lodz.p.edu.ftims.model;

import java.util.UUID;

import lombok.Getter;

public class Person {

    @Getter
    UUID id;

    @Getter
    String name;

    @Getter
    int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}
