package Control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.*;

public class ActionFactory extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * GET ����� ��� doGet()
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * POST ����� ��� doPost()
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * ��ɾ ���� �ش� Action�� ������ �ش�.
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// �Ѿ�� Ŀ�ǵ带 �����ϴ� ����
		String requestURI = request.getRequestURI();
		int cmdIdx = requestURI.lastIndexOf("/") + 1;

		String command = requestURI.substring(cmdIdx);

		ActionForward forward = null;
		Action action = null;

		// Ŀ�ǵ忡 �ش��ϴ� �׼��� �����Ѵ�.
		try {
			// ȭ����ȯ
			if (command.equals("MainForm.do")) // ����ȭ�� �̵�
			{
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("login.jsp");
			} else if (command.equals("NextForm.do")) { // �α��� ���� ȭ�� �̵�
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("result.jsp");
			}
			// ���� ó�� �׼�
			else if (command.equals("MemberLoginAction.do")) // �α��� ó��
			{
				action = new MemberLoginAction();
				forward = action.execute(request, response);
			} else if (command.equals("MemberSignupAction.do"))// ȸ������ ���
			{
				action = new MemberSignupAction();
				forward = action.execute(request, response);
			}
			// ��û�� �Խ��� �߰�
			else if (command.equals("ViewerAddAction.do")) {
				action = new ViewerAddAction();
				forward = action.execute(request, response);
			}
			// ��°Խ��� �߰�
			else if (command.equals("ViewerAddAction.do")) {
				action = new ViewerAddAction();
				forward = action.execute(request, response);
			}
			// ���԰Խ��� �߰�
			else if (command.equals("ViewerAddAction.do")) {
				action = new ViewerAddAction();
				forward = action.execute(request, response);
			}
			// ���ϰԽ��� �߰�
			else if (command.equals("ViewerAddAction.do")) {
				action = new ViewerAddAction();
				forward = action.execute(request, response);
			}
			// ����� �Խ��� ��û�� �Խ��� ��ȸ
			else if (command.equals("ViewerListAction.do")) {
				action = new ViewerListAction();
				forward = action.execute(request, response);
			}
			// ����� �Խ��� ����Ʈ ���
			else if (command.equals("Viewercom.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("./viewer.jsp");
			}
			// ������ �Խ��� ��ȸ
			else if (command.equals("AdViewerListAction.do")) {
				action = new AdViewerListAction();
				forward = action.execute(request, response);
			}
			// ������ ������ �Խ��� ����Ʈ ���
			else if (command.equals("AdViewercom.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("./tables.jsp");
			}
			////// ���� �Խ���
			else if (command.equals("NEWSWrite.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("./news.jsp"); // ȭ��ٷκ����ֱ�
			//����,���,���� ������ �Է�
			} else if (command.equals("ARECRU.do")) {
				action = new RecruitmentAddAction1();
				forward = action.execute(request, response);

			} else if (command.equals("BRECRU.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("FinalRECRUIT.jsp"); // ������ȭ�� �����ֱ�
			} 
			/*
			 * else if (command.equals("NewRECRU.do")) { action = new
			 * RecruitmentAddAction2(); forward = action.execute(request, response); }
			 */
			else if (command.equals("getcount.do")) {
				action = new GetCount();
				forward = action.execute(request, response); // ��������� �����ֱ�

			} else if (command.equals("NEWRECRlistAction.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("tables2recrui.jsp");// ������� ���ư��� ���̺� �����ֱ�
			}
			////// ��� �Խ���
			else if (command.equals("RECRU.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("Recruitmentpush.jsp"); // ȭ��ٷκ����ֱ�
			}
			// ��û�� �ǰ� �Խ��� Ŭ�� �� ����
			else if (command.equals("ViewerDtail.do")) {
				action = new ViewDtail();
				forward = action.execute(request, response); // ����Ʈ �󼼺��� �����ֱ�
			}
			// ����� ������ ������ �̵�
			else if (command.equals("Detail.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("Detail.jsp");
			}
			// ������ �Խ��� �ǰ� �Խ��� Ŭ�� �� ����
			else if (command.equals("AdViewerDtail.do")) {
				action = new AdViewDtail();
				forward = action.execute(request, response); // ����Ʈ �󼼺��� �����ֱ�
			}
			// ������ ������ ������ �̵�
			else if (command.equals("AdDetail.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("AdViewerDetail.jsp");
			}
			// ������ ��û�� �ǰ� Ŭ�� �󼼺���
			else if (command.equals("ViewerDtail.do")) {
				action = new ViewDtail();
				forward = action.execute(request, response); // ����Ʈ �󼼺��� �����ֱ�
			}
			// ��û�� �ǰ� �Խ��� ���� �ϱ�
			else if (command.equals("ViewerEdit.do")) {
				action = new ViewDtailUp();
				forward = action.execute(request, response);
			}
			// �濵 ���� �����ϱ�
			else if (command.equals("ViewerEdit.do")) {
				action = new ViewDtailUp();
				forward = action.execute(request, response);
			}
			// ��û�� �ǰ� �Խ��� ���� �ϱ�
			else if (command.equals("ViewerDel.do")) {
				action = new ViewerDel();
				forward = action.execute(request, response);
			}
			// ��Ʈ������ ��ü ������ ��ȸ
			else if (command.equals("Portfolio.do")) {
				action = new PortfolioAll();
				forward = action.execute(request, response);
			}
			// ��Ʈ ������ ������ �̵�
			else if (command.equals("PortolioAll.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("portfolio.jsp");
			}
			// ��Ʈ ������ �濵 ������ ��ü ������ ��ȸ
			else if (command.equals("PortfolioOn.do")) {
				action = new PortfolioOn();
				forward = action.execute(request, response);
			}
			// ��Ʈ ������ �濵 ������ �̵�
			else if (command.equals("PortolioOnAll.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("portfoliob756.jsp");
			}
			// ��Ʈ ������ ���� ������ ��ü ������ ��ȸ
			else if (command.equals("PortfolioEnd.do")) {
				action = new PortfolioEnd();
				forward = action.execute(request, response);
			}
			// ��Ʈ ������ ���� ������ �̵�
			else if (command.equals("PortolioEndAll.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("portfoliof656.jsp");
			}
			// ��Ʈ ������ �۷ι� ��ü ������ ��ȸ
			else if (command.equals("PortfolioGlo.do")) {
				action = new PortfolioGlo();
				forward = action.execute(request, response);
			}
			// ��Ʈ ������ �۷ι� ������ �̵�
			else if (command.equals("PortolioGloAll.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("portfolio2849.jsp");
			}
			// ä�� ���� ��ü ��ȸ
			else if (command.equals("TotalRecru.do")) {
				action = new TotalRecru();
				forward = action.execute(request, response);
			}
			// ä�� ���� ��ü �̵�
			else if (command.equals("TotalRecruAll.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("recruit.jsp");
			}
			// ä�� ���� ��� ��ȸ
			else if (command.equals("CareerRecru.do")) {
				action = new CareerRecru();
				forward = action.execute(request, response);
			}
			// ä�� ���� ��� �̵�
			else if (command.equals("CareerRecruAll.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("recruite00d.jsp");
			}
			// ä�� ���� ���� ��ȸ
			else if (command.equals("CrunewRecru.do")) {
				action = new CrunewRecru();
				forward = action.execute(request, response);
			}
			// ä�� ���� ���� �̵�
			else if (command.equals("CrunewRecruAll.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("recruit9320.jsp");
			}
			// ä�� ���� ���� ��ȸ
			else if (command.equals("InternRecru.do")) {
				action = new InternRecru();
				forward = action.execute(request, response);
			}
			// ä�� ���� ���� �̵�
			else if (command.equals("InternRecruAll.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("recruite700.jsp");
			}
			// ���� ��ȸ
			else if (command.equals("Releases.do")) {
				action = new Releases();
				forward = action.execute(request, response);
			}
			// ���� �̵�
			else if (command.equals("ReleasesAll.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("news.jsp");
			}
			// �����߰�
			else if (command.equals("ANEWSWrite.do")) {
				action = new ANEWSInput();
				forward = action.execute(request, response);
			}
			else if (command.equals("AdNewout.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("buttons0.1.jsp");
			}
			// �����߰�
			else if (command.equals("ANEWSWriteFi.do")) {
				action = new ANEWSInputFi();
				forward = action.execute(request, response);
			}
			

			// ȭ���̵� - isRedirext() ���� ���� sendRedirect �Ǵ� forward�� ���
			// sendRedirect : ���ο� ������������ request�� response��ü�� ���Ӱ� �����ȴ�.
			// forward : ���� �������� �������� forwad�� ���� ȣ��� �������� request�� response ��ü�� ����
			if (forward != null) {
				if (forward.isRedirect()) {
					response.sendRedirect(forward.getNextPath());
				} else {
					RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getNextPath());
					dispatcher.forward(request, response);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	} // end doProcess
}
