package Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Util.DBManager;
import Dto.*;
import Dao.*;

public class MemberDao {
	private static MemberDao instance;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;

	public MemberDao(){}
    public static MemberDao getInstance(){
        if(instance==null)
            instance=new MemberDao();
        return instance;
    }
	// 로그인시 아이디, 비밀번호 체크 메서드
	// 아이디, 비밀번호를 인자로 받는다.
	public String loginCheck(String id, String pw) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String dbAuth = "F"; // db에서 꺼낸 권한을 담을 변수

		try {
			// 쿼리 - 먼저 입력된 아이디로 DB에서 비밀번호를 조회한다.
			StringBuffer query = new StringBuffer();
			query.append("SELECT PW, AUTH FROM USERINFO where ID = ? and PW = ?");

			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(query.toString());
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();

			if (rs.next()) // 입력된 아이디에 해당하는 비번 있을경우
			{
				// A -> 관리자
				// U -> 사용자
				dbAuth = rs.getString("AUTH"); // 권한을 변수에 넣는다.
			} else {
				// F -> 아이디, 비밀번호가 맞는 계정이 없을 경우
				dbAuth = "F"; // 해당 아이디가 없을 경우
			}

			return dbAuth;

		} catch (Exception sqle) {
			throw new RuntimeException(sqle.getMessage());
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (Exception e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	}

	public void signupCheck(String id, String pw, String name, String address) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			// 쿼리 - 먼저 입력된 아이디로 DB에서 비밀번호를 조회한다.
			StringBuffer query = new StringBuffer();
			query.append("INSERT INTO USERINFO values(UserNo.nextval, ?, ?, ?, 'U', ?)");

			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(query.toString());
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, address);

