package Control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.MemberDao;

public class ViewerDel implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberDao boarddao = new MemberDao();
		ActionForward forward = new ActionForward();
		HttpSession session = request.getSession();
		
		request.setCharacterEncoding("UTF-8");

		int num = (int)session.getAttribute("num");
		
		boarddao.ViewDtailDel(num);

		try {

			forward.setRedirect(false);
			forward.setNextPath("AdViewerListAction.do");

			return forward;
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}

}
