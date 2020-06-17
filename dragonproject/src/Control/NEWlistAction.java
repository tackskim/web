package Control;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.*;
import Dto.MemberDto;

public class NEWlistAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
        
	      MemberDao dao = new MemberDao();
	      ArrayList<MemberDto> lists = dao.NewComment();
	        
	      request.setAttribute("result", lists);
	      
	      forward.setRedirect(false);
	      forward.setNextPath("buttons0.1.jsp");
	        
	        return forward;

	}

}
