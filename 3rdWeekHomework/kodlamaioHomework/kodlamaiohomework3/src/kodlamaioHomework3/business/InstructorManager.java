package kodlamaioHomework3.business;

import kodlamaioHomework3.access.Interface.ICourseDao;
import kodlamaioHomework3.access.Interface.IInstructorDao;
import kodlamaioHomework3.core.Logger;
import kodlamaioHomework3.entites.Course;
import kodlamaioHomework3.entites.Instructor;

import java.util.ArrayList;

public class InstructorManager {

    private IInstructorDao ınstructorDao;
    private Logger[] loggers;
    private ArrayList<Instructor> ınstructors;

    public InstructorManager(IInstructorDao ınstructorDao, Logger[]loggers){
        this.ınstructorDao = ınstructorDao;
        this.loggers = loggers;
        ınstructors = ınstructorDao.getAllInstructor();

    }

    public void add(Instructor ınstructor){
        ınstructorDao.add(ınstructor);
        for(Logger logger : loggers){
            logger.log(ınstructor.getInstructorName()+ " eğitmen olarak eklendi");
        }
    }



}
