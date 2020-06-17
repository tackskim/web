package Control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.*;
import Dto.*;

public class MemberLoginAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
        HttpSession session=request.getSession();
        
        // 아이디와 비밀번호를 가져온다.
        String id = request.getParameter("exampleInputEmail");
        String password = request.getParameter("exampleInputPassword");
        
        // DB에서 아이디, 비밀번호 확인
        MemberDao dao = MemberDao.getInstance();
        String check = dao.loginCheck(id, password);
        
        if(check.equals("F"))    // 계정이 없을 경우
        { 
               // 로그인 실패시 메시지를 request에 담는다.
               request.setAttribute("fail", "0");
               
               forward.setRedirect(false);
               forward.setNextPath("MainForm.do");
        }
        else if(check.equals("A")) // 사용자 계정 로그인
        {
        	   //로그인 성공시 세션에 아이디를 저장
        	   session.setAttribute("sessionID", id);
 
        	   // 로그인 성공후 사용자 페이지 이동
               forward.setRedirect(true);
               forward.setNextPath("index.jsp");
        }
        else //관리자 계정 로그인
        {
               //로그인 성공시 세션에 아이디를 저장
               session.setAttribute("sessionID", id);
               
               // 로그인 성공후 관리자 페이지 이동
               forward.setRedirect(true);
               forward.setNextPath("../User/main/main.jsp");
        }
        
        return forward;
	}

}
