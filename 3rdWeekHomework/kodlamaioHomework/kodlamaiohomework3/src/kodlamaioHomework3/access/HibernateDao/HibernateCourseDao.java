package kodlamaioHomework3.access.HibernateDao;

import kodlamaioHomework3.access.Interface.ICourseDao;
import kodlamaioHomework3.entites.Category;
import kodlamaioHomework3.entites.Course;

import java.util.ArrayList;

public class HibernateCourseDao implements ICourseDao {
    public void add(Course course){

        System.out.println("Hibernate ile veri tabanına eklendi: ");
    }

    @Override
    public ArrayList<Course> getAllCourses() {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course(1,"Java",0));
        return courses;
    }
}
