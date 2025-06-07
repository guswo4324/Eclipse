package openapi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class ApiDataDTO {
	
	private List<Item> itemList;
	
	/*
	
	{
		"REGION_CD": "L01",
		"INT_PLAN_NO": "4",
		"HOLY_PLAN_DD": "1",
		"INT_NO": "239",
		"HOLY_PLAN_MM": "1",
		"INT_NM": "노원롯데백화점",
		"COLLCT_DTIME": "2019-10-02 01:00:10",
		"PLAN_SN": "1"
	}
	 
	*/
 
	
    @Data
    @NoArgsConstructor
    public static class Item {
        
        @JsonProperty("REGION_CD")
        private String regionCd;
        
        @JsonProperty("INT_PLAN_NO")
        private String intPlanNo;
        
        @JsonProperty("HOLY_PLAN_DD")
        private String holyPlanDd;
        
        @JsonProperty("INT_NO")
        private String intNo;
        
        @JsonProperty("HOLY_PLAN_MM")
        private String holyPlanMm;
        
        @JsonProperty("INT_NM")
        private String intNm;
        
        @JsonProperty("COLLCT_DTIME")
        private String collctDtime;
        
        @JsonProperty("PLAN_SN")
        private String planSn;
    }
    
}
