package Control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.MemberDao;

public class ViewDtailUp implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberDao boarddao = new MemberDao();
		ActionForward forward = new ActionForward();
		HttpSession session = request.getSession();
		
		request.setCharacterEncoding("UTF-8");

		String title = request.getParameter("VIEWCOMMENT_TITLE");
		String contents = request.getParameter("VIEWCOMMENT_CONTENT");
		int num = (int)session.getAttribute("num");
		
		boarddao.ViewDtailUp(title, contents, num);

		try {

			forward.setRedirect(false);
			forward.setNextPath("ViewerListAction.do");

			return forward;
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}

}
