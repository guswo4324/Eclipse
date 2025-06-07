<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="openapi.*, openapi.TbDTO.*, java.util.List" %>
<%
// 로직 구현
    List<TbDTO.BusLocation> items = null;
    
    String serviceKey = "meXac76uoVH%2B6SQfe83GH07q8hu5R%2BTj8AH0alKd3ITyDxlBz22mzP6iGhWjHv0oBAd27SsgtxmVB1RkoFT9sw%3D%3D";
    String srcUrl = "https://apis.data.go.kr/6410000/buslocationservice/v2/getBusLocationListv2";
    
    try {
    	
        Class<TbDTO> dto = TbDTO.class;
        TbDTO data = (TbDTO)ApiExplorer3.getApiJsonData(serviceKey, srcUrl, dto);
        
        if (data.getResponse().getMsgBody().getBusLocationList().size() > 0) {
            items = data.getResponse().getMsgBody().getBusLocationList();
            
        }
        
		if (items != null && !items.isEmpty()) {
			
			TbDAO insertDao  = new TbDAO();
			insertDao.insertData(data);
			
		}
                
    } catch(Exception e) {
        //System.out.println(e.getMessage());
    }
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>경기도 버스도착 정보</title>
</head>

<body>
<% if(items != null && !items.isEmpty()) { %>
    <table border='1'>
        <thead>
            <tr>    
                <th>혼잡도</th>
                <th>저상버스</th>
                <th>번호판</th>
                <th>남은좌석수</th>
                <th>노선 ID</th>
                <th>노선 유형</th>
                <th>운행 상태</th>
                <th>정류장 ID</th>
                <th>정류장 순서</th>
                <th>태그리스 코드</th>
                <th>차량 ID</th>
            </tr>
        </thead>
        <tbody>
        <% for(BusLocation item: items) { %>
            <tr>
                <td><%= item.getCrowded() %></td>
                <td><%= item.getLowPlate() %></td>
                <td><%= item.getPlateNo() %></td>
                <td><%= item.getRemainSeatCnt() %></td>
                <td><%= item.getRouteId() %></td>
                <td><%= item.getRouteTypeCd() %></td>
                <td><%= item.getStateCd() %></td>
                <td><%= item.getStationId() %></td>
                <td><%= item.getStationSeq() %></td>
                <td><%= item.getTaglessCd() %></td>
                <td><%= item.getVehId() %></td>
            </tr>
        <% } %>
        </tbody>
    </table>
<% } else { %>
    <p>데이터가 없거나 로드하는 중 오류가 발생했습니다 </p>
<% } %>



</body>
</html>