/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utbm.projet.formation.controller;

import java.util.List;
import utbm.projet.formation.entity.Course;
import utbm.projet.formation.entity.Location;
import utbm.projet.formation.services.CourseService;
import utbm.projet.formation.services.LocationService;

/**
 *
 * @author Faye
 */
public class CourseController {
    
    public void saveCourse()
    {
        Course cou = new Course();
        cou.setTitle("De dakar a Koalack");
        cou.setCode("ABC");
        
        CourseService service = new CourseService();
        service.courseSave(cou);
                
    }
    
    public List<Course>  ListCourse()
    {
       CourseService service = new CourseService();
       return service.CourseList();
    }
    
    public List<Course>  RechercheCourse()
    {
       CourseService service = new CourseService();
       return service.CourseRecherche("Paris-Dakar");
    }
}
