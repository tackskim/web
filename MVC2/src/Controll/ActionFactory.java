package Controll;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionFactory extends HttpServlet{
	 private static final long serialVersionUID = 1L;
	 
	    /**
	     * GET ����� ��� doGet()
	     */
	    public void doGet(HttpServletRequest request, HttpServletResponse response) 
	            throws ServletException, IOException {
	            doProcess(request,response);
	    }      
	        
	    /**
	     * POST ����� ��� doPost()
	     */
	    public void doPost(HttpServletRequest request, HttpServletResponse response) 
	            throws ServletException, IOException {
	            doProcess(request,response);
	    }                          
	        
	    /**
	     * ��ɾ ���� �ش� Action�� ������ �ش�.
	     * @param request
	     * @param response
	     * @throws ServletException
	     * @throws IOException
	     */
	    public void doProcess(HttpServletRequest request, HttpServletResponse response) 
	             throws ServletException, IOException { 
	        
	        // �Ѿ�� Ŀ�ǵ带 �����ϴ� ����
	        String requestURI = request.getRequestURI();
	        int cmdIdx = requestURI.lastIndexOf("/")+1;
	        
	        String command = requestURI.substring(cmdIdx);
	        
	        ActionForward forward = null;
	        Action action = null;
	        
	        // Ŀ�ǵ忡 �ش��ϴ� �׼��� �����Ѵ�.
	        try {
	            // ȭ����ȯ
	            if(command.equals("MainForm.do")) // ����ȭ�� �̵�
	            {
	                forward=new ActionForward();
	                forward.setRedirect(false);
	                forward.setNextPath("index.jsp");
	            }else if(command.equals("NextForm.do")) { //�α��� ���� ȭ�� �̵�
	            	 forward=new ActionForward();
		             forward.setRedirect(false);
		             forward.setNextPath("result.jsp");
	            }// ���� ó�� �׼�
	            else if(command.equals("MemberLoginAction.do")) // �α��� ó��
	            {
	                action = new MemberLoginAction();
	                forward = action.execute(request, response);
	            }

	            // ȭ���̵� - isRedirext() ���� ���� sendRedirect �Ǵ� forward�� ���
	            // sendRedirect : ���ο� ������������ request�� response��ü�� ���Ӱ� �����ȴ�.
	            // forward : ���� �������� �������� forwad�� ���� ȣ��� �������� request�� response ��ü�� ����
	            if(forward != null){
	                if (forward.isRedirect()) {
	                    response.sendRedirect(forward.getNextPath());
	                } else {
	                    RequestDispatcher dispatcher = request
	                            .getRequestDispatcher(forward.getNextPath());
	                    dispatcher.forward(request, response);
	                }
	            }
	 
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    } // end doProcess
}
