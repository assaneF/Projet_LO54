/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utbm.projet.formation.entity;

/**
 *
 * @author Faye
 */
public class Location implements java.io.Serializable{
    
    private Integer id;
    private String city;
    
    public Location()
    {
        
    }
    
     public Location(Integer Id, String City)
    {
        this.id = Id;
        this.city = City;
    }
     
     public Integer getId() {
        return this.id;
    }
     
     public String getCity() {
        return this.city;
    }
     
     public void setId(Integer Id) {
        this.id = Id;
    }
     public void setCity(String City) {
        this.city = City;
    }
}
