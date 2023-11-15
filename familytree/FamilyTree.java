package familytree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Iterator;

public class FamilyTree<T> implements Iterable<T> {
    private List<T> people;

    public FamilyTree() {
        this.people = new ArrayList<>();
    }

    public void addPerson(T person) {
        people.add(person);
    }

    public T getPerson(String name) {
        for (T person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public List<T> getPeople() {
        return people;
    }

    public void setPeople(List<T> people) {
        this.people = people;
    }

    @Override
    public Iterator<T> iterator() {
        return new FamilyTreeIterator(people);
    }

    private class FamilyTreeIterator implements Iterator<T> {
        private List<T> people;
        private int index;

        public FamilyTreeIterator(List<T> people) {
            this.people = people;
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < people.size();
        }

        @Override
        public T next() {
            return people.get(index++);
        }
    }

    public void sortByName(Comparator <T> comparator) {
        people.sort(comparator); 
        }

    public void sortByBirthYear(Comparator <T> comparator) {
        people.sort(comparator);
        }

}