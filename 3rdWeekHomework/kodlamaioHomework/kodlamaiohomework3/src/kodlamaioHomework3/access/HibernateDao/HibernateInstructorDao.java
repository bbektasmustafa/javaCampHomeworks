package kodlamaioHomework3.access.HibernateDao;

import kodlamaioHomework3.access.Interface.IInstructorDao;
import kodlamaioHomework3.entites.Course;
import kodlamaioHomework3.entites.Instructor;

import java.util.ArrayList;

public class HibernateInstructorDao implements IInstructorDao {
    public void add(Course course){

        System.out.println("Hibernate ile veri tabanına eklendi: ");
    }

    @Override
    public void add(Instructor instructor) {

    }

    @Override
    public ArrayList<Instructor> getAllInstructor() {
        ArrayList<Instructor> ınstructors = new ArrayList<>();
        ınstructors.add(new Instructor(1,"Engin Demirog"));
        return ınstructors;
    }
}
