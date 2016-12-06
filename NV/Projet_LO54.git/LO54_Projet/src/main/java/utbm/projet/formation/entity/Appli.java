/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utbm.projet.formation.entity;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import utbm.projet.formation.util.HibernateUtil;

/**
 *
 * @author Faye
 */
public class Appli {
    
   static Session session = HibernateUtil.getSessionFactory().openSession();
    public static void main(String[] args) 
    {
        //Course_Session cou= new Course_Session();
        //insertClient("FAYE","Assane","Belfort","0658205685","fat@hjj.fr",cou);
    }
    
    
    public static void InsertLocation(String city)
    {
        Location loc = new Location();
        loc.setCity(city);
        
        session.beginTransaction();
       
        session.persist(loc);
        session.getTransaction().commit();
        System.out.printf("effectué");
        session.close();
    }
    
    public static void InsertCourse(String code, String title)
    {
        Course cou = new Course();
        cou.setTitle(title);
        cou.setCode(code);
             
        session.beginTransaction();
        
     
        session.persist(cou);
        
        session.getTransaction().commit();
        System.out.printf("effectué");
        session.close();
    }
    
    public static void  ListLocation()
    {
         List<Location> locations = null;
         Query query = session.createQuery("from Location");
         locations = query.list();
       
       if(locations != null)
       {
           for(Location location : locations)
               System.out.println("Ville = "+location.getCity());
       }
       
        //session.getTransaction().commit();
        session.close();
    }
    
    public static void  ListCourse()
    {
         List<Course> courses = null;
         Query query = session.createQuery("from Course");
         courses = query.list();
       
       if(courses != null)
       {
           for(Course course : courses)
               System.out.println("Titre = "+course.getTitle());
       }
       
        //session.getTransaction().commit();
        session.close();
    }
    public static void  insertClient(String lastname, String firstname, String address, String phone, String email, Course_Session course_s)
    {
        Client cl = new Client();
        cl.setAddress(address);
        cl.setEmail(email);
        cl.setFirstname(firstname);
        cl.setLastname(lastname);
        cl.setPhone(phone);
        cl.setCourse_session(course_s);
             
        session.beginTransaction();
        
     
        session.persist(cl);
        
        session.getTransaction().commit();
        System.out.printf("effectué");
        session.close();
    }
}
