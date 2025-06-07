package openapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ApiExplorer3 {

    public static <T extends Object> T getApiJsonData(String serviceKey, String srcUrl, Class<T> dto)
    		throws IOException, URISyntaxException {
 
    	//https://apis.data.go.kr/6410000/buslocationservice/v2/getBusLocationListv2
    	//?serviceKey=meXac76uoVH%2B6SQfe83GH07q8hu5R%2BTj8AH0alKd3ITyDxlBz22mzP6iGhWjHv0oBAd27SsgtxmVB1RkoFT9sw%3D%3D
    	//&routeId=200000150&format=json
    	
        StringBuilder urlBuilder = new StringBuilder(srcUrl);
        urlBuilder.append("?"+URLEncoder.encode("serviceKey", "UTF-8")+"="+serviceKey);
        urlBuilder.append("&" + URLEncoder.encode("routeId", "UTF-8") + "=" + URLEncoder.encode("200000150", "UTF-8"));
        urlBuilder.append("&" + URLEncoder.encode("format", "UTF-8") + "=" + URLEncoder.encode("json", "UTF-8"));


        

        URL url = new URL(urlBuilder.toString());
        
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        //System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader br;
        
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        
        StringBuilder sb = new StringBuilder();
        String line;
        
        while ((line = br.readLine()) != null) {
            //System.out.println("line:"+line);
            sb.append(line);
        }
        
        br.close();
        conn.disconnect();
        
        ObjectMapper objectMapper = new ObjectMapper();
        
        T data = objectMapper.readValue(sb.toString(), dto);
        
        if(data != null) {
        	//System.out.println("*********data:"+data.toString());
        }
        
        //System.out.println("---------------------------------------------");
        //System.out.println("convert data:"+data.toString());
        
        return data;
    }
}