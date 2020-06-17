
package Control;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.MemberDao;
import Dto.MemberDto;

public class Getview implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		  ArrayList<MemberDto> viewlist = new ArrayList<MemberDto>();
		MemberDao dao=new MemberDao();
		
		viewlist=dao.list();
		HttpSession session=request.getSession();
		 session.setAttribute("view", viewlist);
		
		 ActionForward forward=new ActionForward();
		 forward.setNextPath("BNEWSWrite.do");
		 forward.setRedirect(true);
		return forward;
	}

}
