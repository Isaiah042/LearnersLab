import LearnerLab.Students;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStudents {

    @Test
    public void singletonTest(){
        Students student1 = Students.getInstance();
        Students student1again = Students.getInstance();

        Assertions.assertEquals(student1,student1again);

    }
}
