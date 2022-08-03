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
public class Weather
{
    private final int id;
    private final String main, description, icon;

    public Weather(int id, String main, String description, String icon)
    {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }

    @Override
    public String toString()
    {
        StringBuilder currentWeatherOutput = new StringBuilder();
        currentWeatherOutput.append("ID:\n\t\t");
        currentWeatherOutput.append(id);
        currentWeatherOutput.append("\n\tMain:\n\t\t");
        currentWeatherOutput.append(main);
        currentWeatherOutput.append("\n\tDescription:\n\t\t");
        currentWeatherOutput.append(description);
        currentWeatherOutput.append("\n\tIcon:\n\t\t");
        currentWeatherOutput.append(icon);
        
        return currentWeatherOutput.toString();
    }
    
    

    public int getId()
    {
        return id;
    }

    public String getMain()
    {
        return main;
    }

    public String getDescription()
    {
        return description;
    }

    public String getIcon()
    {
        return icon;
    }
    
    
}
