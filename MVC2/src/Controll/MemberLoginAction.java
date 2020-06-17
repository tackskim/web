package Controll;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.MemberDao;

public class MemberLoginAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
        HttpSession session=request.getSession();
        
        // 아이디와 비밀번호를 가져온다.
        String id = request.getParameter("userid");
        String password = request.getParameter("userpw");
        
        // DB에서 아이디, 비밀번호 확인
        MemberDao dao = MemberDao.getInstance();
        int check = dao.loginCheck(id, password);
        
        if(check == 0)    // 비밀번호 틀릴경우
        { 
               // 로그인 실패시 메시지를 request에 담는다.
               request.setAttribute("fail", "0");
               
               forward.setRedirect(false);
               forward.setNextPath("MainForm.do");
        }
        else if(check == -1) // 아이디가 없을 경우
        {
        	   // 로그인 실패시 메시지를 request에 담는다.
               request.setAttribute("fail", "-1");
 
               forward.setRedirect(false);
               forward.setNextPath("MainForm.do");
        }
        else
        {
               //로그인 성공시 세션에 아이디를 저장
               session.setAttribute("sessionID", id);
               
               // 로그인 성공후 메인화면으로 이동
               forward.setRedirect(true);
               forward.setNextPath("NextForm.do");
        }
        
        return forward;
	}

}
