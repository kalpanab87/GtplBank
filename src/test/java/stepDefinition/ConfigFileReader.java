package stepDefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigFileReader {

    public Properties prop;
    public final String propertyFilePath = "C:\\Users\\User\\IdeaProjects\\MyMavenProject1\\src\\test\\java\\Utilities\\";

    public ConfigFileReader() {
        InputStream reader = null;
        try{
            reader = new FileInputStream(propertyFilePath + "Config.properties");
            prop = new Properties();
           try {
               prop.load(reader);
               reader.close();
           }
           catch (Exception e){

           }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            throw new RuntimeException("config.properties not found at"+propertyFilePath);
        }

    }
    public  String getDriverPath(){
        String driverpath = prop.getProperty("driverPath");
        if(driverpath!=null) return driverpath;
        else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file");
    }
    public  String getApplicationUrl(String applicationName){
        String url = prop.getProperty(applicationName);
        if(url != null) return url;
        else throw new RuntimeException("url not specified in the Configuration.properties file");
    }

    }


