package kodlamaioHomework3.business;

import kodlamaioHomework3.access.Interface.ICourseDao;
import kodlamaioHomework3.core.Logger;
import kodlamaioHomework3.entites.Course;

import java.util.ArrayList;

public class CourseManager {

    private ICourseDao courseDao;
    private Logger[] loggers;
    private ArrayList <Course> courses;

    public CourseManager(ICourseDao courseDao, Logger[] loggers){
        this.courseDao = courseDao;
        this.loggers = loggers;
        courses = courseDao.getAllCourses();
    }

    public void add(Course course) throws Exception {
        for (Course co : courses){
            if (co.getCourseName().equalsIgnoreCase(course.getCourseName())){
                throw new Exception("Kurs ismi mevcuttur lütfen başka bir kurs ismi seçiniz");
            }
        }
        if (course.getCoursePrice()<0){

            throw new Exception("Kurs fiyatı sıfırdan küçük olamaz");
        }
        courseDao.add(course);
        for(Logger logger : loggers){
            logger.log(course.getCourseName() + " kurs eklendi");
        }


    }

}
