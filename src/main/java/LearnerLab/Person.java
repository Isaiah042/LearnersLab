package LearnerLab;

public class Person {

    private final long ID;

    private String name;


    public Person(String name,long id) {
        this.name = name;
        this.ID = id;
    }

    public long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }


}
