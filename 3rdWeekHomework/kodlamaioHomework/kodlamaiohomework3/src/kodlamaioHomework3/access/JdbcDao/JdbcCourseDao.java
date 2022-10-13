package kodlamaioHomework3.access.JdbcDao;

import kodlamaioHomework3.access.Interface.ICourseDao;
import kodlamaioHomework3.entites.Course;

import java.util.ArrayList;

public class JdbcCourseDao implements ICourseDao {
    public void add(Course course) {

        System.out.println("JDBC ile veri tabanına eklendi: ");
    }

    public ArrayList<Course> getAllCourses() {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course(1, "Java", 0));
        return courses;
    }
}
