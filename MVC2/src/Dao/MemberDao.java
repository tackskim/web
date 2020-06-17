package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Util.DbConnection;

public class MemberDao {
	private static MemberDao instance;
    
    // �̱��� ����
    private MemberDao(){}
    public static MemberDao getInstance(){
        if(instance==null)
            instance=new MemberDao();
        return instance;
    }
    
    // �α��ν� ���̵�, ��й�ȣ üũ �޼���
    // ���̵�, ��й�ȣ�� ���ڷ� �޴´�.
    public int loginCheck(String id, String pw) 
    {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
 
        String dbPW = ""; // db���� ���� ��й�ȣ�� ���� ����
        int x = -1;
 
        try {
            // ���� - ���� �Էµ� ���̵�� DB���� ��й�ȣ�� ��ȸ�Ѵ�.
            StringBuffer query = new StringBuffer();
            query.append("SELECT PW FROM USERINFO WHERE ID=?");
 
            conn = DbManager.getConnection();
            pstmt = conn.prepareStatement(query.toString());
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();
 
            if (rs.next()) // �Էµ� ���̵� �ش��ϴ� ��� �������
            {
                dbPW = rs.getString("PW"); // ����� ������ �ִ´�.
 
                if (dbPW.equals(pw)) 
                    x = 1; // �Ѱܹ��� ����� ������ ��� ��. ������ ��������
                else                  
                    x = 0; // DB�� ��й�ȣ�� �Է¹��� ��й�ȣ �ٸ�, ��������
            } else {
                x = -1; // �ش� ���̵� ���� ���
            }
 
            return x;
 
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
    
}
