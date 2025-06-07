package openapi;

import javax.naming.Context;

import javax.naming.InitialContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import openapi.TbDTO.BusLocation;

public class TbDAO {
	
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;
	
	public TbDAO() {
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
	 * T_TEST 테이블에 저장
	 * @param data
	 * @return
	 */
	
	public int insertData(TbDTO data) {
		int result = 0;
		
		try {
			
			con = dataFactory.getConnection();
			
			String sql = "insert into T_TEST("
					+ "CROWDED, "
					+ "LOWPLATE, "
					+ "PLATENO, "
					+ "REMAINSEATCNT, "
					+ "ROUTEID, "
					+ "ROUTETYPECD, "
					+ "STATECD, "
					+ "STATIONID, "
					+ "STATIONSEQ, "
					+ "TAGLESSCD, "
					+ "VEHID)"
					+ "values (?,?,?,?,?,?,?,?,?,?,?)";
			
			List<BusLocation> busLocationList = data.getResponse().getMsgBody().getBusLocationList();
			
			int count = 0;
			
			for(BusLocation item : busLocationList) {
				pstmt = con.prepareStatement(sql);
			
				pstmt.setInt(1,  item.getCrowded());
				pstmt.setInt(2,  item.getLowPlate());
				pstmt.setString(3,  item.getPlateNo());
				pstmt.setInt(4,  item.getRemainSeatCnt());
				pstmt.setLong(5,  item.getRouteId());
				pstmt.setInt(6,  item.getRouteTypeCd());
				pstmt.setInt(7,  item.getStateCd());
				pstmt.setLong(8,  item.getStationId());
				pstmt.setInt(9,  item.getStationSeq());
				pstmt.setInt(10,  item.getTaglessCd());
				pstmt.setLong(11,  item.getVehId());
				
				result = pstmt.executeUpdate();
				
				if(result < 1) throw new Exception("입력 중 오류 발생");
				if(count++ > 10) break;
			}
			
			pstmt.close();
			con.close();
		} catch(Exception e) {
			//System.out.println("SQL 구문 실행 중 예외 발생:" + e.toString());
		}
		return result;
	}
	
	public List<BusLocation> getList() {
		List<BusLocation> busLocationList = new ArrayList<>();
		
		try {
			String sql = "select * from T_TEST";
			con = dataFactory.getConnection();
			
			pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			//각 행에 대해 데이터를 꺼냄
			while(rs.next()) {
				BusLocation item = new BusLocation();
				
				item.setCrowded(rs.getInt("CROWDED"));
				item.setLowPlate(rs.getInt("LOWPLATE"));
				item.setPlateNo(rs.getString("PLATENO"));
				item.setRemainSeatCnt(rs.getInt("REMAINSEATCNT"));
				item.setRouteId(rs.getLong("ROUTEID"));
				item.setRouteTypeCd(rs.getInt("ROUTETYPECD"));
				item.setStateCd(rs.getInt("STATECD"));
				item.setStationId(rs.getLong("STATIONID"));
				item.setStationSeq(rs.getInt("STATIONSEQ"));
				item.setTaglessCd(rs.getInt("TAGLESSCD"));
				item.setVehId(rs.getLong("VEHID"));
				
				busLocationList.add(item);
			}
			
			rs.close();
			pstmt.close();
			con.close();
		} catch(Exception e) {
			//System.out.println("조회 중 에러 발생");
		}
		
		return busLocationList;
	}
}

