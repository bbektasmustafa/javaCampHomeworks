package kodlamaioHomework3.access.JdbcDao;

import kodlamaioHomework3.access.Interface.ICategoryDao;
import kodlamaioHomework3.entites.Category;

import java.util.ArrayList;

public class JdbcCategoryDao implements ICategoryDao {
    public void add(Category category){

        System.out.println("JDBC ile veri tabanına eklendi: ");
    }

    @Override
    public ArrayList<Category> getAllCategories() {
        ArrayList <Category> categories = new  ArrayList <>();
        categories.add(new Category(1,"Programlama"));
        return categories;
    }
}
