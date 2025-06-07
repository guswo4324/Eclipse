<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="openapi.*, openapi.ApiDataDTO.*, java.util.List" %>
<%
    // 로직 구현
    List<Item> itemList = null;
    
    String serviceKey = "meXac76uoVH%2B6SQfe83GH07q8hu5R%2BTj8AH0alKd3ITyDxlBz22mzP6iGhWjHv0oBAd27SsgtxmVB1RkoFT9sw%3D%3D";
    String srcUrl = "http://apis.data.go.kr/1320000/PlanCrossRoadInfoService/getPlanCRHDInfo";
        
    try {
        Class<ApiDataDTO> dto = ApiDataDTO.class;
        ApiDataDTO data = (ApiDataDTO)ApiExplorer.getApiJsonData(serviceKey, srcUrl, dto);
        
        if (data.getItemList() != null && data.getItemList().size() > 0) {
            itemList = data.getItemList();
        }
        
        if (itemList != null && !itemList.isEmpty()) {
            ApiDataDAO insertDao = new ApiDataDAO();
            insertDao.insertData(data);
        }
        
    } catch(Exception e) {
        System.out.println(e.getMessage());
    }
    
    
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공공 데이터</title>
</head>
<body>
<%
    ApiDataDAO selectDao = new ApiDataDAO();
    List<Item> selectList = selectDao.getList();
%>
    <table border='1' width='800' align='center'>
        <thead>
            <tr>
                <th>지역 코드</th>
                <th>계획 번호</th>
                <th>계획 일</th>
                <th>교차로 번호</th>
                <th>계획 월</th>
                <th>교차로 이름</th>
                <th>수집 일시</th>
                <th>계획 일련번호</th>
            </tr>
        </thead>
        <tbody>
            <% for (Item item : selectList) { %>
                <tr>
                    <td><%= item.getRegionCd() %></td>
                    <td><%= item.getIntPlanNo() %></td>
                    <td><%= item.getHolyPlanDd() %></td>
                    <td><%= item.getIntNo() %></td>
                    <td><%= item.getHolyPlanMm() %></td>
                    <td><%= item.getIntNm() %></td>
                    <td><%= item.getCollctDtime() %></td>
                    <td><%= item.getPlanSn() %></td>
            <% } %>
        </tbody>
    </table>
</body>
</html>