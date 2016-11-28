/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utbm.projet.formation.entity;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import utbm.projet.formation.controller.CourseController;
import utbm.projet.formation.controller.LoactionController;
import utbm.projet.formation.util.HibernateUtil;

/**
 *
 * @author Faye
 */
public class Appli {
    
   static Session session = HibernateUtil.getSessionFactory().openSession();
    public static void main(String[] args) 
    {
        //LoactionController controle = new LoactionController();
        //controle.RechercheLocation();
        
        CourseController Ccontrole = new CourseController();
        Ccontrole.RechercheCourse();
       
        
    }
    
}
