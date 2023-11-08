package familytree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Iterator;

public class FamilyTree implements Iterable<Person> {
    private List<Person> people;

    public FamilyTree() {
        people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public Person getPerson(String name) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    @Override
    public Iterator<Person> iterator() {
        return new FamilyTreeIterator(people);
    }

    private class FamilyTreeIterator implements Iterator<Person> {
        private List<Person> people;
        private int index;

        public FamilyTreeIterator(List<Person> people) {
            this.people = people;
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < people.size();
        }

        @Override
        public Person next() {
            return people.get(index++);
        }
    }

    public void sortByName() {
        people.sort(Comparator.comparing(Person::getName)); 
        }

    public void sortByBirthYear() {
        people.sort(Comparator.comparing(person -> person.getBirthYear()));
        }

}