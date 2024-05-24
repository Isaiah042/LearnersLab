import LearnerLab.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPerson {

    @Test
    void testConstructor() {
        Person person = new Person("Isaiah G",1);

        Assertions.assertEquals("Isaiah G",person.getName());
        Assertions.assertEquals(1,person.getID());
    }
    @Test
    void testSetName(){
        Person person = new Person("",1);
        String expected = person.setName("Isaiah G");
        Assertions.assertEquals(expected, person.getName());
    }
}
