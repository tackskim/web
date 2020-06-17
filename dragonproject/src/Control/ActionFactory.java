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
	 * GET 방식일 경우 doGet()
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * POST 방식일 경우 doPost()
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * 명령어에 따른 해당 Action을 지정해 준다.
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 넘어온 커맨드를 추출하는 과정
		String requestURI = request.getRequestURI();
		int cmdIdx = requestURI.lastIndexOf("/") + 1;

		String command = requestURI.substring(cmdIdx);

		ActionForward forward = null;
		Action action = null;

		// 커맨드에 해당하는 액션을 실행한다.
		try {
			// 화면전환
			if (command.equals("MainForm.do")) // 메인화면 이동
			{
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("login.jsp");
			} else if (command.equals("NextForm.do")) { // 로그인 성공 화면 이동
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("result.jsp");
			}
			// 각종 처리 액션
			else if (command.equals("MemberLoginAction.do")) // 로그인 처리
			{
				action = new MemberLoginAction();
				forward = action.execute(request, response);
			} else if (command.equals("MemberSignupAction.do"))// 회원가입 등록
			{
				action = new MemberSignupAction();
				forward = action.execute(request, response);
			}
			// 시청자 게시판 추가
			else if (command.equals("ViewerAddAction.do")) {
				action = new ViewerAddAction();
				forward = action.execute(request, response);
			}
			// 경력게시판 추가
			else if (command.equals("ViewerAddAction.do")) {
				action = new ViewerAddAction();
				forward = action.execute(request, response);
			}
			// 신입게시판 추가
			else if (command.equals("ViewerAddAction.do")) {
				action = new ViewerAddAction();
				forward = action.execute(request, response);
			}
			// 인턴게시판 추가
			else if (command.equals("ViewerAddAction.do")) {
				action = new ViewerAddAction();
				forward = action.execute(request, response);
			}
			// 사용자 게시판 시청자 게시판 조회
			else if (command.equals("ViewerListAction.do")) {
				action = new ViewerListAction();
				forward = action.execute(request, response);
			}
			// 사용자 게시판 리스트 출력
			else if (command.equals("Viewercom.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("./viewer.jsp");
			}
			// 관리자 게시판 조회
			else if (command.equals("AdViewerListAction.do")) {
				action = new AdViewerListAction();
				forward = action.execute(request, response);
			}
			// 관리자 시정차 게시판 리스트 출력
			else if (command.equals("AdViewercom.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("./tables.jsp");
			}
			////// 뉴스 게시판
			else if (command.equals("NEWSWrite.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("./news.jsp"); // 화면바로보여주기
			//신입,경력,인턴 데이터 입력
			} else if (command.equals("ARECRU.do")) {
				action = new RecruitmentAddAction1();
				forward = action.execute(request, response);

			} else if (command.equals("BRECRU.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("FinalRECRUIT.jsp"); // 마지막화면 보여주기
			} 
			/*
			 * else if (command.equals("NewRECRU.do")) { action = new
			 * RecruitmentAddAction2(); forward = action.execute(request, response); }
			 */
			else if (command.equals("getcount.do")) {
				action = new GetCount();
				forward = action.execute(request, response); // 마지막결과 보여주기

			} else if (command.equals("NEWRECRlistAction.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("tables2recrui.jsp");// 목록으로 돌아가기 테이블 보여주기
			}
			////// 경력 게시판
			else if (command.equals("RECRU.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("Recruitmentpush.jsp"); // 화면바로보여주기
			}
			// 시청자 의견 게시판 클릭 상세 보기
			else if (command.equals("ViewerDtail.do")) {
				action = new ViewDtail();
				forward = action.execute(request, response); // 리스트 상세보기 보여주기
			}
			// 사용자 디테일 페이지 이동
			else if (command.equals("Detail.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("Detail.jsp");
			}
			// 관리자 게시판 의견 게시판 클릭 상세 보기
			else if (command.equals("AdViewerDtail.do")) {
				action = new AdViewDtail();
				forward = action.execute(request, response); // 리스트 상세보기 보여주기
			}
			// 관리자 디테일 페이지 이동
			else if (command.equals("AdDetail.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("AdViewerDetail.jsp");
			}
			// 관리자 시청자 의견 클릭 상세보기
			else if (command.equals("ViewerDtail.do")) {
				action = new ViewDtail();
				forward = action.execute(request, response); // 리스트 상세보기 보여주기
			}
			// 시청자 의견 게시판 수정 하기
			else if (command.equals("ViewerEdit.do")) {
				action = new ViewDtailUp();
				forward = action.execute(request, response);
			}
			// 방영 종영 수정하기
			else if (command.equals("ViewerEdit.do")) {
				action = new ViewDtailUp();
				forward = action.execute(request, response);
			}
			// 시청자 의견 게시판 삭제 하기
			else if (command.equals("ViewerDel.do")) {
				action = new ViewerDel();
				forward = action.execute(request, response);
			}
			// 포트폴리오 전체 데이터 조회
			else if (command.equals("Portfolio.do")) {
				action = new PortfolioAll();
				forward = action.execute(request, response);
			}
			// 포트 폴리오 페이지 이동
			else if (command.equals("PortolioAll.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("portfolio.jsp");
			}
			// 포트 폴리오 방영 페이지 전체 데이터 조회
			else if (command.equals("PortfolioOn.do")) {
				action = new PortfolioOn();
				forward = action.execute(request, response);
			}
			// 포트 폴리오 방영 페이지 이동
			else if (command.equals("PortolioOnAll.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("portfoliob756.jsp");
			}
			// 포트 폴리오 종영 페이지 전체 데이터 조회
			else if (command.equals("PortfolioEnd.do")) {
				action = new PortfolioEnd();
				forward = action.execute(request, response);
			}
			// 포트 폴리오 종영 페이지 이동
			else if (command.equals("PortolioEndAll.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("portfoliof656.jsp");
			}
			// 포트 폴리오 글로벌 전체 데이터 조회
			else if (command.equals("PortfolioGlo.do")) {
				action = new PortfolioGlo();
				forward = action.execute(request, response);
			}
			// 포트 폴리오 글로벌 페이지 이동
			else if (command.equals("PortolioGloAll.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("portfolio2849.jsp");
			}
			// 채용 공고 전체 조회
			else if (command.equals("TotalRecru.do")) {
				action = new TotalRecru();
				forward = action.execute(request, response);
			}
			// 채용 공고 전체 이동
			else if (command.equals("TotalRecruAll.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("recruit.jsp");
			}
			// 채용 공고 경력 조회
			else if (command.equals("CareerRecru.do")) {
				action = new CareerRecru();
				forward = action.execute(request, response);
			}
			// 채용 공고 경력 이동
			else if (command.equals("CareerRecruAll.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("recruite00d.jsp");
			}
			// 채용 공고 신입 조회
			else if (command.equals("CrunewRecru.do")) {
				action = new CrunewRecru();
				forward = action.execute(request, response);
			}
			// 채용 공고 신입 이동
			else if (command.equals("CrunewRecruAll.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("recruit9320.jsp");
			}
			// 채용 공고 인턴 조회
			else if (command.equals("InternRecru.do")) {
				action = new InternRecru();
				forward = action.execute(request, response);
			}
			// 채용 공고 인턴 이동
			else if (command.equals("InternRecruAll.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("recruite700.jsp");
			}
			// 뉴스 조회
			else if (command.equals("Releases.do")) {
				action = new Releases();
				forward = action.execute(request, response);
			}
			// 뉴스 이동
			else if (command.equals("ReleasesAll.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("news.jsp");
			}
			// 뉴스추가
			else if (command.equals("ANEWSWrite.do")) {
				action = new ANEWSInput();
				forward = action.execute(request, response);
			}
			else if (command.equals("AdNewout.do")) {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("buttons0.1.jsp");
			}
			// 종영추가
			else if (command.equals("ANEWSWriteFi.do")) {
				action = new ANEWSInputFi();
				forward = action.execute(request, response);
			}
			

			// 화면이동 - isRedirext() 값에 따라 sendRedirect 또는 forward를 사용
			// sendRedirect : 새로운 페이지에서는 request와 response객체가 새롭게 생성된다.
			// forward : 현재 실행중인 페이지와 forwad에 의해 호출될 페이지는 request와 response 객체를 공유
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
