/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utbm.projet.formation.services;

import java.util.List;
import utbm.projet.formation.entity.Course;
import utbm.projet.formation.repository.CourseDAO;
import utbm.projet.formation.repository.LocationDAO;

/**
 *
 * @author Faye
 */
public class CourseService {
    
    public void courseSave(Course course)
    {
        CourseDAO dao = new CourseDAO();
        dao.save(course);
        
    }
    
    public List<Course> CourseList()
    {
        CourseDAO dao = new CourseDAO();
        return dao.ListCourse();
    }
    
    public List<Course> CourseRecherche(String city)
    {
        CourseDAO dao = new CourseDAO();
        return dao.CourseRecherche(city);
    }
    
}
