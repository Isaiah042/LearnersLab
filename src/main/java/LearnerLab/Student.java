package LearnerLab;

public class Student extends Person implements Learner{

    private double totalStudyTime;

    public Student(String name, long id) {
        super(name, id);
    }

    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    @Override
    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
