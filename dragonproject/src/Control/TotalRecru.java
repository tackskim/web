package Control;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.MemberDao;
import Dto.*;

public class TotalRecru implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberDao boarddao = new MemberDao();
		ActionForward forward = new ActionForward();
		
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();

		lists = boarddao.TotalRecru();

		try {
			request.setAttribute("result", lists);

			forward.setRedirect(false);
			forward.setNextPath("TotalRecruAll.do");

			return forward;
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}

}
