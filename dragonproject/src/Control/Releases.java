package Control;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.MemberDao;
import Dto.MemberDto;

public class Releases implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		MemberDao boarddao = new MemberDao();
		ActionForward forward = new ActionForward();
		
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();

		lists = boarddao.Releases();

		try {
			request.setAttribute("result", lists);

			forward.setRedirect(false);
			forward.setNextPath("ReleasesAll.do");

			return forward;
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}

}
