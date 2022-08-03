/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.deuerlein.daniel._061219_travel_weather_app_project;

/**
 *
 * @author owner
 */
public class Coordinates
{
    private final float lon, lat;

    public Coordinates(float lon, float lat)
    {
        this.lon = lon;
        this.lat = lat;
    }

    @Override
    public String toString()
    {
        StringBuilder currentWeatherOutput = new StringBuilder();
        currentWeatherOutput.append("Longitude:\n\t\t");
        currentWeatherOutput.append(lon);
        currentWeatherOutput.append("\n\tLatidude:\n\t\t");
        currentWeatherOutput.append(lat);
        
        return currentWeatherOutput.toString();
    }
    
    

    public float getLon()
    {
        return lon;
    }

    public float getLat()
    {
        return lat;
    }

    
    
}
