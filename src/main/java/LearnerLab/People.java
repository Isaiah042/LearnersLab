package LearnerLab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person>{

    private List<Person> personList;

    public People() {
        this.personList = new ArrayList<>();
    }

    public List<Person> add(Person person){
        if (person != null){
            personList.add(person);
        }
        return personList;
    }

    public Person findById(long id){
        for (Person person : personList){
            if(person.getID() == id){
                return person;
            }
        }
        return null;
    }

    public boolean contains(Person person){
        return personList.contains(person);
    }

    public void removePerson(Person person) {
        personList.remove(person);
    }

    public void removeId(long id) {
        personList.removeIf(person -> person.getID() == id);
    }

    public void removeAll(List<Person> List) {
        personList.removeAll(List);
    }

    public void count() {
        System.out.println(personList.size());
    }

    public Person[] toArray() {
        return personList.toArray(new Person[0]);
    }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }

    @Override
    public String toString() {
        return "People{" +
                "personList=" + personList +
                '}';
    }
}
