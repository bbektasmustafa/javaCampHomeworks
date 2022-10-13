package kodlamaioHomework3.business;

import kodlamaioHomework3.access.HibernateDao.HibernateCategoryDao;
import kodlamaioHomework3.access.Interface.ICategoryDao;
import kodlamaioHomework3.core.Logger;
import kodlamaioHomework3.entites.Category;

import java.util.ArrayList;

public class CategoryManager {

    private ICategoryDao categoryDao;
    private Logger[] loggers;
    private ArrayList <Category> categories;

    public CategoryManager(ICategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        categories = categoryDao.getAllCategories();
    }
    public void add(Category category) throws Exception {
        for(Category c : categories){
            if(c.getCategoryName().equalsIgnoreCase(category.getCategoryName())){
                throw new Exception("Kategori ismi mevcuttur lütfen başka bir kategori ismi seçiniz");
            }

        }
        categoryDao.add(category);
        for(Logger logger : loggers){
            logger.log(category.getCategoryName() + " kategorisi eklendi.");
        }
    }

}
