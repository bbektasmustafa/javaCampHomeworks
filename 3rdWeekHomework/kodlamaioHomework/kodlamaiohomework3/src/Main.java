import kodlamaioHomework3.access.HibernateDao.HibernateCategoryDao;
import kodlamaioHomework3.access.HibernateDao.HibernateCourseDao;
import kodlamaioHomework3.access.Interface.ICategoryDao;
import kodlamaioHomework3.access.Interface.ICourseDao;
import kodlamaioHomework3.access.JdbcDao.JdbcCategoryDao;
import kodlamaioHomework3.access.JdbcDao.JdbcInstructorDao;
import kodlamaioHomework3.business.CategoryManager;
import kodlamaioHomework3.business.CourseManager;
import kodlamaioHomework3.business.InstructorManager;
import kodlamaioHomework3.core.DatabaseLogger;
import kodlamaioHomework3.core.EmailLogger;
import kodlamaioHomework3.core.FileLogger;
import kodlamaioHomework3.core.Logger;
import kodlamaioHomework3.entites.Category;
import kodlamaioHomework3.entites.Course;
import kodlamaioHomework3.entites.Instructor;

public class Main {

    public static void main(String[] args) {


        Category category = new Category(1,"Programlama");
        Category category1 = new Category(2,"Programlama2");

        Logger[] loggers = {new DatabaseLogger(),new FileLogger(), new EmailLogger()};

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
        try {
            categoryManager.add(category);

        }catch (Exception exception){
            System.out.println(exception);
        }

        try {
            categoryManager.add(category1);
        }catch (Exception exception){
            System.out.println(exception);
        }

        System.out.println("**********************************************************");

        Course course = new Course(1,"Java2",-1);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
        try {
            courseManager.add(course);
        } catch (Exception exception){
            System.out.println(exception);
        }

        System.out.println("**********************************************************");

        Instructor instructor = new Instructor(1,"Engin Demirog");
        InstructorManager ınstructorManager = new InstructorManager(new JdbcInstructorDao(),loggers);
        ınstructorManager.add(instructor);


    }
}
