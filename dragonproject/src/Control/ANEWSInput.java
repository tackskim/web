package Control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.MemberDao;

public class ANEWSInput implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberDao boarddao = new MemberDao();
		ActionForward forward = new ActionForward();
		
		request.setCharacterEncoding("UTF-8");

		String subject = request.getParameter("RELEASES_TITLE");
		String contents = request.getParameter("RELEASES_CONTENT");
		String Date = request.getParameter("RELEASES_DATE");
		String img = request.getParameter("img");

		boolean check = boarddao.ANEWSInput(subject, contents, Date, img);
	

		try {

			if (check == true) {
				// 게시판 등록 성공
				request.setAttribute("result", 1);

			} else {
				// 게시판 등록 실패
				request.setAttribute("result", -1);

			}

			forward.setRedirect(true);
			forward.setNextPath("AdNewout.do");

			return forward;
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}

}
