package Control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.MemberDao;
import Dto.MemberDto;

public class ViewerAddAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberDao boarddao = new MemberDao();
		ActionForward forward = new ActionForward();
		
		request.setCharacterEncoding("UTF-8");

		String contents = request.getParameter("VIEWCOMMENT_CONTENT");

		String title = request.getParameter("VIEWCOMMENT_TITLE");

		boolean check = boarddao.ViewerWrite(contents, title);
	

		try {

			if (check == true) {
				// �Խ��� ��� ����
				request.setAttribute("result", 1);

			} else {
				// �Խ��� ��� ����
				request.setAttribute("result", -1);

			}

			forward.setRedirect(true);
			forward.setNextPath("ViewerListAction.do");

			return forward;
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}

}
