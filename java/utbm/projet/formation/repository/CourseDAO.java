/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utbm.projet.formation.repository;



import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import utbm.projet.formation.entity.Course;
import utbm.projet.formation.util.HibernateUtil;

/**
 *
 * @author Faye
 */
public class CourseDAO {
    
    static Session session = HibernateUtil.getSessionFactory().openSession();
    
    public void save(Course course)
    {
        
        session.beginTransaction();
       
        session.persist(course);
        session.getTransaction().commit();
        System.out.printf("effectué");
        session.close();
   
    }
    
     public List<Course>  ListCourse()
    {
         List<Course> courses = null;
         Query query = session.createQuery("from Course");
         courses = query.list();
         session.close();
         
         if(courses != null)
       {
           for(Course course : courses)
               System.out.println("Ville = "+course.getTitle()+" code = "+course.getCode());
       }
         
         return courses;
    }
     
      public List<Course> CourseRecherche(String title)
    {
         List<Course> course= null;
         
         
         Query query = session.createQuery("from Location WHERE TITLE = :tit");
         query.setParameter("tit", title);
         course = query.list();
         
       if(course != null)
       {
           for(Course  courses  : course )
               System.out.println("Titre = "+courses.getTitle()+" code = "+courses.getCode());
       }
         
         session.close();
         
         return course;
    }
    
}
