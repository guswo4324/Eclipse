package openapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class ApiExplorer {

    public static <T extends Object> T getApiJsonData(
            String serviceKey,
            String srcUrl,
            Class<T> dto) throws IOException, URISyntaxException {
        
        // http://apis.data.go.kr/1320000/PlanCrossRoadInfoService/getPlanCRHDInfo
        // ?serviceKey=meXac76uoVH%2B6SQfe83GH07q8hu5R%2BTj8AH0alKd3ITyDxlBz22mzP6iGhWjHv0oBAd27SsgtxmVB1RkoFT9sw%3D%3D
        // &type=json
    	
    	//http:~~~를 StringBuilder append로 붙여서 가져옴
        StringBuilder urlBuilder = new StringBuilder(srcUrl);
        urlBuilder.append("?"+URLEncoder.encode("serviceKey", "UTF-8")+"="+serviceKey);
        urlBuilder.append("&"+URLEncoder.encode("type", "UTF-8")+"="+URLEncoder.encode("json", "UTF-8"));
        
        System.out.println("URL:"+urlBuilder.toString());
        
        URL url = new URL(urlBuilder.toString());
        
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader br;
        
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println("line:"+line);
            sb.append(line);
        }
        br.close();
        conn.disconnect();
        
        //헤더 지우기
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(sb.toString());
        
        if(rootNode.isArray() ) {
        	ArrayNode arrayNode = objectMapper.createArrayNode();
        	
        	// 인덱스 0을 제외한 데이터를 복사
        	for(int i=1; i<rootNode.size(); i++) {
        		arrayNode.add(rootNode.get(i));
        	}
        	
        	// 0을 제외한 배열을 문자열로 변환
        	String uJson = objectMapper.writeValueAsString(arrayNode);
            System.out.println("1수정된 json:"+uJson);
        	rootNode = arrayNode;
        }
        
        String jsonString = objectMapper.writeValueAsString(rootNode);
        //System.out.println("2수정된 json:"+jsonString);
        
        jsonString = "{ \"itemList\": "+jsonString + "}";
        //System.out.println("******************************************");
        //System.out.println("3수정된 json:"+jsonString);
        
        //데이터 이쁘게 만드는 방법
        objectMapper = new ObjectMapper();
        T data = objectMapper.readValue(jsonString, dto);
        
        System.out.println("---------------------------------------------");
        System.out.println("convert data:"+data.toString());
        
        return data;
    }
}