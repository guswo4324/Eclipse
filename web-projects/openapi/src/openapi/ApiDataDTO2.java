package openapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class ApiDataDTO2 {
    
	private List<Item> itemList;
	
    private response response;
    private header header;
    private body body;
    
    @Data
    @NoArgsConstructor
    public static class response {
        private header header;
        private body body;
    }

    @Data
    @NoArgsConstructor
    public static class header {
        private String resultCode;
        private String resultMsg;
        private String type;
    }
    
    @Data
    @NoArgsConstructor
    public static class body {
        private List<Item> items;
        private int totalCount;
        private int numOfRows;
        private int pageNo;
    }
    
    @Data
    @NoArgsConstructor
    public static class Item {
    	@JsonProperty("TRRSRT_NM")
    	private String trrsrtNm;
    	@JsonProperty("TRRSRTSE")
        private String trrsrtSe;
    	@JsonProperty("RDNMADR")
        private String rdnmadr;
    	@JsonProperty("LNMADR")
        private String lnmadr;
    	@JsonProperty("LATITUDE")
        private String latitude;
    	@JsonProperty("LONGITUDE")
        private String longitude;
    	@JsonProperty("AR")
        private String ar;
    	@JsonProperty("CNVNNCFCLTY")
        private String cnvnncFclty;
    	@JsonProperty("STAYNGINFO")
        private String stayngInfo;
    	@JsonProperty("MVMAMSMTFCLTY")
        private String mvmAmsmtFclty;
    	@JsonProperty("RECRTCLTURFCLTY")
        private String recrtClturFclty;
    	@JsonProperty("HOSPITALITYFCLTY")
        private String hospitalityFclty;
    	@JsonProperty("SPORTFCLTY")
        private String sportFclty;
    	@JsonProperty("APPNDATE")
        private String appnDate;
    	@JsonProperty("ACEPTNCCO")
        private String aceptncCo;
    	@JsonProperty("PRKPLCECO")
        private String prkplceCo;
    	@JsonProperty("TRRSRTINTRCN")
        private String trrsrtIntrcn;
    	@JsonProperty("PHONENUMBER")
        private String phoneNumber;
    	@JsonProperty("INSTITUTIONNM")
        private String institutionNm;
    	@JsonProperty("REFERENCEDATE")
        private String referenceDate;
    	@JsonProperty("INSTTCODE")
        private String insttCode;
    	@JsonProperty("INSTTNM")
        private String insttNm;

  
        
    }

}