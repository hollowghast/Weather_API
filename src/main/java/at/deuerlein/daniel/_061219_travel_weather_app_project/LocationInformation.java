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
public class LocationInformation
{
    private final int type;
    private final long id, sunrise, sunset;
    private final double message;
    private final String country;

    public LocationInformation(int type, long id, long sunrise, long sunset, double message, String country)
    {
        this.type = type;
        this.id = id;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.message = message;
        this.country = country;
    }

    @Override
    public String toString()
    {
        StringBuilder currentWeatherOutput = new StringBuilder();
        currentWeatherOutput.append("Type:\n\t\t");
        currentWeatherOutput.append(type);
        currentWeatherOutput.append("\n\tID:\n\t\t");
        currentWeatherOutput.append(id);
        currentWeatherOutput.append("\n\tSunrise:\n\t\t");
        currentWeatherOutput.append(sunrise);
        currentWeatherOutput.append("\n\tSunset:\n\t\t");
        currentWeatherOutput.append(sunset);
        currentWeatherOutput.append("\n\tMessage:\n\t\t");
        currentWeatherOutput.append(message);
        currentWeatherOutput.append("\n\tCountry:\n\t\t");
        currentWeatherOutput.append(country);
        
        
        return currentWeatherOutput.toString();
    }

    
    
    public int getType()
    {
        return type;
    }

    public long getId()
    {
        return id;
    }

    public long getSunrise()
    {
        return sunrise;
    }

    public long getSunset()
    {
        return sunset;
    }

    public double getMessage()
    {
        return message;
    }

    public String getCountry()
    {
        return country;
    }
    
    
}
