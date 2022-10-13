package kodlamaioHomework3.access.Interface;

import kodlamaioHomework3.entites.Course;

import java.util.ArrayList;
public interface ICourseDao {
    void add(Course course);
    ArrayList <Course> getAllCourses();
}
