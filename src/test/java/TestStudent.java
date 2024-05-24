import LearnerLab.Learner;
import LearnerLab.Person;
import LearnerLab.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;

public class TestStudent {

    @Test
    void testImplementation(){
        Student student = new Student("Isaiah G", 1);

        Assertions.assertTrue(student instanceof Learner);
    }

    @Test
    void testInheritance(){
        Student student = new Student("Isaiah G", 1);

        Assertions.assertTrue(student instanceof Person);
    }

    @Test
    void testLearn(){
        Student student = new Student("Isaiah G", 1);
        student.learn(50.5);
        double actual = student.getTotalStudyTime();


        Assertions.assertEquals(50.5, actual);
    }
}
