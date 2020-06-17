package Control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.MemberDao;
import Dto.MemberDto;

public class RecruitmentAddAction1 implements Action { // ä����� ���

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");

		MemberDao boarddao = new MemberDao();
		ActionForward forward = new ActionForward();

		String contents = request.getParameter("CAREER_CONTENT");

		String title = request.getParameter("CAREER_TITLE");
		String reg = request.getParameter("reg");
		//���
		if (reg.equals("1")) {

			boolean check = boarddao.NewsWrite(contents, title, reg);

			try {

				if (check == true) {
					// �Խ��� ��� ����
					request.setAttribute("result", 1);

				} else {
					// �Խ��� ��� ����
					request.setAttribute("result", -1);

				}

				forward.setRedirect(true);
				forward.setNextPath("getcount.do");

				return forward;
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		//����
		if (reg.equals("2")) {

			boolean check = boarddao.NewsWrite2(contents, title, reg);

			try {

				if (check == true) {
					// �Խ��� ��� ����
					request.setAttribute("result", 1);

				} else {
					// �Խ��� ��� ����
					request.setAttribute("result", -1);

				}

				forward.setRedirect(true);
				forward.setNextPath("getcount.do");

				return forward;
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		//����
		if (reg.equals("3")) {

			boolean check = boarddao.NewsWrite3(contents, title, reg);

			try {

				if (check == true) {
					// �Խ��� ��� ����
					request.setAttribute("result", 1);

				} else {
					// �Խ��� ��� ����
					request.setAttribute("result", -1);

				}

				forward.setRedirect(true);
				forward.setNextPath("getcount.do");

				return forward;
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		
		return null;
	}

}
