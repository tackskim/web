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
        
        // ���̵�� ��й�ȣ�� �����´�.
        String id = request.getParameter("exampleInputEmail");
        String password = request.getParameter("exampleInputPassword");
        
        // DB���� ���̵�, ��й�ȣ Ȯ��
        MemberDao dao = MemberDao.getInstance();
        String check = dao.loginCheck(id, password);
        
        if(check.equals("F"))    // ������ ���� ���
        { 
               // �α��� ���н� �޽����� request�� ��´�.
               request.setAttribute("fail", "0");
               
               forward.setRedirect(false);
               forward.setNextPath("MainForm.do");
        }
        else if(check.equals("A")) // ����� ���� �α���
        {
        	   //�α��� ������ ���ǿ� ���̵� ����
        	   session.setAttribute("sessionID", id);
 
        	   // �α��� ������ ����� ������ �̵�
               forward.setRedirect(true);
               forward.setNextPath("index.jsp");
        }
        else //������ ���� �α���
        {
               //�α��� ������ ���ǿ� ���̵� ����
               session.setAttribute("sessionID", id);
               
               // �α��� ������ ������ ������ �̵�
               forward.setRedirect(true);
               forward.setNextPath("../User/main/main.jsp");
        }
        
        return forward;
	}

}
