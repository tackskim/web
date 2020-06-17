package Control;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.MemberDao;
import Dto.MemberDto;

public class ViewDtail implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberDao boarddao = new MemberDao();
		ActionForward forward = new ActionForward();
		HttpSession session = request.getSession();
		
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		
		request.setCharacterEncoding("UTF-8");

		int num = Integer.parseInt(request.getParameter("num"));
		
		lists = boarddao.ViewDtail(num);

		try {
			
			session.setAttribute("num", num);
			request.setAttribute("result", lists);

			forward.setRedirect(false);
			forward.setNextPath("Detail.do");

			return forward;
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}

}
