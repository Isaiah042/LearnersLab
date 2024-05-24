import LearnerLab.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestInstructor {

    @Test
    void testImplementation(){
        Instructor teacher = new Instructor("Isaiah G", 1);

        Assertions.assertTrue(teacher instanceof Instructor);
    }

    @Test
    void testInheritance(){
        Instructor teacher = new Instructor("Isaiah G", 1);

        Assertions.assertTrue(teacher instanceof Person);
    }

    @Test
    void testTeach(){
        Instructor instructor = new Instructor("Isaiah", 1);
        Student student = new Student("Nelson", 1);
        double expected = 10;
        instructor.teach(student, 10);
        Assertions.assertEquals(expected,student.getTotalStudyTime());
    }

    @Test
    void testLecture(){
        Instructor instructor = new Instructor("Nelson", 1);
        Student student1 = new Student("Isaiah", 1);
        Student student2 = new Student("Kelly", 1);
        Learner[] learners = {student1, student2};
        instructor.lecture(learners, 24);


        double expected = (student1.getTotalStudyTime() + student2.getTotalStudyTime()) / learners.length;
        Assertions.assertEquals(expected,student1.getTotalStudyTime());
        Assertions.assertEquals(expected,student2.getTotalStudyTime());
    }
    }

