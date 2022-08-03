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
public class CurrentWeather
{
    private final Coordinates coord;
    private final Weather [] weather;
    private final String base;
    private final AirData main;
    private final long visibility;
    private final Wind wind;
    private final CloudData clouds;
    private final long dt;
    private final LocationInformation sys;
    private final int timezone;
    private final long id;
    private final String name;
    private final int cod;

    public CurrentWeather(Coordinates coord, Weather [] weather, String base, AirData main, long visibility, Wind wind, CloudData clouds, long dt, LocationInformation sys, int timezone, long id, String name, int cod)
    {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.timezone = timezone;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }


    @Override
    public String toString()
    {
        StringBuilder currentWeatherOutput = new StringBuilder();
        currentWeatherOutput.append("Current weather:\n");
        currentWeatherOutput.append("\nCoordinates:\n\t");
        currentWeatherOutput.append(coord);
        currentWeatherOutput.append("\nWeather:\n");
        for(Weather w : weather){
            currentWeatherOutput.append("\t" + w + "\n");
        }
        currentWeatherOutput.append("Base:\n\t");
        currentWeatherOutput.append(base);
        currentWeatherOutput.append("\nMain:\n\t");
        currentWeatherOutput.append(main);
        currentWeatherOutput.append("\nVisibility:\n\t");
        currentWeatherOutput.append(visibility);
        currentWeatherOutput.append("\nWind:\n\t");
        currentWeatherOutput.append(wind);
        currentWeatherOutput.append("\nClouds:\n\t");
        currentWeatherOutput.append(clouds);
        currentWeatherOutput.append("\nDT:\n\t");
        currentWeatherOutput.append(dt);
        currentWeatherOutput.append("\nSystem:\n\t");
        currentWeatherOutput.append(sys);
        currentWeatherOutput.append("\nTimezone:\n\t");
        currentWeatherOutput.append(timezone);
        currentWeatherOutput.append("\nID:\n\t");
        currentWeatherOutput.append(id);
        currentWeatherOutput.append("\nName:\n\t");
        currentWeatherOutput.append(name);
        currentWeatherOutput.append("\nCod:\n\t");
        currentWeatherOutput.append(cod);
        
        return currentWeatherOutput.toString();
    }
    
    
    
    /* GETTER */
    public Coordinates getCoord()
    {
        return coord;
    }

    public Weather [] getWeather()
    {
        return weather;
    }

    public String getBase()
    {
        return base;
    }

    public AirData getMain()
    {
        return main;
    }

    public long getVisibility()
    {
        return visibility;
    }

    public Wind getWind()
    {
        return wind;
    }

    public CloudData getClouds()
    {
        return clouds;
    }

    public long getDt()
    {
        return dt;
    }

    public LocationInformation getSys()
    {
        return sys;
    }

    public int getTimezone()
    {
        return timezone;
    }

    public long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getCod()
    {
        return cod;
    }
    
    
}
