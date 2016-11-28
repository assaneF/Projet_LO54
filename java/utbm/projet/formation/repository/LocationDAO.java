/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utbm.projet.formation.repository;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import utbm.projet.formation.entity.Location;
import utbm.projet.formation.util.HibernateUtil;

/**
 *
 * @author Faye
 */
public class LocationDAO {
    
    static Session session = HibernateUtil.getSessionFactory().openSession();
    
    public void save(Location location)
    {
        
        session.beginTransaction();
       
        session.persist(location);
        session.getTransaction().commit();
        System.out.printf("effectué");
        session.close();
   
    }
    
     public List<Location>  ListLocation()
    {
         List<Location> locations = null;
         Query query = session.createQuery("from Location");
         locations = query.list();
         session.close();
         
         if(locations != null)
       {
           for(Location location : locations)
               System.out.println("Ville = "+location.getCity());
       }
         
         return locations;
    }
    
    public List<Location> LocationRecherche(String city)
    {
         List<Location> location = null;
         
         
         Query query = session.createQuery("from Location WHERE CITY = :cit");
         query.setParameter("cit", city);
         location = query.list();
         
       if(location != null)
       {
           for(Location locations : location)
               System.out.println("Ville = "+locations.getCity()+"...");
       }
         
         session.close();
         
         return location;
    }
}
