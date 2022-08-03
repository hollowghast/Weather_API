package at.deuerlein.daniel._061219_travel_weather_app_project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author owner
 */
public class CloudData
{
    private final int all;

    public CloudData(int all)
    {
        this.all = all;
    }

    @Override
    public String toString()
    {
        StringBuilder currentWeatherOutput = new StringBuilder();
        currentWeatherOutput.append("Count:\n\t\t");
        currentWeatherOutput.append(all);
        
        return currentWeatherOutput.toString();
    }

    
    
    public int getAll()
    {
        return all;
    }
    
    
}
