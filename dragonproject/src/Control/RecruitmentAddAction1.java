package Control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.MemberDao;
import Dto.MemberDto;

public class RecruitmentAddAction1 implements Action { // 채용공고 경력

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");

		MemberDao boarddao = new MemberDao();
		ActionForward forward = new ActionForward();

		String contents = request.getParameter("CAREER_CONTENT");

		String title = request.getParameter("CAREER_TITLE");
		String reg = request.getParameter("reg");
		//경력
		if (reg.equals("1")) {

			boolean check = boarddao.NewsWrite(contents, title, reg);

			try {

				if (check == true) {
					// 게시판 등록 성공
					request.setAttribute("result", 1);

				} else {
					// 게시판 등록 실패
					request.setAttribute("result", -1);

				}

				forward.setRedirect(true);
				forward.setNextPath("getcount.do");

				return forward;
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		//신입
		if (reg.equals("2")) {

			boolean check = boarddao.NewsWrite2(contents, title, reg);

			try {

				if (check == true) {
					// 게시판 등록 성공
					request.setAttribute("result", 1);

				} else {
					// 게시판 등록 실패
					request.setAttribute("result", -1);

				}

				forward.setRedirect(true);
				forward.setNextPath("getcount.do");

				return forward;
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		//인턴
		if (reg.equals("3")) {

			boolean check = boarddao.NewsWrite3(contents, title, reg);

			try {

				if (check == true) {
					// 게시판 등록 성공
					request.setAttribute("result", 1);

				} else {
					// 게시판 등록 실패
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
