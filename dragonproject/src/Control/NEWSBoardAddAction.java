package Control;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import Dao.MemberDao;
import Dto.MemberDto;



public class NEWSBoardAddAction implements Action {
	 public ActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception{
		
		MemberDao boarddao = new MemberDao();
	   	ActionForward forward=new ActionForward();
	   	MemberDto boarddata=new MemberDto();
	   	
		String realFolder="";
		String saveFolder="";
		realFolder=request.getRealPath(saveFolder);
		int fileSize=5*1024*1024;
   		
   		try{
   			MultipartRequest multi=null;
   			
   			multi=new MultipartRequest(request,
   					realFolder,
   					fileSize,
   					"utf-8",
   					new DefaultFileRenamePolicy());
   			
   			String contents = multi.getParameter("RELEASES_CONTENT");
   		   	
   		   	String parameter = multi.getParameter("RELEASES_DATE");
   		   	java.sql.Date reg = java.sql.Date.valueOf(parameter);
   		   	
   			String title = multi.getParameter("RELEASES_TITLE");
   			
	   		boarddata.setBOARD_FILE(
	   				multi.getFilesystemName((String)multi.getFileNames().nextElement()));
	   		
	   		boolean check = boarddao.NewsWrite(contents, reg, title, realFolder);
	   		
   			if(check == true) {
   				//게시판 등록 성공
   				request.setAttribute("result", 1);
   			}else {
   				//게시판 등록 실패 
   				request.setAttribute("result", -1);
   			}

   			forward.setRedirect(true);
	   		forward.setNextPath("news.jsp");
	   		
	   		return forward;
  		}catch(Exception ex){
   			ex.printStackTrace();
   		}
  		return null;
	}  	
}
