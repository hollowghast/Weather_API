/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.deuerlein.daniel._061219_travel_weather_app_project;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import files.API_Weather_Calls;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author owner
 */
public class Location
{
    private static final String API_KEY = "72f86d301b1a3b4b3de701d5eedd11c1";
    
    private CurrentWeather weather;
    
    private String zip, country_code;
    private String city;
    private Float lat, lon;

    public Location(String zip, String country_code)
    {
        this.zip = zip;
        this.country_code = country_code;
    }

    public Location(String city)
    {
        this.city = city;
    }

    public Location(Float lat, Float lon)
    {
        this.lat = lat;
        this.lon = lon;
    }
    
    
    
    public void loadCurrentWeather()
            throws IOException
    {
        URL url = new URL("http", "api.openweathermap.org", 80, "/data/2.5/weather?zip=8301,at&lang=en&units=metric&APPID=" + API_KEY);
        
//        StringBuilder parameter = new StringBuilder();
//        parameter.append("http://");
//        parameter.append(API_Weather_Calls.HOST);
//        parameter.append(API_Weather_Calls.FILE_FOR_WEATHER);
//        parameter.append(API_Weather_Calls.KEY.toString().concat(API_KEY));
//        parameter.append(API_Weather_Calls.AND);
//        parameter.append(API_Weather_Calls.GET_FOR_LAT_LON.toString().replace("?", "123").replace("?", "123"));
//        System.out.println(parameter.toString());
//        
//        URL url2 = new URL(parameter.toString());
        
        //proxy
        //InetSocketAddress address = new InetSocketAddress("deudaz15:htlPasswort@proxy.htl-kaindorf.ac.at", 3128);
        //Proxy proxy = new Proxy(Proxy.Type.SOCKS, address);
        
        HttpURLConnection con = (HttpURLConnection) url.openConnection(/*proxy*/);
        con.setRequestMethod("GET");
        if(con.getResponseCode() == HttpURLConnection.HTTP_OK){
            //Scanner scan = new Scanner(con.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
            StringBuilder json = new StringBuilder();
            json.append(br.readLine());
            
//            while(scan.hasNextLine()){
//                json.append(scan.nextLine());
//            }
//            scan.close();
            br.close();
            System.out.println(json.toString());
            GsonBuilder builder = new GsonBuilder();
            builder.serializeNulls();
            builder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
            
            Gson gson = builder.create();
            //CurrentWeather w = gson.fromJson(json.toString(), CurrentWeather.class);
            //System.out.println(w);
                
            
//            String jsonInUTF8;
//            jsonInUTF8 = new String(StandardCharsets.UTF_8.encode(json.toString()).array(), StandardCharsets.UTF_8);
            
            
            weather = gson.fromJson(json.toString(), CurrentWeather.class);
            this.city = weather.getName();
            this.country_code = weather.getSys().getCountry();
            this.lat = weather.getCoord().getLat();
            this.lon = weather.getCoord().getLon();
        }
       
        con.disconnect();
    }

    @Override
    public String toString()
    {
        return this.city;
        //return "Location{" + "weather=" + weather + ", zip=" + zip + ", country_code=" + country_code + ", city=" + city + ", lat=" + lat + ", lon=" + lon + '}';
    }
    
    public String getCurrentWeatherInformation(){
        return this.weather.toString();
    }
    
}