			pstmt.executeUpdate();

		} catch (Exception sqle) {
			throw new RuntimeException(sqle.getMessage());
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (Exception e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	}

	// 시청자 게시판 입력
	public boolean ViewerWrite(String contents, String title) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			StringBuffer query = new StringBuffer();
			query.append("INSERT INTO VIEWCOMMENT VALUES(?, ?, Viewco.nextval)");

			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(query.toString());
			pstmt.setString(1, title);
			pstmt.setString(2, contents);

			pstmt.executeQuery();

			return true;

		} catch (Exception sqle) {
			throw new RuntimeException(sqle.getMessage());
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (Exception e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	}

	// 시청자 게시판 목록
	public ArrayList<MemberDto> ViewerList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();

		try {
			StringBuffer query = new StringBuffer();
			query.append("select * from VIEWCOMMENT");

			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(query.toString());

			pstmt.getResultSet();

			rs = pstmt.executeQuery();

			while (rs.next()) {
				MemberDto comment = new MemberDto();
				comment.setVIEWCOMMENT_TITLE(rs.getString("TITLE"));
				comment.setVIEWCOMMENT_CONTENT(rs.getString("CONTENT"));
				comment.setVIEWCOMMENT_NUM(rs.getInt("NUM"));
				lists.add(comment);
			}

			return lists;
		} catch (Exception ex) {
			System.out.println("getCommentList 에러 : " + ex);
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ex) {
				}
		}
		return null;
	}
	
	//뉴스 게시판 등록
    public boolean NewsWrite(String contents, Date reg, String title, String boarddata) {
    	
    	Connection conn = null;
        PreparedStatement pstmt = null;
 
        try {
            StringBuffer query = new StringBuffer();
            query.append("insert into RELEASES values(?, ?, ?, ?)");
 
            conn = DBManager.getConnection();
            pstmt = conn.prepareStatement(query.toString());
            pstmt.setString(1, contents);
            pstmt.setDate(2, reg);
            pstmt.setString(3, title);
            pstmt.setString(4, boarddata);
            
            pstmt.executeQuery();
            
            return true;
 
        } catch (Exception sqle) {
            throw new RuntimeException(sqle.getMessage());
        } finally {
            try{
                if ( pstmt != null ){ pstmt.close(); pstmt=null; }
                if ( conn != null ){ conn.close(); conn=null;    }
            }catch(Exception e){
                throw new RuntimeException(e.getMessage());
            }
        }
    }
    
  //채용공고 게시판 등록 (경력)
    public boolean NewsWrite(String contents,String title, String reg) {
    	
    	Connection conn = null;
        PreparedStatement pstmt = null;
 
        try {
            conn = DBManager.getConnection();
            pstmt = conn.prepareStatement("insert into CAREER values(?, ?, ?,  NN.NEXTVAL)");
            pstmt.setString(1, contents);
            pstmt.setString(2, title);  
            pstmt.setString(3, reg);
            System.out.println(title);
            int k=pstmt.executeUpdate();
            System.out.println("업데이트 실행 결과 : "+k);
            return true;
 
        } catch (Exception sqle) {
            sqle.printStackTrace();
            return false;
        } finally {
            try{
                if ( pstmt != null ){ pstmt.close(); pstmt=null; }
                if ( conn != null ){ conn.close(); conn=null;    }
            }catch(Exception e){
                throw new RuntimeException(e.getMessage());
            }
        }
    }
    
    public ArrayList<MemberDto> NewComment(){
        String board_list_sql="select * from VIEWCOMMENT";
              
        ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
     
        try{
           pstmt = con.prepareStatement(board_list_sql);

           rs = pstmt.executeQuery();
           
           while(rs.next()){
         	  MemberDto comment = new MemberDto();
              comment.setRELEASES_CONTENT(rs.getString("CONTENT"));
              comment.setRELEASES_DAY(rs.getString("DAY"));
              comment.setRELEASES_TITLE(rs.getString("TITLE"));
              comment.setRELEASES_IMG(rs.getString("IMG"));
              lists.add(comment);
           }
           
           return lists;
        }catch(Exception ex){
           System.out.println("getCommentList 에러 : " + ex);
        }finally{
           if(rs!=null) try{rs.close();}catch(SQLException ex){}
           if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
        }
        return null;
     }
	public ArrayList<MemberDto> list() {
		// TODO Auto-generated method stub
		return null;
	}
	//채용 마지막화면 카운트 //쿼리 수행
    public ArrayList<Integer> count(){
       
       ArrayList<Integer> count=new ArrayList<Integer>();
        String count_career_sql="select Count(*) FROM CAREER where KIND = 1";
        String count_crunew_sql="select Count(*) FROM CRUNEW where KIND = 2";
        String count_intern_sql="select Count(*) FROM INTERN where KIND = 3";
        String count_all_sql="select Count(*) FROM CAREER ";

        try{
           con=DBManager.getConnection();
           pstmt = con.prepareStatement(count_career_sql);
           rs = pstmt.executeQuery();
           while(rs.next()){
             count.add(rs.getInt(1));
           }
           pstmt = con.prepareStatement(count_crunew_sql);
           rs = pstmt.executeQuery();
           while(rs.next()){
             count.add(rs.getInt(1));
           }
           pstmt = con.prepareStatement(count_intern_sql);
           rs = pstmt.executeQuery();
           while(rs.next()){
             count.add(rs.getInt(1));
           }
           pstmt = con.prepareStatement(count_all_sql);
           rs = pstmt.executeQuery();
           while(rs.next()){
             count.add(rs.getInt(1));
           }
           System.out.println("갯수 출력");
           for(Integer i:count) {
              System.out.println(i.toString());
           }
           return count;
        }catch(Exception ex){
           System.out.println("getCommentList 에러 : " + ex);
        }finally{
           if(rs!=null) try{rs.close();}catch(SQLException ex){}
           if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
        }
        return null;
     }
    
    //게시판 NUM 기준 검색
    public ArrayList<MemberDto> ViewDtail(int num){
    	Connection conn = null;
        PreparedStatement pstmt = null;
    	
    	String board_list_sql="select * from VIEWCOMMENT where NUM = ?";
        
        ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
     
        try{
           conn = DBManager.getConnection();
           pstmt = conn.prepareStatement(board_list_sql);
           pstmt.setInt(1, num);
           rs = pstmt.executeQuery();
           
           while(rs.next()){
         	  MemberDto comment = new MemberDto();
              comment.setVIEWCOMMENT_TITLE(rs.getString("TITLE"));
              comment.setVIEWCOMMENT_CONTENT(rs.getString("CONTENT"));
              comment.setVIEWCOMMENT_NUM(rs.getInt("NUM"));
              lists.add(comment);
           }
           
           return lists;
        }catch(Exception ex){
           System.out.println("getCommentList 에러 : " + ex);
        }finally{
           if(rs!=null) try{rs.close();}catch(SQLException ex){}
           if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
        }
        return null;
    }
    
    //게시판 글 수정
    public void ViewDtailUp(String title, String contents, int num) {
    	Connection conn = null;
        PreparedStatement pstmt = null;
    	
    	String board_list_sql="UPDATE VIEWCOMMENT SET TITLE =?, CONTENT = ? where NUM = ?";
            
        try{
           conn = DBManager.getConnection();
           pstmt = conn.prepareStatement(board_list_sql);
           pstmt.setString(1, title);
           pstmt.setString(2, contents);
           pstmt.setInt(3, num);
           pstmt.executeUpdate();
           
        }catch(Exception ex){
           System.out.println("getCommentList 에러 : " + ex);
        }finally{
           if(rs!=null) try{rs.close();}catch(SQLException ex){}
           if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
        }
    }
    
    //게시판 글 삭제
    public void ViewDtailDel(int num) {
    	Connection conn = null;
        PreparedStatement pstmt = null;
    	
    	String board_list_sql="DELETE FROM VIEWCOMMENT WHERE NUM = ?";
            
        try{
           conn = DBManager.getConnection();
           pstmt = conn.prepareStatement(board_list_sql);
           pstmt.setInt(1, num);
           pstmt.executeUpdate();
           conn.close();
        }catch(Exception ex){
           System.out.println("getCommentList 에러 : " + ex);
        }finally{
           if(rs!=null) try{rs.close();}catch(SQLException ex){}
           if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
        }
    }
    
    //방송 전체 출력
    public ArrayList<PortfolioDto> PortfolioAll(){
    	Connection conn = null;
        PreparedStatement pstmt = null;
    	
    	String board_list_sql="Select * from BROAD";
        
        ArrayList<PortfolioDto> lists = new ArrayList<PortfolioDto>();
     
        try{
           conn = DBManager.getConnection();
           pstmt = conn.prepareStatement(board_list_sql);
           rs = pstmt.executeQuery();
           
           while(rs.next()){
        	   PortfolioDto comment = new PortfolioDto();
              comment.setTitle(rs.getString("TITLE"));
              comment.setProduction(rs.getString("PRODUCTION"));
              comment.setScreen(rs.getString("SCREEN"));
              comment.setCast(rs.getString("CAST"));
              comment.setImg(rs.getString("IMG"));
              
              lists.add(comment);
           }
           conn.close();
           return lists;
        }catch(Exception ex){
           System.out.println("getCommentList 에러 : " + ex);
        }finally{
           if(rs!=null) try{rs.close();}catch(SQLException ex){}
           if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
        }
        return null;
    }
    
    //방영 중인 방송 전체 출력
    public ArrayList<PortfolioDto> PortfolioOn(){
    	Connection conn = null;
        PreparedStatement pstmt = null;
    	
    	String board_list_sql="Select * from BROAD where ONAIR = 0";
        
        ArrayList<PortfolioDto> lists = new ArrayList<PortfolioDto>();
     
        try{
           conn = DBManager.getConnection();
           pstmt = conn.prepareStatement(board_list_sql);
           rs = pstmt.executeQuery();
           
           while(rs.next()){
        	   PortfolioDto comment = new PortfolioDto();
              comment.setTitle(rs.getString("TITLE"));
              comment.setProduction(rs.getString("PRODUCTION"));
              comment.setScreen(rs.getString("SCREEN"));
              comment.setCast(rs.getString("CAST"));
              comment.setImg(rs.getString("IMG"));
              
              lists.add(comment);
           }
           conn.close();
           return lists;
        }catch(Exception ex){
           System.out.println("getCommentList 에러 : " + ex);
        }finally{
           if(rs!=null) try{rs.close();}catch(SQLException ex){}
           if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
        }
        return null;
    }
    
  //종영인 방송 전체 출력
	public ArrayList<PortfolioDto> PortfolioEnd() {
		Connection conn = null;
        PreparedStatement pstmt = null;
    	
    	String board_list_sql="Select * from BROAD where ONAIR = 1";
        
        ArrayList<PortfolioDto> lists = new ArrayList<PortfolioDto>();
     
        try{
           conn = DBManager.getConnection();
           pstmt = conn.prepareStatement(board_list_sql);
           rs = pstmt.executeQuery();
           
           while(rs.next()){
        	   PortfolioDto comment = new PortfolioDto();
              comment.setTitle(rs.getString("TITLE"));
              comment.setProduction(rs.getString("PRODUCTION"));
              comment.setScreen(rs.getString("SCREEN"));
              comment.setCast(rs.getString("CAST"));
              comment.setImg(rs.getString("IMG"));
              
              lists.add(comment);
           }
           conn.close();
           return lists;
        }catch(Exception ex){
           System.out.println("getCommentList 에러 : " + ex);
        }finally{
           if(rs!=null) try{rs.close();}catch(SQLException ex){}
           if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
        }
        return null;
	}
	public ArrayList<PortfolioDto> PortfolioGlo() {
		Connection conn = null;
        PreparedStatement pstmt = null;
    	
    	String board_list_sql="Select * from BROAD where ONAIR = 2";
        
        ArrayList<PortfolioDto> lists = new ArrayList<PortfolioDto>();
     
        try{
        	System.out.println("에러");
           conn = DBManager.getConnection();
           System.out.println("에러");
           pstmt = conn.prepareStatement(board_list_sql);
           rs = pstmt.executeQuery();
           
           while(rs.next()){
        	   PortfolioDto comment = new PortfolioDto();
              comment.setTitle(rs.getString("TITLE"));
              comment.setProduction(rs.getString("PRODUCTION"));
              comment.setScreen(rs.getString("SCREEN"));
              comment.setCast(rs.getString("CAST"));
              comment.setImg(rs.getString("IMG"));
              
              lists.add(comment);
           }
           conn.close();
           return lists;
        }catch(Exception ex){
           System.out.println("getCommentList 에러 : " + ex);
        }finally{
           if(rs!=null) try{rs.close();}catch(SQLException ex){}
           if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
        }
        return null;
	}
	public ArrayList<MemberDto> TotalRecru() {
		Connection conn = null;
        PreparedStatement pstmt = null;
    	
    	String board_list_sql="Select TITLE, CONTENT FROM career UNION SELECT TITLE, CONTENT FROM crunew UNION SELECT TITLE, CONTENT FROM intern";
        
        ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
     
        try{
        	System.out.println("에러");
           conn = DBManager.getConnection();
           System.out.println("에러");
           pstmt = conn.prepareStatement(board_list_sql);
           rs = pstmt.executeQuery();
           
           while(rs.next()){
        	   MemberDto comment = new MemberDto();
              comment.setCAREER_TITLE(rs.getString("TITLE"));
              comment.setCAREER_CONTENT(rs.getString("CONTENT"));
              
              lists.add(comment);
           }
           conn.close();
           return lists;
        }catch(Exception ex){
           System.out.println("getCommentList 에러 : " + ex);
        }finally{
           if(rs!=null) try{rs.close();}catch(SQLException ex){}
           if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
        }
        return null;
	}
	public ArrayList<MemberDto> CareerRecru() {
		Connection conn = null;
        PreparedStatement pstmt = null;
    	
    	String board_list_sql="Select TITLE, CONTENT, NUM FROM career";
        
        ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
     
        try{
           conn = DBManager.getConnection();
           pstmt = conn.prepareStatement(board_list_sql);
           rs = pstmt.executeQuery();
           
           while(rs.next()){
        	   MemberDto comment = new MemberDto();
              comment.setCAREER_TITLE(rs.getString("TITLE"));
              comment.setCAREER_CONTENT(rs.getString("CONTENT"));
              comment.setCAREER_NUM(rs.getInt("NUM"));
              
              lists.add(comment);
           }
           return lists;
        }catch(Exception ex){
           System.out.println("getCommentList 에러 : " + ex);
        }finally{
           if(rs!=null) try{rs.close();}catch(SQLException ex){}
           if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
        }
        return null;
	}
	public ArrayList<MemberDto> CrunewRecru() {
		Connection conn = null;
        PreparedStatement pstmt = null;
    	
    	String board_list_sql="Select TITLE, CONTENT, NUM FROM crunew";
        
        ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
     
        try{
           conn = DBManager.getConnection();
           pstmt = conn.prepareStatement(board_list_sql);
           rs = pstmt.executeQuery();
           
           while(rs.next()){
        	   MemberDto comment = new MemberDto();
              comment.setCRUNEW_TITLE(rs.getString("TITLE"));
              comment.setCRUNEW_CONTENT(rs.getString("CONTENT"));
              comment.setCRUNEW_NUM(rs.getInt("NUM"));
              
              lists.add(comment);
           }
           return lists;
        }catch(Exception ex){
           System.out.println("getCommentList 에러 : " + ex);
        }finally{
           if(rs!=null) try{rs.close();}catch(SQLException ex){}
           if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
        }
        return null;
	}
	public ArrayList<MemberDto> InternRecru() {
		Connection conn = null;
        PreparedStatement pstmt = null;
    	
    	String board_list_sql="Select TITLE, CONTENT, NUM FROM INTERN";
        
        ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
     
        try{
           conn = DBManager.getConnection();
           pstmt = conn.prepareStatement(board_list_sql);
           rs = pstmt.executeQuery();
           
           while(rs.next()){
        	   MemberDto comment = new MemberDto();
              comment.setINTERN_TITLE((rs.getString("TITLE")));
              comment.setINTERN_CONTENT((rs.getString("CONTENT")));
              comment.setINTERN__NUM((rs.getInt("NUM")));
              
              lists.add(comment);
           }
           return lists;
        }catch(Exception ex){
           System.out.println("getCommentList 에러 : " + ex);
        }finally{
           if(rs!=null) try{rs.close();}catch(SQLException ex){}
           if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
        }
        return null;
	}
	public ArrayList<MemberDto> Releases() {
		Connection conn = null;
        PreparedStatement pstmt = null;
    	
    	String board_list_sql="Select TITLE, DAY, CONTENT, IMG FROM RELEASES";
        
        ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
     
        try{
           conn = DBManager.getConnection();
           pstmt = conn.prepareStatement(board_list_sql);
           rs = pstmt.executeQuery();
           
           while(rs.next()){
        	   MemberDto comment = new MemberDto();
              comment.setRELEASES_TITLE(rs.getString("TITLE"));
              comment.setRELEASES_CONTENT(rs.getString("CONTENT"));
              comment.setRELEASES_DAY(rs.getString("DAY"));
              comment.setRELEASES_IMG(rs.getString("IMG"));
              
              lists.add(comment);
           }
           return lists;
        }catch(Exception ex){
           System.out.println("getCommentList 에러 : " + ex);
        }finally{
           if(rs!=null) try{rs.close();}catch(SQLException ex){}
           if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
        }
        return null;
	}
	public ArrayList<MemberDto> AdViewerList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();

		try {
			StringBuffer query = new StringBuffer();
			query.append("select * from VIEWCOMMENT");

			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(query.toString());

			pstmt.getResultSet();

			rs = pstmt.executeQuery();

			while (rs.next()) {
				MemberDto comment = new MemberDto();
				comment.setVIEWCOMMENT_TITLE(rs.getString("TITLE"));
				comment.setVIEWCOMMENT_CONTENT(rs.getString("CONTENT"));
				comment.setVIEWCOMMENT_NUM(rs.getInt("NUM"));
				lists.add(comment);
			}

			return lists;
		} catch (Exception ex) {
			System.out.println("getCommentList 에러 : " + ex);
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ex) {
				}
		}
		return null;
	}
	public ArrayList<MemberDto> AdViewDtail(int num) {
		Connection conn = null;
        PreparedStatement pstmt = null;
    	
    	String board_list_sql="select * from VIEWCOMMENT where NUM = ?";
        
        ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
     
        try{
           conn = DBManager.getConnection();
           pstmt = conn.prepareStatement(board_list_sql);
           pstmt.setInt(1, num);
           rs = pstmt.executeQuery();
           
           while(rs.next()){
         	  MemberDto comment = new MemberDto();
              comment.setVIEWCOMMENT_TITLE(rs.getString("TITLE"));
              comment.setVIEWCOMMENT_CONTENT(rs.getString("CONTENT"));
              comment.setVIEWCOMMENT_NUM(rs.getInt("NUM"));
              lists.add(comment);
           }
           
           return lists;
        }catch(Exception ex){
           System.out.println("getCommentList 에러 : " + ex);
        }finally{
           if(rs!=null) try{rs.close();}catch(SQLException ex){}
           if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
        }
        return null;
	}
	//신입 입력
	public boolean NewsWrite2(String contents, String title, String reg) {

    	Connection conn = null;
        PreparedStatement pstmt = null;
 
        try {
            conn = DBManager.getConnection();
            pstmt = conn.prepareStatement("insert into CRUNEW values(?, ?, ?, NN2.NEXTVAL)");
            pstmt.setString(1, contents);
            pstmt.setString(2, title);  
            pstmt.setString(3, reg);
            System.out.println(title);
            int k=pstmt.executeUpdate();
            System.out.println("업데이트 실행 결과 : "+k);
            return true;
 
        } catch (Exception sqle) {
            sqle.printStackTrace();
            return false;
        } finally {
            try{
                if ( pstmt != null ){ pstmt.close(); pstmt=null; }
                if ( conn != null ){ conn.close(); conn=null;    }
            }catch(Exception e){
                throw new RuntimeException(e.getMessage());
            }
        }
	}
	public boolean NewsWrite3(String contents, String title, String reg) {
		Connection conn = null;
        PreparedStatement pstmt = null;
 
        try {
            conn = DBManager.getConnection();
            pstmt = conn.prepareStatement("insert into INTERN values(?, ?, ?, NN3.NEXTVAL)");
            pstmt.setString(1, contents);
            pstmt.setString(2, title);  
            pstmt.setString(3, reg);
            System.out.println(title);
            int k=pstmt.executeUpdate();
            System.out.println("업데이트 실행 결과 : "+k);
            return true;
 
        } catch (Exception sqle) {
            sqle.printStackTrace();
            return false;
        } finally {
            try{
                if ( pstmt != null ){ pstmt.close(); pstmt=null; }
                if ( conn != null ){ conn.close(); conn=null;    }
            }catch(Exception e){
                throw new RuntimeException(e.getMessage());
            }
        }
	}
	//subject, Date, img
	public boolean ANEWSInput(String subject, String contents,String Date,String img) {
		Connection conn = null;
        PreparedStatement pstmt = null;
 
        try {
            conn = DBManager.getConnection();
            pstmt = conn.prepareStatement("insert into RELEASES values(?, SYSDATE , ?, ?)");
            pstmt.setString(1, contents);
            pstmt.setString(3, subject);
            pstmt.setString(4, img);
            int k=pstmt.executeUpdate();
            System.out.println("업데이트 실행 결과 : "+k);
            return true;
 
        } catch (Exception sqle) {
            sqle.printStackTrace();
            return false;
        } finally {
            try{
                if ( pstmt != null ){ pstmt.close(); pstmt=null; }
                if ( conn != null ){ conn.close(); conn=null;    }
            }catch(Exception e){
                throw new RuntimeException(e.getMessage());
            }
        }
	}
    
}