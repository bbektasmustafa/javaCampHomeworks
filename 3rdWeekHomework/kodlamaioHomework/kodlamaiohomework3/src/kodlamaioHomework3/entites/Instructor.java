package kodlamaioHomework3.entites;

public class Instructor {
    private int id;
    private String ınstructorName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstructorName() {
        return ınstructorName;
    }

    public void setInstructorName(String ınstructorName) {
        this.ınstructorName = ınstructorName;
    }

    public Instructor(int id, String ınstructorName) {
        this.id = id;
        this.ınstructorName = ınstructorName;
    }

    public Instructor() {
    }
}
