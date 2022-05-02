package core;

import io.cucumber.java.hu.Ha;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.HashMap;

public class Config {

    public static final String url = "https://sticsoftio.sharepoint.com/sites/HubStandard";


    public static String getTimStamp()
    {
        Timestamp instant= Timestamp.from(Instant.now());
        return instant.toString();
    }


    public static JSONObject testData(String fileName)
    {
        JSONObject jsonObject = null;
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("src/main/resources/data/config.json"));
            jsonObject = (JSONObject) obj;

        } catch (IOException e) {
            e.printStackTrace();

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return jsonObject;

    }



}
