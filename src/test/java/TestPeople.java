import LearnerLab.People;
import LearnerLab.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPeople {

    private People people;

    @BeforeEach
    void setUp(){
        people = new People();
    }

    @Test
    @DisplayName("If person was added")
    public void addTest() {
        Person person = new Person("Zay",1);
        people.add(person);
        Assertions.assertTrue(people.contains(person));
    }

    @Test
    @DisplayName("If person was removed")
    public void removeTest(){
        Person person = new Person("zay",1);
        people.add(person);
        people.removePerson(person);

        Assertions.assertFalse(people.contains(person));
    }

    @Test
    @DisplayName("Find person by id")
    public void findByIdTest(){
        Person expected = new Person("Zay",1);
        people.add(expected);

        Assertions.assertEquals(expected,people.findById(1));
    }

//    @Test
//    @DisplayName("Remove id")
//    public void removeIdTest(){
//        Person expected = new Person("Zay",1);
//        people.add(expected);
//
//        Assertions.assertEquals();
//    }


}
