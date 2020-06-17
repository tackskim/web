package Control;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.MemberDao;

public class GetCount implements Action{

   @Override
   public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
      // TODO Auto-generated method stub
      ArrayList<Integer> countlist=new ArrayList<Integer>();
      MemberDao dao=new MemberDao();
      
      countlist=dao.count();
      HttpSession session=request.getSession();
       session.setAttribute("count", countlist);
      
       ActionForward forward=new ActionForward();
       forward.setNextPath("BRECRU.do");
       forward.setRedirect(true);
      return forward;
   }

}