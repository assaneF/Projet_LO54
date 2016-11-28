/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utbm.projet.formation.controller;

import java.util.List;
import utbm.projet.formation.entity.Location;
import utbm.projet.formation.services.LocationService;

/**
 *
 * @author Faye
 */
public class LoactionController {
    
    public void saveLocation()
    {
        Location loc = new Location();
        loc.setCity("Dakar");
        
        LocationService service = new LocationService();
        service.locationSave(loc);
    }
    
    public List<Location>  ListLocation()
    {
       LocationService service = new LocationService();
       return service.locationList();
    }
    
    public List<Location>  RechercheLocation()
    {
       LocationService service = new LocationService();
       return service.locationRecherche("Dakar");
    }
}

 
