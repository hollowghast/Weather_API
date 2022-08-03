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
public class Wind
{
    private final float speed, deg;

    public Wind(float speed, float deg)
    {
        this.speed = speed;
        this.deg = deg;
    }

    @Override
    public String toString()
    {
        StringBuilder currentWeatherOutput = new StringBuilder();
        currentWeatherOutput.append("Speed:\n\t\t");
        currentWeatherOutput.append(speed);
        currentWeatherOutput.append("\n\tDegrees:\n\t\t");
        currentWeatherOutput.append(deg);
        
        return currentWeatherOutput.toString();
    }

    
    
    public float getSpeed()
    {
        return speed;
    }

    public float getDeg()
    {
        return deg;
    }
    
    
}
