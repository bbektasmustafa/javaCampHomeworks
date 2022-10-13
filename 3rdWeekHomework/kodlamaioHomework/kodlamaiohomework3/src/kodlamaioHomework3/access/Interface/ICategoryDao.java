package kodlamaioHomework3.access.Interface;

import kodlamaioHomework3.entites.Category;

import java.util.ArrayList;

public interface ICategoryDao {
    void add(Category category);
    ArrayList <Category> getAllCategories();
}

