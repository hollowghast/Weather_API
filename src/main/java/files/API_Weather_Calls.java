/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

/**
 *
 * @author owner
 */
public enum API_Weather_Calls
{
    HOST("api.openweathermap.org"),
    FILE_FOR_WEATHER("/data/2.5/weather?"),
    AND("&"),
    KEY("APPID="),
    LANGUAGE("lang=de"),
    GET_FOR_ZIP_CODE("zip=?,?"),
    GET_FOR_CITY("q=?"),
    GET_FOR_CITY_CODE("q=?,?"),
    GET_FOR_LAT_LON("lat=?&lon=?"),
    GET_IN_CELSIUS("units=metric"),
    GET_IN_FAHRENHEIT("units=metric");
    
    private final String value;
    
    private API_Weather_Calls(String value){
        this.value = value;
    }

    @Override
    public String toString()
    {
        return value;
    }

    
}
