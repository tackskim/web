/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2019-08-29 03:55:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view.User.viewercomments;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.SimpleDateFormat;
import Dao.*;
import Dto.*;

public final class Add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("Dao");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("Dto");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"format-detection\" content=\"telephone=no\">\r\n");
      out.write("<meta name=\"description\"\r\n");
      out.write("\tcontent=\"아시아의 콘텐츠와 라이프 스타일을 선도하는 Asia No.1 Studio 스튜디오 드래곤의 IR 정보, 공고 페이지입니다.\">\r\n");
      out.write("<meta name=\"keywords\"\r\n");
      out.write("\tcontent=\"스튜디오 드래곤, CJ, CJ E&amp;M, CJ 스튜디오 드래곤, STUDIO DRAGON, IR, 공고, 전자공고\">\r\n");
      out.write("<title>Public Notice | 스튜디오 드래곤</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"../../../css/User/common.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"../../../css/User/contents.css\">\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"../../../js/User/plugin/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/plugin/jquery.dotdotdot.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"../../../js/User/plugin/skrollr.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"../../../js/User/plugin/velocity.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../../js/User/common_ui.js\"></script>\r\n");
      out.write("<!-- Iframe resizer -->\r\n");
      out.write("<!-- <script type=\"text/javascript\" src=\"http://totalstock.irplus.co.kr/StockUtil/iframe_rz/iframeResizer.contentWindow.min.js\"></script> -->\r\n");
      out.write("<!-- <script type=\"text/javascript\" src=\"../../../totalstock.irplus.co.kr/StockUtil/iframe_rz/jquery.iframeResizer.min.js\"></script> -->\r\n");
      out.write("<!--<script type=\"text/javascript\" src=\"http://wcs.naver.net/wcslog.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"> if(!wcs_add) var wcs_add = {}; wcs_add[\"wa\"] = \"1d20e427ddf2bf\"; wcs_do(); </script>-->\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"skipNav\">\r\n");
      out.write("\t\t<a href=\"#container\"><span>본문 바로가기</span></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- S : header -->\r\n");
      out.write("\t<!-- E: header -->\r\n");
      out.write("\t<!-- S : container -->\r\n");
      out.write("\t<center>\r\n");
      out.write("\t\t<div id=\"container\">\r\n");
      out.write("\t\t\t<form name=\"frm\" method=\"post\" action=\"ViewerAddAction.do\">\r\n");
      out.write("\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>제목:</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input name=\"VIEWCOMMENT_TITLE\" type=\"text\" size=\"10\"\r\n");
      out.write("\t\t\t\t\t\t\tmaxlength=\"10\" value=\"\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>내용 :</td>\r\n");
      out.write("\t\t\t\t\t\t<td><textarea name=\"VIEWCOMMENT_CONTENT\" cols=\"67\" rows=\"15\"></textarea></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" onclick=\"ViewerAddAction.do\" class=\"button2\">[글쓰기]</button>\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:history.go(-1)\">[뒤로]</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<!-- E : container -->\r\n");
      out.write("\t\t\t<!-- S : footer -->\r\n");
      out.write("\t\t\t<!-- E : footer -->\r\n");
      out.write("\t\t\t<!-- 이메일 무단수집 거부 팝업 -->\r\n");
      out.write("\t\t\t<!-- //이메일 무단수집 거부 팝업 -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
