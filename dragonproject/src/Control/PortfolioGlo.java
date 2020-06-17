package Control;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.MemberDao;
import Dto.PortfolioDto;

public class PortfolioGlo implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberDao boarddao = new MemberDao();
		ActionForward forward = new ActionForward();
		
		ArrayList<PortfolioDto> lists = new ArrayList<PortfolioDto>();

		lists = boarddao.PortfolioGlo();

		try {
			request.setAttribute("result", lists);

			forward.setRedirect(false);
			forward.setNextPath("PortolioGloAll.do");

			return forward;
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}

}
