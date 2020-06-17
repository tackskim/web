package Control;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.MemberDao;
import Dto.MemberDto;

public class AdViewerListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();

		MemberDao dao = new MemberDao();
		ArrayList<MemberDto> lists = dao.AdViewerList();

		request.setAttribute("result", lists);

		forward.setRedirect(false);
		forward.setNextPath("AdViewercom.do");

		return forward;
	}

}
