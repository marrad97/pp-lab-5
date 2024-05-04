package company.beans;

import company.exceptions.InvalidAgeException;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws InvalidAgeException {
        this.name = name;
        if (age < 0 || age > 125) {
            throw new InvalidAgeException("Wiek musi wynosić od 0 do 125 lat.");
        }
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        this.age = age;
    }
}
