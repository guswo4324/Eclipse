package openapi;

import javax.naming.Context;

import javax.naming.InitialContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import openapi.ApiDataDTO.Item;

public class ApiDataDAO {
	
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;
	
	public ApiDataDAO() {
		//생성자 DB 연결 설정
		//Tomcat의 context.xml 같은 설정 파일에 정의된 DB 연결 정보를 사용
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context)ctx.lookup("java:/comp/env");
			dataFactory = (DataSource)envContext.lookup("jdbc/oracle");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * t_cross 테이블에 저장
	 * @param data
	 * @return
	 */
	
	//t_cross에 데이터값 INSERT
	//테이블에 INSERT
	//외부에서 전달된 ApiDataDTO 객체의 Item 리스트를 하나씩 꺼내서 DB에 insert
	public int insertData(ApiDataDTO data) {
		int result = 0;
		
		try {
			con = dataFactory.getConnection();
			
			String sql = "insert into t_cross("
					+ "REGION_CD, "
					+ "INT_PLAN_NO, "
					+ "HOLY_PLAN_DD, "
					+ "INT_NO, "
					+ "HOLY_PLAN_MM, "
					+ "INT_NM, "
					+ "COLLCT_DTIME, "
					+ "PLAN_SN)"
					+ "values (?,?,?,?,?,?,?,?)";
			
			List<Item> itemList = data.getItemList();
			
			int count = 0;
			for(Item item : itemList) {
				pstmt = con.prepareStatement(sql);
				System.out.println(sql);
				//각 데이터 값 출력(디버깅 목적)
				System.out.println(
						item.getRegionCd()+":" +
						item.getRegionCd() +":"+
						item.getIntPlanNo() +":"+
						item.getHolyPlanDd() +":"+
						item.getIntNo() +":"+
						item.getHolyPlanMm() +":"+
						item.getIntNm() +":"+
						item.getCollctDtime() +":"+
						item.getPlanSn()
				);
				pstmt.setString(1,  item.getRegionCd());
				pstmt.setString(2,  item.getIntPlanNo());
				pstmt.setString(3,  item.getHolyPlanDd());
				pstmt.setString(4,  item.getIntNo());
				pstmt.setString(5,  item.getHolyPlanMm());
				pstmt.setString(6,  item.getIntNm());
				pstmt.setString(7,  item.getCollctDtime());
				pstmt.setString(8,  item.getPlanSn());
				
				result = pstmt.executeUpdate();
				
				if(result < 1) throw new Exception("입력 중 오류 발생");
				//데이터 최대 11개 까지만 insert
				if(count++ > 10) break;
			}
			
			pstmt.close();
			con.close();
		} catch(Exception e) {
			System.out.println("SQL 구문 실행 중 예외 발생:" + e.toString());
		}
		return result;
	}
	
	//t_cross 테이블의 모든 데이터를 조회해서
	//Item 리스트로 반환
	
	//순서
	//1. DB에서 전체데이터 조회(" select * from t_cross ")
	//2. ResultSet 루프돌며 Item 객체에 데이터 셋팅
	public List<Item> getList() {
		List<Item> itemList = new ArrayList<>();
		
		try {
			String sql = "select * from t_cross";
			con = dataFactory.getConnection();
			
			pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			//각 행에 대해 데이터를 꺼냄
			while(rs.next()) {
				Item item = new Item();
				item.setRegionCd(rs.getString("REGION_CD"));
				item.setIntPlanNo(rs.getString("INT_PLAN_NO"));
				item.setHolyPlanDd(rs.getString("HOLY_PLAN_DD"));
				item.setIntNo(rs.getString("INT_NO"));
				item.setHolyPlanMm(rs.getString("HOLY_PLAN_MM"));
				item.setIntNm(rs.getString("INT_NM"));
				item.setCollctDtime(rs.getString("COLLCT_DTIME"));
				item.setPlanSn(rs.getString("PLAN_SN"));
				
				itemList.add(item);
			}
			
			rs.close();
			pstmt.close();
			con.close();
		} catch(Exception e) {
			System.out.println("조회 중 에러 발생");
		}
		
		return itemList;
	}
}

//executeQuery(), rs.next(), executeUpdate()는 JDBC에서 SQL 실행 및 결과처리에 자주 사용하는 메서드

/*
executeQuery() : SELECT 쿼리 사용 시 사용
executeUpdate() : INSERT, UPDATE, DELETE 쿼리를 실행할 때 사용합니다.
  
*/
