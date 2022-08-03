/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.deuerlein.daniel._061219_travel_weather_app_project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author owner
 */
public class LocationInventory extends AbstractListModel<String>
{
    private final List<Location> locations;

    public LocationInventory()
    {
        locations = new ArrayList();
    }
    
    public void addLocation(Location l)
            throws IOException
    {
        locations.add(l);
        l.loadCurrentWeather();
        this.fireContentsChanged(locations, 0, locations.size());
    }
    
    @Override
    public int getSize()
    {
        return locations.size();
    }

    @Override
    public String getElementAt(int index)
    {
        return locations.get(index).toString();
    }

}
