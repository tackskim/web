package Control;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.MemberDao;
import Dto.MemberDto;

public class CrunewRecru implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberDao boarddao = new MemberDao();
		ActionForward forward = new ActionForward();
		
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();

		lists = boarddao.CrunewRecru();

		try {
			request.setAttribute("result", lists);

			forward.setRedirect(false);
			forward.setNextPath("CrunewRecruAll.do");

			return forward;
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}

}
