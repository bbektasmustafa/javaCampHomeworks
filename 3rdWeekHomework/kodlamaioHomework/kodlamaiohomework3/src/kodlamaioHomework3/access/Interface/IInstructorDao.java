package kodlamaioHomework3.access.Interface;

import kodlamaioHomework3.entites.Instructor;

import java.util.ArrayList;

public interface IInstructorDao {
    void add(Instructor ınstructor);
    ArrayList<Instructor> getAllInstructor();
}
