package kodlamaioHomework3.access.JdbcDao;

import kodlamaioHomework3.access.Interface.IInstructorDao;
import kodlamaioHomework3.entites.Instructor;

import java.util.ArrayList;

public class JdbcInstructorDao implements IInstructorDao {
    public void add(Instructor instructor){

        System.out.println("JDBC ile veri tabanına eklendi: ");
    }

    @Override
    public ArrayList<Instructor> getAllInstructor() {
        ArrayList<Instructor> ınstructors = new ArrayList<>();
        ınstructors.add(new Instructor(1,"Engin Demirog"));
        return ınstructors;
    }
}
