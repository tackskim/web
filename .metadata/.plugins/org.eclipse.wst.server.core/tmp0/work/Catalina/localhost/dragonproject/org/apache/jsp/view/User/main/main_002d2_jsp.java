/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2019-08-26 16:08:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view.User.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_002d2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("\r\n");
      out.write("<!-- Mirrored from www.studiodragon.net/front/kr/main/main.jsp by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 22 Aug 2019 10:25:16 GMT -->\r\n");
      out.write("<!-- Added by HTTrack --><meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\" /><!-- /Added by HTTrack -->\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no\" />\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<meta name=\"format-detection\" content=\"telephone=no\" />\r\n");
      out.write("\r\n");
      out.write("\t<meta property=\"og:title\" content=\"STUDIO DRAGON\" />\r\n");
      out.write("\t<meta property=\"og:description\" content=\"스튜디오 드래곤\" />\r\n");
      out.write("\t<meta property=\"og:url\" content=\"../../../index.jsp\" />\r\n");
      out.write("\t<meta property=\"og:image\" content=\"../../../img/User/com/link.jpg\" />\r\n");
      out.write("\r\n");
      out.write("\t<meta name=\"description\" content=\"아시아의 콘텐츠와 라이프스타일을 선도하는 트렌드 리더, 스튜디오 드래곤의 홈페이지에 오신 것을 환영합니다.\">\r\n");
      out.write("\t<meta name=\"keywords\" content=\"스튜디오 드래곤, CJ, CJ E&M, 스튜디오, 드라마, 드라마제작사, 아시아, 콘텐츠, 라이프스타일, 트렌드리더, STUDIO DRAGON, 회사소개, 사업분야, 인재채용, 직무소개, 포트폴리오, 윤리경영, IR, IR 정보, CJ 스튜디오드래곤, 사업분야, Global 드라마, 채용정보, 보도자료\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<title>스튜디오 드래곤</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../../css/User/common.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../../css/User/main.css\" />\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../../../js/User/plugin/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../../../js/User/plugin/jquery.dotdotdot.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../../../js/User/plugin/skrollr.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../../../js/User/plugin/velocity.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../../../js/User/plugin/jquery.bxslider.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../../../js/User/plugin/jquery.mobile.custom.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../../../js/User/common_ui.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../../../js/User/main.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\r\n");
      out.write("\t\t(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\r\n");
      out.write("\t\tm=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\r\n");
      out.write("\t\t})(window,document,'script','../../../js/User/analytics.js','ga');\r\n");
      out.write("\t\tga('create', 'UA-97845877-1', 'auto');\r\n");
      out.write("\t\tga('send', 'pageview');\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"skipNav\" tabindex=\"0\"><!-- 2018-08-30 : skipNav => tabindex=\"0\" 추가 -->\r\n");
      out.write("\t<a href=\"#container\"><span>본문 바로가기</span></a>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"wrap\">\r\n");
      out.write("\t<!-- S : header -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- S : header -->\r\n");
      out.write("\t<div id=\"header\" class=\"transit overflowHidden\">\r\n");
      out.write("\t<!-- 하위메뉴 펼침 .hopen 추가 /scroll height:453px / 1280이하일때 .hmob -->\r\n");
      out.write("\t\t<h1><a href=\"main.jsp\" class=\"transit\">STUDIO DRAGON</a></h1>\r\n");
      out.write("\t\t<a href=\"javascript:void(0);\" class=\"ico-menu\"></a>\r\n");
      out.write("\t\t<div class=\"mobile-wrap\">\r\n");
      out.write("\t\t\t<div id=\"gnb\" class=\"\"><!--gng 오버했을때 class open 추가 -->\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li ><a href=\"../about/company.jsp\" class=\"menu1 transit\">ABOUT</a><!-- tablet에서 부터 선택됐을때 li에 class on 넣어줌 -->\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li  ><a href=\"../about/company.jsp\">ABOUT US</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li  ><a href=\"../about/history.jsp\">COMPANY HISTORY</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li  ><a href=\"../about/partner.jsp\">PARTNERS</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../about/contact.jsp\">CONTACT US</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li ><a href=\"../works/portfolio.jsp\" class=\"menu1 transit\">WORKS</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../works/portfolio.jsp\">SHOWS</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li ><a href=\"../career/talent.jsp\" class=\"menu1 transit\">CAREERS</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../career/talent.jsp\">RECRUITMENT</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../career/recruit.jsp\">FEATURED JOBS</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li ><a href=\"../newsroom/news.jsp\" class=\"menu1 transit\">NEWSROOM</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <li ><a href=\"../pr/notice.jsp\">NOTICE</a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../newsroom/news.jsp\">PRESS RELEASES</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"../viewercomments/viewer.jsp\" class=\"menu1 transit\">시청자 의견</a>\r\n");
      out.write("                        <ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../viewercomments/viewer.jsp\">시청자 의견</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("\t\t\t\t\t<!-- <li ><a href=\"../ir/activities.jsp\" class=\"menu1 transit\">IR</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../ir/activities.jsp\">IR ACTIVITIES &amp; MATERIALS</a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <li ><a href=\"../ir/disclosure.jsp\">DISCLOSURE</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../ir/notice.jsp\">PUBLIC NOTICE</a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <li ><a href=\"../ir/stock.jsp\">STOCK INFORMATION</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../ir/finance.jsp\">FINANCIAL INFORMATION</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../ir/governance.jsp\">CORPORATE GOVERNANCE</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li> -->\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<ul class=\"language transit\">\r\n");
      out.write("\t\t\t\t<li class=\"on\"><a href=\"main.jsp\" class=\"transit\">KOR</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"../../Admin/login.html\" class=\"transit\">login</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<a href=\"javascript:void(0);\" class=\"close\">닫기</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"dim\"></div>\r\n");
      out.write("\t<!-- E: header -->\r\n");
      out.write("\t<!-- E: header -->\r\n");
      out.write("\t<!-- S : container -->\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t\t<!-- 2018-08-30 배너 추가 영역 -->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--// 2018-08-30 배너 추가 영역 -->\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"content main\">\r\n");
      out.write("\t\t\t<!-- Home -->\r\n");
      out.write("\t\t\t<div id=\"homeArea\" class=\"section\"\r\n");
      out.write("\r\n");
      out.write("\t\t\tstyle=\"background-image:url('../../../img/User/visual/437920170607140126.jpg');\"\r\n");
      out.write("\r\n");
      out.write("\t\t\t><!-- [D] 메인 비주얼 이미지 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<video muted autoplay loop id=\"homeVideo\" title=\"스튜디오 드래곤 포트폴리오 영상\">\r\n");
      out.write("\t\t\t\t\t<source src=\"http://images.studiodragon.net/upload/main/visual/vod/3740720180710145541.mp4\" type=\"video/mp4\">\r\n");
      out.write("\t\t\t\t</video>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"homeAreaIn\">\r\n");
      out.write("\t\t\t\t\t<div class=\"frame\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"topLine\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"btmLine\"></div>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"topEdge\"></p>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"btmEdge\"></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t\t<dt data-start=\"transform:scale(1);opacity:1;\" data-top-bottom=\"transform:scale(0.7);opacity:0;\">WE CREATE NEW CULTURE</dt><!-- [D] 영문 20자 / 한글 16자 내외(공백포함) -->\r\n");
      out.write("\t\t\t\t\t\t<dd data-start=\"transform:translate3d(0px, 0px, 0px);opacity:1;\" data-top-bottom=\"transform:translate3d(0px, 40px, 0px);opacity:0;\">아시아의 콘텐츠와 라이프스타일을 선도하는 트렌드 리더로서 늘 새로운 시도로 시청자들에게 보는 즐거움을 선사합니다.</dd>\r\n");
      out.write("\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<p class=\"icoScroll\">\r\n");
      out.write("\t\t\t\t\t<img src=\"../../../img/User/main/img_visual_scroll_pc.png\" alt=\"Scroll Down\" class=\"pc\" />\r\n");
      out.write("\t\t\t\t\t<img src=\"../../../img/User/main/img_visual_scroll_mo.png\" alt=\"Scroll Down\" class=\"mo\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- //Home -->\r\n");
      out.write("\t\t\t<!-- On Air -->\r\n");
      out.write("\t\t\t<div id=\"onairArea\" class=\"section\">\r\n");
      out.write("\t\t\t\t<h2 class=\"secTitle\" data-bottom=\"opacity:0;transform:translate3d(-60px, 0px, 0px);\" data-center-bottom=\"opacity:1;transform:translate3d(0px, 0px, 0px);\">ON AIR</h2>\r\n");
      out.write("\t\t\t\t<div class=\"slideWrap\">\r\n");
      out.write("\t\t\t\t\t<div class=\"frameSt\" data-bottom-top=\"opacity:0;\" data-center-top=\"opacity:1;\"><span class=\"line\"></span><span class=\"edge\"></span></div>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"../works/portfolio_viewc79e.jsp?class1=&amp;cpage=1&amp;idx=291\"><img src=\"../../../img/User/onair/4718020190607154925.jpg\" alt=\"검색어를 입력하세요 WWW 이미지\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t\t\t\t<dt>검색어를 입력하세요 WWW</dt>\r\n");
      out.write("\t\t\t\t\t\t\t\t<dd>tvN (수, 목) 오후 9:30</dd>\r\n");
      out.write("\t\t\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"../works/portfolio_view02d4.jsp?class1=&amp;cpage=1&amp;idx=294\"><img src=\"../../../img/User/onair/3447920190715102426.jpg\" alt=\"60일, 지정생존자 이미지\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t\t\t\t<dt>60일, 지정생존자</dt>\r\n");
      out.write("\t\t\t\t\t\t\t\t<dd>tvN (월, 화) 오후 9:30</dd>\r\n");
      out.write("\t\t\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"../works/portfolio_viewbd1e.jsp?class1=&amp;cpage=1&amp;idx=295\"><img src=\"../../../img/User/onair/1135420190715102607.jpg\" alt=\"호텔 델루나 이미지\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t\t\t\t<dt>호텔 델루나</dt>\r\n");
      out.write("\t\t\t\t\t\t\t\t<dd>tvN (토, 일) 오후 9:00 </dd>\r\n");
      out.write("\t\t\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"ctrlBtns\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"prev\"><span class=\"blind\">이전</span></a>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"next\"><span class=\"blind\">다음</span></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- //On Air -->\r\n");
      out.write("\t\t\t<!-- Works -->\r\n");
      out.write("\t\t\t<div id=\"worksArea\" class=\"section\">\r\n");
      out.write("\t\t\t\t<div class=\"frameSt\" data-center-top=\"opacity:0;\" data-bottom=\"opacity:1;\"><span class=\"line\"></span><span class=\"edge\"></span></div>\r\n");
      out.write("\t\t\t\t<h2 class=\"secTitle\" data-bottom=\"opacity:0;transform:translate3d(-60px, 0px, 0px);\" data-center-bottom=\"opacity:1;transform:translate3d(0px, 0px, 0px);\">WORKS</h2>\r\n");
      out.write("\t\t\t\t<div class=\"worksListWrap\">\r\n");
      out.write("\t\t\t\t\t<div class=\"leftSide\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"list01\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"../works/portfolio_view118b.jsp?class1=&amp;cpage=2&amp;idx=31\" target=\"_self\"><img src=\"../../../img/User/portfolio/9915220170607135410.jpg\" alt=\"도깨비 이미지\" /><strong class=\"worksOver\"><span>도깨비</span></strong></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>도깨비</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"list02\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"../works/portfolio_view12a2.jsp?class1=&amp;cpage=1&amp;idx=267\" target=\"_self\"><img src=\"../../../img/User/portfolio/9416420190311141258.jpg\" alt=\"왕이 된 남자 이미지\" /><strong class=\"worksOver\"><span>왕이 된 남자</span></strong></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>왕이 된 남자</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"rightSide\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"list03\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"../works/portfolio_view45b2.jsp?class1=&amp;cpage=8&amp;idx=52\" target=\"_self\"><img src=\"../../../img/User/portfolio/3938520190311141417.jpg\" alt=\"비밀의 숲 이미지\" /><strong class=\"worksOver\"><span>비밀의 숲</span></strong></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>비밀의 숲</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"list04\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"../works/portfolio_view40ee.jsp?class1=&amp;cpage=4&amp;idx=253\" target=\"_self\"><img src=\"../../../img/User/portfolio/9127520190311114533.jpg\" alt=\"미스터 션샤인 이미지\" /><strong class=\"worksOver\"><span>미스터 션샤인</span></strong></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>미스터 션샤인</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"list05\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"../works/portfolio_view51db.jsp?class1=E&amp;cpage=3&amp;idx=252\" target=\"_self\"><img src=\"../../../img/User/portfolio/4930920190311141810.jpg\" alt=\"라이프 온 마스 이미지\" /><strong class=\"worksOver\"><span>라이프 온 마스</span></strong></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>라이프 온 마스</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"btn-area\"><a href=\"../works/portfolio.jsp\" class=\"btn more\">VIEW MORE</a></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- //Works -->\r\n");
      out.write("\t\t\t<!-- issue -->\r\n");
      out.write("\t\t\t<div id=\"issueArea\" class=\"section\"  style=\"background-image:url('../../../img/User/banner/3665120170607165042.jpg')\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<a href=\"http://open.tving.com/\" target=\"_blank\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"frameSt\"><span class=\"line\"></span><span class=\"edge\"></span></div>\r\n");
      out.write("\t\t\t\t<dl class=\"txtArea\" data-bottom-top=\"opacity:0;transform:translate3d(0px, 60px, 0px);\" data-center-top=\"opacity:1;transform:translate3d(0px, 0px, 0px);\">\r\n");
      out.write("\t\t\t\t\t<dt>감독은 있는데 대본이 없다.</dt>\r\n");
      out.write("\t\t\t\t\t<dd>작가를 꿈꾸는 이들에게 열려 있는 창작 공간과 기회를 제공합니다.</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- //issue -->\r\n");
      out.write("\t\t\t<!-- News -->\r\n");
      out.write("\t\t\t<div id=\"newsArea\" class=\"section\">\r\n");
      out.write("\t\t\t\t<h2 class=\"secTitle\" data-bottom=\"opacity:0;transform:translate3d(-60px, 0px, 0px);\" data-center-bottom=\"opacity:1;transform:translate3d(0px, 0px, 0px);\">NEWS</h2>\r\n");
      out.write("\t\t\t\t<div class=\"tbl type2\">\r\n");
      out.write("\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t<caption>뉴스 목록</caption>\r\n");
      out.write("\t\t\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t<col /><col class=\"dateCell\" />\r\n");
      out.write("\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\t<tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"tl\"><a href=\"../newsroom/news/163.jsp\" class=\"txt\">tvN 토일 드라마 ‘호텔 델루나’ 자체 최고 기록으로 시청률 10% 돌파!</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"tr dateCell\">2019.08.16</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"tl\"><a href=\"../newsroom/news/162.jsp\" class=\"txt\">tvN 월화드라마 ‘60일, 지정생존자’ 시청률 자체 최고 기록, 평균 4.9%, 최고 6.4%!</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"tr dateCell\">2019.08.16</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"tl\"><a href=\"../newsroom/news/161.jsp\" class=\"txt\">tvN 새 토일드라마 <사랑의 불시착> 현빈-손예진-서지혜-김정현, 역대급 로맨스 코미디 예고!</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"tr dateCell\">2019.08.16</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"tl\"><a href=\"../newsroom/news/160.jsp\" class=\"txt\">OCN 토일 오리지널 <WATCHER(왓쳐)> 시청률 최고 6.7%까지 치솟으며 2019년 OCN 최고 시청률 기록 돌파</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"tr dateCell\">2019.08.16</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"tl\"><a href=\"../newsroom/news/159.jsp\" class=\"txt\">평균 4.2% 최고 5.2% 자체 최고 시청률로 종영! 뜨겁고 아찔하게 달려온 8주의 여정, tvN '검블유'가 남긴 것</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"tr dateCell\">2019.07.26</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"btn-area\"><a href=\"../newsroom/news.jsp\" class=\"btn more\">VIEW MORE</a></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- //News -->\r\n");
      out.write("\t\t\t<div class=\"mainSideNavi home transit\"><!-- 화면 상단일때 .home, 하단일때 .btm 추가 -->\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li class=\"on\"><a href=\"#homeArea\" class=\"transit\">HOME</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#onairArea\" class=\"transit\">ON AIR</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#worksArea\" class=\"transit\">WORKS</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#issueArea\" class=\"transit\">ISSUE</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#newsArea\" class=\"transit\">NEWS</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- E : container -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- S : footer -->\r\n");
      out.write("\t<div id=\"footer\">\r\n");
      out.write("\t\t<div class=\"footer-in\">\r\n");
      out.write("\t\t\t<div class=\"footer-top\">\r\n");
      out.write("\t\t\t\t<div class=\"family\"><!-- class on 추가 -->\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"sel\">Family Site<span class=\"arr\">Family Site 더보기</span></a>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"http://www.cj.net/\" target=\"_blank\">CJ 그룹</a></li><!-- 선택된 값에 class active 추가 -->\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"http://www.cjenm.com/\" target=\"_blank\">CJ ENM(E&M)</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"http://tvn.tving.com/\" target=\"_blank\">tvN</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"http://ocn.tving.com/\" target=\"_blank\">OCN</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"http://www.culturedepot.kr/\" target=\"_blank\">문화창고</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"http://jspictures.tv/\" target=\"_blank\">JS Pictures</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<ul class=\"footer-menu\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"../etc/lawNotice.jsp\">법적고지</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"javascript:void(0)\" onclick=\"ShowModalPopup(this,'popEmail');\">이메일 무단수집 거부</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"../etc/ethics.jsp\">윤리경영</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"../about/contact.jsp\">CONTACT US</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"../etc/sitemap.jsp\">사이트맵</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"footer-txt\">\r\n");
      out.write("\t\t\t\t<div class=\"footer-logo\"><img src=\"../../../img/User/com/footer_logo.png\" alt=\"studio dragon\" /></div>\r\n");
      out.write("\t\t\t\t<div class=\"txt\">\r\n");
      out.write("\t\t\t\t\t<p>서울특별시 마포구 매봉산로 75, 17층 스튜디오 드래곤 주식회사</p>\r\n");
      out.write("\t\t\t\t\t<span>FAX : +82 2-2146-0988</span>\r\n");
      out.write("\t\t\t\t\t<span>사업자등록번호 : 747-81-00388</span>\r\n");
      out.write("\t\t\t\t\t<span>대표자 : 최진희</span>\r\n");
      out.write("\t\t\t\t\t<span class=\"copyright\">©2017 <strong>STUDIO DRAGON Corp.</strong> All Rights Reserved.</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- E : footer -->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 이메일 무단수집 거부 팝업 -->\r\n");
      out.write("<div id=\"popEmail\" class=\"LayerPop\">\r\n");
      out.write("\t<dl class=\"popCnts\">\r\n");
      out.write("\t\t<dt>이메일 무단수집 거부</dt>\r\n");
      out.write("\t\t<dd class=\"emailNoti\">\r\n");
      out.write("\t\t\t<p>본 웹사이트에 게시된 이메일 주소가 전자우편 수집 프로그램이나 그 밖의 기술적 장치를 이용하여 무단으로 수집되는 것을 거부하며, 이를 위반시 정보통신망법에 의해 형사 처벌 됨을 유념하시기 바랍니다.</p>\r\n");
      out.write("\t\t\t<p class=\"date\">게시일 : 2017. 06. 01</p>\r\n");
      out.write("\t\t</dd>\r\n");
      out.write("\t</dl>\r\n");
      out.write("\t<a href=\"javascript:void(0)\" class=\"btnClose\" onclick=\"HideModalPopup('popEmail');\"><img src=\"../../../img/User/com/btn_pop_close.png\" alt=\"팝업 닫기\" /></a>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- //이메일 무단수집 거부 팝업 -->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<!-- Mirrored from www.studiodragon.net/front/kr/main/main.jsp by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 22 Aug 2019 10:25:16 GMT -->\r\n");
      out.write("</html>\r\n");
      out.write("\t<!-- 2018-08-30 js 추가 영역 -->\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\t\tvar dimm_count = 0;\r\n");
      out.write("\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar fnSetLayer ={\r\n");
      out.write("\t\t\t\tinit : function(){\r\n");
      out.write("\t\t\t\t\tif(dimm_count==0){\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(\"main-layer-dimm\").style.display = \"none\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tthis.ban_w = $('.main-layer-banner').width();\r\n");
      out.write("\t\t\t\t\tthis.ban_h = $('.main-layer-banner').height();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tthis.addEvent();\r\n");
      out.write("\t\t\t\t\tthis.resizePop();\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\taddEvent : function(){\r\n");
      out.write("\t\t\t\t\t$(window).resize(function(){\r\n");
      out.write("\t\t\t\t\t\t\tfnSetLayer.resizePop();\t// 화면 리사이즈 시 팝업 사이즈 조정\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tresizePop : function(){\r\n");
      out.write("\t\t\t\t\tvar win_w = $(window).width();\t\t// window가로 사이즈가 세로 사이즈보다\r\n");
      out.write("\t\t\t\t\tvar win_h = $(window).height();\r\n");
      out.write("\t\t\t\t\tif(this.ban_w > win_w){\r\n");
      out.write("\t\t\t\t\t\t$('.main-layer-banner').addClass('mobile');\r\n");
      out.write("\t\t\t\t\t}else if(this.ban_h > win_h){\r\n");
      out.write("\t\t\t\t\t\t$('.main-layer-banner').addClass('mobile');\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t$('.main-layer-banner').removeClass('mobile');\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t$('.main-layer-banner').length&&fnSetLayer.init();\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tfunction fncClose(value){\r\n");
      out.write("\t\t\tif($(\"#oneDayCheck\"+value).is(':checked')){\r\n");
      out.write("\t\t\t\tsetCookieOneDay(\"urgencyNotice\"+value, \"no\" , 1);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$('#main-popup'+value).css('display', 'none');\r\n");
      out.write("\r\n");
      out.write("\t\t\tdimm_count--;\r\n");
      out.write("\r\n");
      out.write("\t\t\tif(dimm_count == 0){\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"main-layer-dimm\").style.display = \"none\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction setCookieOneDay( name, value, expiredays ) {\r\n");
      out.write("\t\t\tvar todayDate = new Date();\r\n");
      out.write("\t\t\ttodayDate.setDate( todayDate.getDate() + expiredays );\r\n");
      out.write("\t\t\tdocument.cookie = name + \"=\" + escape( value ) + \"; path=/; expires=\" + todayDate.toGMTString() + \";\"\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction getCookie( name ) {\r\n");
      out.write("\t\t\tvar nameOfCookie = name + \"=\";\r\n");
      out.write("\t\t\tvar x = 0;\r\n");
      out.write("\t\t\twhile ( x <= document.cookie.length ) {\r\n");
      out.write("\t\t\t\tvar y = (x+nameOfCookie.length);\r\n");
      out.write("\t\t\t\tif ( document.cookie.substring( x, y ) == nameOfCookie ) {\r\n");
      out.write("\t\t\t\t\tif ( (endOfCookie=document.cookie.indexOf( \";\", y )) == -1 )\r\n");
      out.write("\t\t\t\t\t\tendOfCookie = document.cookie.length;\r\n");
      out.write("\t\t\t\t\treturn unescape( document.cookie.substring( y, endOfCookie ) );\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tx = document.cookie.indexOf( \" \", x ) + 1;\r\n");
      out.write("\t\t\t\tif ( x == 0 )\r\n");
      out.write("\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn \"\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!--// 2018-08-30 js 추가 영역 -->\r\n");
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