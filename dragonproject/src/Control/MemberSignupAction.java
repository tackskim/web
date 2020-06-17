package Control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.MemberDao;

public class MemberSignupAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
        
		request.setCharacterEncoding("UTF-8");
		
        String id = request.getParameter("UserID");
        String password = request.getParameter("UserPW");
        String name = request.getParameter("UserName");
        String Address = request.getParameter("UserAddress");
        
        MemberDao dao = MemberDao.getInstance();
        dao.signupCheck(id, password, name, Address);
       
       // 회원가입 성공후 로그인 페이지 이동
       forward.setRedirect(false);
       forward.setNextPath("login.jsp");
        
        return forward;
	}

}






