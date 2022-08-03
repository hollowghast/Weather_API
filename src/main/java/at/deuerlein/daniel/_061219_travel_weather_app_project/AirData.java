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
public class AirData
{
    private final float temp, temp_min, temp_max;
    private final int pressure, humidity;

    public AirData(float temp, float temp_min, float temp_max, int pressure, int humidity)
    {
        this.temp = temp;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    @Override
    public String toString()
    {
        StringBuilder currentWeatherOutput = new StringBuilder();
        currentWeatherOutput.append("Temperature:\n\t\t");
        currentWeatherOutput.append(temp);
        currentWeatherOutput.append("\n\tLowest Temperature:\n\t\t");
        currentWeatherOutput.append(temp_min);
        currentWeatherOutput.append("\n\tHighest Temperature:\n\t\t");
        currentWeatherOutput.append(temp_max);
        currentWeatherOutput.append("\n\tPressure:\n\t\t");
        currentWeatherOutput.append(pressure);
        currentWeatherOutput.append("\n\tHumidity:\n\t\t");
        currentWeatherOutput.append(humidity);
        
        
        return currentWeatherOutput.toString();
    }
    
    

    public float getTemp()
    {
        return temp;
    }

    public float getTemp_min()
    {
        return temp_min;
    }

    public float getTemp_max()
    {
        return temp_max;
    }

    public int getPressure()
    {
        return pressure;
    }

    public int getHumidity()
    {
        return humidity;
    }
    
    
}
