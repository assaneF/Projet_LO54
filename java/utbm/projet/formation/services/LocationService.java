/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utbm.projet.formation.services;

import java.util.List;
import utbm.projet.formation.entity.Location;
import utbm.projet.formation.repository.LocationDAO;

/**
 *
 * @author Faye
 */
public class LocationService {
    
    public void locationSave(Location location)
    {
        LocationDAO dao = new LocationDAO();
        dao.save(location);
        
    }
    
    public List<Location> locationList()
    {
        LocationDAO dao = new LocationDAO();
        return dao.ListLocation();
    }
    
    public List<Location> locationRecherche(String city)
    {
        LocationDAO dao = new LocationDAO();
        return dao.LocationRecherche(city);
    }
    
}
