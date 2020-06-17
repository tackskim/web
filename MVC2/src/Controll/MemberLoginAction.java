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
        
        // ���̵�� ��й�ȣ�� �����´�.
        String id = request.getParameter("userid");
        String password = request.getParameter("userpw");
        
        // DB���� ���̵�, ��й�ȣ Ȯ��
        MemberDao dao = MemberDao.getInstance();
        int check = dao.loginCheck(id, password);
        
        if(check == 0)    // ��й�ȣ Ʋ�����
        { 
               // �α��� ���н� �޽����� request�� ��´�.
               request.setAttribute("fail", "0");
               
               forward.setRedirect(false);
               forward.setNextPath("MainForm.do");
        }
        else if(check == -1) // ���̵� ���� ���
        {
        	   // �α��� ���н� �޽����� request�� ��´�.
               request.setAttribute("fail", "-1");
 
               forward.setRedirect(false);
               forward.setNextPath("MainForm.do");
        }
        else
        {
               //�α��� ������ ���ǿ� ���̵� ����
               session.setAttribute("sessionID", id);
               
               // �α��� ������ ����ȭ������ �̵�
               forward.setRedirect(true);
               forward.setNextPath("NextForm.do");
        }
        
        return forward;
	}

}
