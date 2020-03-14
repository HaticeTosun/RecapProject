package utilities;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class readProperties {
    public static String getData(String whichData){
        String path ="configuration.properteis";
        String result= null;

        try {
            InputStream input = new FileInputStream(path);
            Properties properties = new Properties();
            properties.load(input);
            result = properties.getProperty(whichData);

        }catch (Exception e ){

        }
        return result;
    }



}
