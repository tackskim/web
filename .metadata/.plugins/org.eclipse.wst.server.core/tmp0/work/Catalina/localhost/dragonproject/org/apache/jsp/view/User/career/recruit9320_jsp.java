/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2019-08-29 12:13:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view.User.career;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.SimpleDateFormat;
import Dao.*;
import Dto.*;

public final class recruit9320_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/view/User/career/Table3.jsp", Long.valueOf(1567016718720L));
  }

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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"ko\">\n");
      out.write("\n");
      out.write("<!-- Mirrored from www.studiodragon.net/front/kr/career/recruit?career=NE by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 22 Aug 2019 10:25:14 GMT -->\n");
      out.write("<!-- Added by HTTrack --><meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\" /><!-- /Added by HTTrack -->\n");
      out.write("<head>\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no\" />\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<meta name=\"format-detection\" content=\"telephone=no\" />\n");
      out.write("\t<meta name=\"description\" content=\"아시아의 콘텐츠와 라이프 스타일을 선도하는 Asia No.1 Studio 스튜디오 드래곤의 진행중인 채용공고입니다.\">\n");
      out.write("\t<meta name=\"keywords\" content=\"스튜디오 드래곤, CJ, CJ E&M, CJ 스튜디오 드래곤, STUDIO DRAGON, 인재채용, 채용공고, 채용정보\">\n");
      out.write("\t<title>Featured Jobs | 스튜디오 드래곤</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../../css/User/common.css\" />\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../../css/User/contents.css\" />\n");
      out.write("\t<script type=\"text/javascript\" src=\"../../../js/User/plugin/jquery-1.12.4.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"../../../js/User/plugin/jquery.dotdotdot.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"../../../js/User/plugin/skrollr.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"../../../js/User/plugin/velocity.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"../../../js/User/common_ui.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"../../../js/User/common.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\n");
      out.write("\t\t(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\n");
      out.write("\t\tm=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n");
      out.write("\t\t})(window,document,'script','../../../js/analytics.js','ga');\n");
      out.write("\t\tga('create', 'UA-97845877-1', 'auto');\n");
      out.write("\t\tga('send', 'pageview');\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"skipNav\">\n");
      out.write("\t<a href=\"#container\"><span>본문 바로가기</span></a>\n");
      out.write("</div>\n");
      out.write("<div id=\"wrap\">\n");
      out.write("\t<!-- S : header -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- S : header -->\n");
      out.write("\t<div id=\"header\" class=\"transit overflowHidden\">\n");
      out.write("\t<!-- 하위메뉴 펼침 .hopen 추가 /scroll height:453px / 1280이하일때 .hmob -->\n");
      out.write("\t\t<h1><a href=\"../main/main.jsp\" class=\"transit\">STUDIO DRAGON</a></h1>\n");
      out.write("\t\t<a href=\"javascript:void(0);\" class=\"ico-menu\"></a>\n");
      out.write("\t\t<div class=\"mobile-wrap\">\n");
      out.write("\t\t\t<div id=\"gnb\" class=\"\"><!--gng 오버했을때 class open 추가 -->\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li ><a href=\"../about/company.jsp\" class=\"menu1 transit\">ABOUT</a><!-- tablet에서 부터 선택됐을때 li에 class on 넣어줌 -->\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li  ><a href=\"../about/company.jsp\">ABOUT US</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li  ><a href=\"../about/history.jsp\">COMPANY HISTORY</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li  ><a href=\"../about/partner.jsp\">PARTNERS</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../about/contact.jsp\">CONTACT US</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li ><a href=\"../works/portfolio.jsp\" class=\"menu1 transit\">WORKS</a>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../works/portfolio.jsp\">SHOWS</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"on\"><a href=\"talent.jsp\" class=\"menu1 transit\">CAREERS</a>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"talent.jsp\">RECRUITMENT</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"on\"><a href=\"recruit.jsp\">FEATURED JOBS</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li ><a href=\"../newsroom/Releases.do\" class=\"menu1 transit\">NEWSROOM</a>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<!-- <li ><a href=\"../pr/notice.jsp\">NOTICE</a></li> -->\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../newsroom/Releases.do\">PRESS RELEASES</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"../viewercomments/ViewerListAction.do\" class=\"menu1 transit\">시청자 의견</a>\n");
      out.write("                        <ul>\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../viewercomments/ViewerListAction.do\">시청자 의견</a></li>\n");
      out.write("                        </ul> \n");
      out.write("\t\t\t\t\t<!-- <li ><a href=\"../ir/activities.jsp\" class=\"menu1 transit\">IR</a>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../ir/activities.jsp\">IR ACTIVITIES &amp; MATERIALS</a></li> -->\n");
      out.write("\t\t\t\t\t\t\t<!-- <li ><a href=\"../ir/disclosure.jsp\">DISCLOSURE</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../ir/notice.jsp\">PUBLIC NOTICE</a></li> -->\n");
      out.write("\t\t\t\t\t\t\t<!-- <li ><a href=\"../ir/stock.jsp\">STOCK INFORMATION</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../ir/finance.jsp\">FINANCIAL INFORMATION</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../ir/governance.jsp\">CORPORATE GOVERNANCE</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li> -->\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<ul class=\"language transit\">\n");
      out.write("\t\t\t\t<li class=\"on\"><a href=\"../main/main.jsp\" class=\"transit\">KOR</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"../../Admin/login.jsp\" class=\"transit\">login</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<a href=\"javascript:void(0);\" class=\"close\">닫기</a>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"dim\"></div>\n");
      out.write("\t<!-- E: header -->\n");
      out.write("\t<!-- E: header -->\n");
      out.write("\t<div class=\"visual-area career\">\n");
      out.write("\t\t<div class=\"visual-area-in\">\n");
      out.write("\t\t\t<h2>FEATURED JOBS</h2>\n");
      out.write("\t\t\t<div class=\"location\">\n");
      out.write("\t\t\t\t<p><a href=\"../main/main.jsp\"><img src=\"../../../img/User/com/ico_home.png\" alt=\"HOME\" /></a><span>CAREERS</span><span>FEATURED JOBS</span></p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"current-location\">\n");
      out.write("\t\t\t\t<p><a href=\"../main/main.jsp\"><img src=\"../../../img/User/com/ico_home_side.png\" alt=\"HOME\" /></a><span>CAREERS</span><span>FEATURED JOBS</span></p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"frame\"><span class=\"line\"></span><span class=\"edge\"></span></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- S : container -->\n");
      out.write("\t<div id=\"container\">\n");
      out.write("\t\t<div class=\"content\">\n");
      out.write("\t\t\t<div class=\"tab\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li ><a href=\"TotalRecru.do\">전체</a></li>\n");
      out.write("\t\t\t\t\t<li ><a href=\"CareerRecru.do\">경력</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"on\"><a href=\"CrunewRecru.do\">신입</a></li>\n");
      out.write("\t\t\t\t\t<li ><a href=\"InternRecru.do\">인턴</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"srchArea tabBtm\">\n");
      out.write("\t\t\t\t<form name=\"searchForm\" id=\"searchForm\" method=\"post\">\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"cpage\" id=\"cpage\" value=\"1\"/>\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"career\" id=\"career\" value=\"NE\"/>\n");
      out.write("\t\t\t\t<select title=\"구분 선택\" class=\"withTxt\" name=\"selected\" id=\"selected\">\n");
      out.write("\t\t\t\t\t<option value=\"title\" >제목</option>\n");
      out.write("\t\t\t\t\t<option value=\"contents\"  >내용</option>\n");
      out.write("\t\t\t\t</select>\n");
      out.write("\t\t\t\t<span class=\"inputSrch\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" title=\"게시글 검색\" class=\"txt\" name=\"searchTxt\" id=\"searchTxt\" value=\"\"/>\n");
      out.write("\t\t\t\t\t<input type=\"image\" src=\"../../../img/User/com/ico_input_srch.png\" alt=\"검색\" class=\"img\" onclick=\"javascript:fn_search();\"/>\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"recruitList\">\n");
      out.write("\t\t\t\t<ul id=\"dataUl\">\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
lists = (ArrayList)request.getAttribute("result");

if(lists == null) {
	System.out.println("null");
}

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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../../css/User/common.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../../js/User/plugin/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/plugin/jquery.dotdotdot.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../../js/User/plugin/skrollr.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../../js/User/plugin/velocity.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../../js/User/common_ui.js\"></script>\r\n");
      out.write("<!-- Iframe resizer -->\r\n");
      out.write("<!-- <script type=\"text/javascript\" src=\"http://totalstock.irplus.co.kr/StockUtil/iframe_rz/iframeResizer.contentWindow.min.js\"></script> -->\r\n");
      out.write("<!-- <script type=\"text/javascript\" src=\"../../../totalstock.irplus.co.kr/StockUtil/iframe_rz/jquery.iframeResizer.min.js\"></script> -->\r\n");
      out.write("<!--<script type=\"text/javascript\" src=\"http://wcs.naver.net/wcslog.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"> if(!wcs_add) var wcs_add = {}; wcs_add[\"wa\"] = \"1d20e427ddf2bf\"; wcs_do(); </script>-->\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("/* 테이블 CSS 추가 */\r\n");
      out.write("table.type10 {\r\n");
      out.write("    border-collapse: collapse;\r\n");
      out.write("    text-align: left;\r\n");
      out.write("    line-height: 1.5;\r\n");
      out.write("    border-top: 1px solid #ccc;\r\n");
      out.write("    border-bottom: 1px solid #ccc;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("    width: 80%;\r\n");
      out.write("}\r\n");
      out.write("table.type10 thead th {\r\n");
      out.write("    width: 150px;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    vertical-align: top;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    background: #2d2d2d;\r\n");
      out.write("    margin: 20px 10px;\r\n");
      out.write("}\r\n");
      out.write("table.type10 tbody th {\r\n");
      out.write("    width: 250px;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("}\r\n");
      out.write("table.type10 td {\r\n");
      out.write("    width: 500px;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    vertical-align: top;\r\n");
      out.write("}\r\n");
      out.write("table.type10 .even {\r\n");
      out.write("    background: #fdf3f5;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"skipNav\">\r\n");
      out.write("\t\t<a href=\"#container\"><span>본문 바로가기</span></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- S : header -->\r\n");
      out.write("\t<!-- E: header -->\r\n");
      out.write("\t<!-- S : container -->\r\n");
      out.write("\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<table class=\"type10\">\r\n");
      out.write("\t\t\t\t\t\t    <thead>\r\n");
      out.write("\t\t\t\t\t\t    <tr>\r\n");
      out.write("\t\t\t\t\t\t        <th scope=\"cols\">번호</th>\r\n");
      out.write("\t\t\t\t\t\t        <th scope=\"cols\">제목</th>\r\n");
      out.write("\t\t\t\t\t\t        <th scope=\"cols\">내용\t</th>\r\n");
      out.write("\t\t\t\t\t\t    </tr>\r\n");
      out.write("\t\t\t\t\t\t    </thead>\r\n");
      out.write("\t\t\t\t\t\t\t    <tbody>\r\n");
      out.write("\t\t\t\t\t\t\t    ");
 for(int i = 0; i < lists.size(); i++) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t    <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t        <th scope=\"row\">");
      out.print(i);
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t        <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        <a href=\"ViewerDtail.do?id=");
      out.print(lists.get(i).getCRUNEW_NUM() );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t");
      out.print( lists.get(i).getCRUNEW_TITLE() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t        </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t        <td>");
      out.print( lists.get(i).getCRUNEW_CONTENT() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t    </tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t <tr><td colspan=\"3\"><center><button type=\"button\"><a href=\"Add.jsp\">글쓰기</a></button></center></td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t    </tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\t \r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!-- E : container -->\r\n");
      out.write("\t\t<!-- S : footer -->\r\n");
      out.write("\t\t<!-- E : footer -->\r\n");
      out.write("\t\t<!-- 이메일 무단수집 거부 팝업 -->\r\n");
      out.write("\t\t<!-- //이메일 무단수집 거부 팝업 -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"btn-area\" id=\"btnMore\"><a href=\"javascript:fn_ajaxSearch();\" class=\"btn\">More</a></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- E : container -->\n");
      out.write("\t<script>\n");
      out.write("\t//조회\n");
      out.write("\tfunction fn_search(){\n");
      out.write("\t\tdocument.searchForm.action=\"/career/recruit?flag=1\";\n");
      out.write("\t\tdocument.searchForm.submit();\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t//조회\n");
      out.write("\tfunction fn_ajaxSearch(){\n");
      out.write("\t\t//if(Number($(\"#cpage\").val())*5 >= Number(\"\")){\n");
      out.write("\t\t//\talert(\"더이상 데이터가 없습니다.\");\n");
      out.write("\t\t//\treturn;\n");
      out.write("\t\t//}\n");
      out.write("\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\turl: \"/career/recruitAjax\",\n");
      out.write("\t\t\ttype: \"POST\",\n");
      out.write("\t\t\tdata: {\n");
      out.write("\t\t\t\t\t  \"career\" \t: \"NE\"\n");
      out.write("\t\t\t\t\t ,\"cpage\"\t: Number($(\"#cpage\").val())+1\n");
      out.write("\t\t\t\t\t ,\"selected\": \"\"\n");
      out.write("\t\t\t\t\t ,\"searchTxt\": \"\"\n");
      out.write("\t\t\t\t  },\n");
      out.write("\t\t\tdataType: \"json\",\n");
      out.write("\t\t\tsuccess: function(data){\n");
      out.write("\t\t\t\t//alert(JSON.stringify(data));\n");
      out.write("\n");
      out.write("\t\t\t\tvar innerHtml = \"\";\n");
      out.write("\t\t\t\tfor(var i=0;i<data.list.length;i++){\n");
      out.write("\t\t\t\t\tinnerHtml +='<li>';\n");
      out.write("\t\t\t\t\tinnerHtml +='<a href=\"/career/recruit_view?idx='+data.list[i].idx+'\" class=\"recruitSummary\">';\n");
      out.write("\n");
      out.write("\t\t\t\t\tinnerHtml +='<p class=\"title dot\">'+data.list[i].title+'</p>';\n");
      out.write("\n");
      out.write("\t\t\t\t\tvar dutyStr = \"\";\n");
      out.write("\t\t\t\t\tif(data.list[i].duty == 'PL'){\n");
      out.write("\t\t\t\t\t\tdutyStr = \"경영지원 - 기획/관리\";\n");
      out.write("\t\t\t\t\t}else if(data.list[i].duty == 'FI'){\n");
      out.write("\t\t\t\t\t\tdutyStr = \"경영지원 - 재무\";\n");
      out.write("\t\t\t\t\t}else if(data.list[i].duty == 'MA'){\n");
      out.write("\t\t\t\t\t\tdutyStr = \"콘텐츠 - 기획/제작\";\n");
      out.write("\t\t\t\t\t}else if(data.list[i].duty == 'AD'){\n");
      out.write("\t\t\t\t\t\tdutyStr = \"콘텐츠 - 제작지원/부가사업\";\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t\tvar careerStr = \"\";\n");
      out.write("\t\t\t\t\tif(data.list[i].career==\"NE\"){\n");
      out.write("\t\t\t\t\t\tcareerStr = \"신입\";\n");
      out.write("\t\t\t\t\t}else if(data.list[i].career==\"CA\"){\n");
      out.write("\t\t\t\t\t\tcareerStr = \"경력\";\n");
      out.write("\t\t\t\t\t}else if(data.list[i].career==\"IN\"){\n");
      out.write("\t\t\t\t\t\tcareerStr = \"인턴\";\n");
      out.write("\t\t\t\t\t}else if(data.list[i].career==\"NE/CA\"){\n");
      out.write("\t\t\t\t\t\tcareerStr = \"신입/경력\";\n");
      out.write("\t\t\t\t\t}else if(data.list[i].career==\"NE/IN\"){\n");
      out.write("\t\t\t\t\t\tcareerStr = \"신입/인턴\";\n");
      out.write("\t\t\t\t\t}else if(data.list[i].career==\"CA/IN\"){\n");
      out.write("\t\t\t\t\t\tcareerStr = \"경력/인턴\";\n");
      out.write("\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\tcareerStr = \"신입/경력/인턴\";\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t\tvar strDay = \"\";\n");
      out.write("\t\t\t\t\tvar strCls = \"\";\n");
      out.write("\t\t\t\t\tif(data.list[i].all_day==\"0\"){\n");
      out.write("\t\t\t\t\t\tif(data.list[i].dDay=='0'){\n");
      out.write("\t\t\t\t\t\t\tstrDay = \"D-Day\";\n");
      out.write("\t\t\t\t\t\t\tstrCls = \"today\";\n");
      out.write("\t\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t\tstrCls = \"\";\n");
      out.write("\t\t\t\t\t\t\tstrDay = \"D-\"+data.list[i].dDay;\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\tstrCls = \"\";\n");
      out.write("\t\t\t\t\t\tstrDay = \"상시\";\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\tvar applStr=\"\";\n");
      out.write("\t\t\t\t\tif(data.list[i].appl_start != null && data.list[i].appl_start != \"\"){\n");
      out.write("\t\t\t\t\t\tapplStr =data.list[i].appl_start+' ~ '+data.list[i].appl_end;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\tinnerHtml +='<p class=\"division\"><span class=\"career\">'+careerStr+'</span><span class=\"part\">'+dutyStr+'</span></p>';\n");
      out.write("\t\t\t\t\tinnerHtml +='<p class=\"period\">'+applStr+'</p>';\n");
      out.write("\t\t\t\t\tinnerHtml +='<p class=\"date '+strCls+'\">'+strDay+'</p>';\n");
      out.write("\n");
      out.write("\t\t\t\t\tinnerHtml +='</a>';\n");
      out.write("\t\t\t\t\tinnerHtml +='</li>';\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t$(\"#dataUl\").append(innerHtml);\n");
      out.write("\t\t\t\t$(\"#cpage\").val(Number($(\"#cpage\").val())+1);\n");
      out.write("\n");
      out.write("\t\t\t\tif( parseInt(\"\") <= (parseInt($(\"#cpage\").val())*parseInt(\"5\")) )\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"btnMore\").style.display = \"none\";\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\terror\t\t:\n");
      out.write("\t\t\t\tfunction (jqXHR, textStatus, errorThrown) {\n");
      out.write("\t\t\t\t\tisProcess = false;\n");
      out.write("\t\t\t\t\talert('오류가 발생했습니다\\n[' + textStatus + ']\\n' + errorThrown);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tif(\"\"== \"\" ||  parseInt(\"\") <= (parseInt(\"1\")*parseInt(\"5\")) )\n");
      out.write("\t\tdocument.getElementById(\"btnMore\").style.display = \"none\";\n");
      out.write("\t</script>\n");
      out.write("\t<!-- S : footer -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- S : footer -->\n");
      out.write("\t<div id=\"footer\">\n");
      out.write("\t\t<div class=\"footer-in\">\n");
      out.write("\t\t\t<div class=\"footer-top\">\n");
      out.write("\t\t\t\t<div class=\"family\"><!-- class on 추가 -->\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"sel\">Family Site<span class=\"arr\">Family Site 더보기</span></a>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"http://www.cj.net/\" target=\"_blank\">CJ 그룹</a></li><!-- 선택된 값에 class active 추가 -->\n");
      out.write("\t\t\t\t\t\t<li><a href=\"http://www.cjenm.com/\" target=\"_blank\">CJ ENM(E&M)</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"http://tvn.tving.com/\" target=\"_blank\">tvN</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"http://ocn.tving.com/\" target=\"_blank\">OCN</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"http://www.culturedepot.kr/\" target=\"_blank\">문화창고</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"http://jspictures.tv/\" target=\"_blank\">JS Pictures</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<ul class=\"footer-menu\">\n");
      out.write("\t\t\t\t\t<li><a href=\"../etc/lawNotice.jsp\">법적고지</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"javascript:void(0)\" onclick=\"ShowModalPopup(this,'popEmail');\">이메일 무단수집 거부</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"../etc/ethics.jsp\">윤리경영</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"../about/contact.jsp\">CONTACT US</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"../etc/sitemap.jsp\">사이트맵</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"footer-txt\">\n");
      out.write("\t\t\t\t<div class=\"footer-logo\"><img src=\"../../../img/User/com/footer_logo.png\" alt=\"studio dragon\" /></div>\n");
      out.write("\t\t\t\t<div class=\"txt\">\n");
      out.write("\t\t\t\t\t<p>서울특별시 마포구 매봉산로 75, 17층 스튜디오 드래곤 주식회사</p>\n");
      out.write("\t\t\t\t\t<span>FAX : +82 2-2146-0988</span>\n");
      out.write("\t\t\t\t\t<span>사업자등록번호 : 747-81-00388</span>\n");
      out.write("\t\t\t\t\t<span>대표자 : 최진희</span>\n");
      out.write("\t\t\t\t\t<span class=\"copyright\">©2017 <strong>STUDIO DRAGON Corp.</strong> All Rights Reserved.</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- E : footer -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- 이메일 무단수집 거부 팝업 -->\n");
      out.write("<div id=\"popEmail\" class=\"LayerPop\">\n");
      out.write("\t<dl class=\"popCnts\">\n");
      out.write("\t\t<dt>이메일 무단수집 거부</dt>\n");
      out.write("\t\t<dd class=\"emailNoti\">\n");
      out.write("\t\t\t<p>본 웹사이트에 게시된 이메일 주소가 전자우편 수집 프로그램이나 그 밖의 기술적 장치를 이용하여 무단으로 수집되는 것을 거부하며, 이를 위반시 정보통신망법에 의해 형사 처벌 됨을 유념하시기 바랍니다.</p>\n");
      out.write("\t\t\t<p class=\"date\">게시일 : 2017. 06. 01</p>\n");
      out.write("\t\t</dd>\n");
      out.write("\t</dl>\n");
      out.write("\t<a href=\"javascript:void(0)\" class=\"btnClose\" onclick=\"HideModalPopup('popEmail');\"><img src=\"../../../img/User/com/btn_pop_close.png\" alt=\"팝업 닫기\" /></a>\n");
      out.write("</div>\n");
      out.write("<!-- //이메일 무단수집 거부 팝업 -->\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<!-- Mirrored from www.studiodragon.net/front/kr/career/recruit?career=NE by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 22 Aug 2019 10:25:14 GMT -->\n");
      out.write("</html>\n");
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
