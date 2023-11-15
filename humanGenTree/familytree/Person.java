package familytree;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import java.io.Serializable;


public class Person implements Serializable{
    private String name;
    private Gender gender;
    private LocalDate birthYear;
    private String relationship;
    private LocalDate deathYear;
    private List<Person> children;

    public Person(String name, Gender gender, LocalDate birthYear, LocalDate deathYear, String relationship) {
        this.name = name;
        this.gender = gender;
        this.birthYear = birthYear;
        this.relationship = relationship;
        this.deathYear = deathYear;
        
        this.children = new ArrayList<>();
    }


    public void addChildren(Person child) {
        children.add(child);
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthYear() {
        return birthYear;
    }

    public LocalDate getDeathYear() {
        return deathYear;
    }

    public String getRelationship() {
        return relationship;
    }

    public List<Person> getChildren() {
        return children;
    }
    
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
}
