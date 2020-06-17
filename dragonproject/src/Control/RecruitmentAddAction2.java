package Control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.MemberDao;

public class RecruitmentAddAction2 implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		 
		 MemberDao boarddao = new MemberDao();
	   	ActionForward forward=new ActionForward();
	   	
	   	String contents = request.getParameter("CAREER_CONTENT");
	   	
		String title = request.getParameter("CAREER_TITLE");
		String reg = request.getParameter("reg");
		


	   	boolean check = boarddao.NewsWrite(contents, title, reg);
  		
  		try{
  			
  			if(check == true) {
  				//�Խ��� ��� ����
  				request.setAttribute("result", 1);
  				
  			}else {
  				//�Խ��� ��� ���� 
  				request.setAttribute("result", -1);
  				
  			}

  			forward.setRedirect(true);
	   		forward.setNextPath("getcount.do");
	   		
	   		return forward;
 		}catch(Exception ex){
  			ex.printStackTrace();
  		}
 		return null;
	}

}
