package openapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class TbDTO {
    
    private response response;
    private msgHeader header;
    private msgBody body;
    
    @Data
    @NoArgsConstructor
    public static class response {
        private String comMsgHeader;
        private msgHeader msgHeader;
        private msgBody msgBody;
    }

    @Data
    @NoArgsConstructor
    public static class msgHeader {
        private String queryTime;
        private int resultCode;
        private String resultMessage;
    }
    
    @Data
    @NoArgsConstructor
    public static class msgBody {
        private List<BusLocation> busLocationList;
    }
    
    @Data
    @NoArgsConstructor
    public static class BusLocation {
    	@JsonProperty("crowded")
    	private int crowded;
    	
    	@JsonProperty("lowPlate")
        private int lowPlate;
    	
    	@JsonProperty("plateNo")
        private String plateNo;
    	
    	@JsonProperty("remainSeatCnt")
        private int remainSeatCnt;
    	
    	@JsonProperty("routeId")
        private Long routeId;
    	
    	@JsonProperty("routeTypeCd")
        private int routeTypeCd;
    	
    	@JsonProperty("stateCd")
        private int stateCd;
    	
    	@JsonProperty("stationId")
        private Long stationId;
    	
    	@JsonProperty("stationSeq")
        private int stationSeq;
    	
    	@JsonProperty("taglessCd")
        private int taglessCd;
    	
    	@JsonProperty("vehId")
        private Long vehId;
    	
        
    }

}