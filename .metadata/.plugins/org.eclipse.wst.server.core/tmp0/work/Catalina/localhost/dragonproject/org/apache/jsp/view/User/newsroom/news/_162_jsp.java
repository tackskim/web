/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2019-08-26 23:51:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view.User.newsroom.news;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _162_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- Mirrored from www.studiodragon.net/front/kr/pr/news/162 by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 22 Aug 2019 10:25:03 GMT -->\r\n");
      out.write("<!-- Added by HTTrack --><meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\" /><!-- /Added by HTTrack -->\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no\" />\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<meta name=\"format-detection\" content=\"telephone=no\" />\r\n");
      out.write("\t<meta name=\"description\" content=\"아시아의 콘텐츠와 라이프 스타일을 선도하는 Asia No.1 Studio 스튜디오 드래곤의 보도자료입니다.\">\r\n");
      out.write("\t<meta name=\"keywords\" content=\"스튜디오 드래곤, CJ, CJ E&M, CJ 스튜디오 드래곤, STUDIO DRAGON, 보도자료, 기사, 뉴스, 미디어\">\r\n");
      out.write("\t<title>Press Releases | 스튜디오 드래곤</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../../../css/User/common.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../../../css/User/contents.css\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../../../../js/User/plugin/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../../../../js/User/plugin/jquery.dotdotdot.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../../../../js/User/plugin/skrollr.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../../../../js/User/plugin/velocity.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../../../../js/User/common_ui.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../../../../js/User/common.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\r\n");
      out.write("\t\t(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\r\n");
      out.write("\t\tm=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\r\n");
      out.write("\t\t})(window,document,'script','../../../../js/User/analytics.js','ga');\r\n");
      out.write("\t\tga('create', 'UA-97845877-1', 'auto');\r\n");
      out.write("\t\tga('send', 'pageview');\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"skipNav\">\r\n");
      out.write("\t<a href=\"#container\"><span>본문 바로가기</span></a>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"wrap\">\r\n");
      out.write("\t<!-- S : header -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- S : header -->\r\n");
      out.write("\t<div id=\"header\" class=\"transit overflowHidden\">\r\n");
      out.write("\t<!-- 하위메뉴 펼침 .hopen 추가 /scroll height:453px / 1280이하일때 .hmob -->\r\n");
      out.write("\t\t<h1><a href=\"../../main/main.jsp\" class=\"transit\">STUDIO DRAGON</a></h1>\r\n");
      out.write("\t\t<a href=\"javascript:void(0);\" class=\"ico-menu\"></a>\r\n");
      out.write("\t\t<div class=\"mobile-wrap\">\r\n");
      out.write("\t\t\t<div id=\"gnb\" class=\"\"><!--gng 오버했을때 class open 추가 -->\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li ><a href=\"../../about/company.jsp\" class=\"menu1 transit\">ABOUT</a><!-- tablet에서 부터 선택됐을때 li에 class on 넣어줌 -->\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li  ><a href=\"../../about/company.jsp\">ABOUT US</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li  ><a href=\"../../about/history.jsp\">COMPANY HISTORY</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li  ><a href=\"../../about/partner.jsp\">PARTNERS</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../../about/contact.jsp\">CONTACT US</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li ><a href=\"../../works/portfolio.jsp\" class=\"menu1 transit\">WORKS</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../../works/portfolio.jsp\">SHOWS</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li ><a href=\"../../career/talent.jsp\" class=\"menu1 transit\">CAREERS</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../../career/talent.jsp\">RECRUITMENT</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../../career/recruit.jsp\">FEATURED JOBS</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"on\"><a href=\"../news.jsp\" class=\"menu1 transit\">NEWSROOM</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <li ><a href=\"../notice.jsp\">NOTICE</a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"on\"><a href=\"../news.jsp\">PRESS RELEASES</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"../../viewercomments/viewer.jsp\" class=\"menu1 transit\">시청자 의견</a>\r\n");
      out.write("                        <ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../../viewercomments/viewer.jsp\">시청자 의견</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("\t\t\t\t\t<!-- <li ><a href=\"../../ir/activities.jsp\" class=\"menu1 transit\">IR</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../../ir/activities.jsp\">IR ACTIVITIES &amp; MATERIALS</a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <li ><a href=\"../../ir/disclosure.jsp\">DISCLOSURE</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../../ir/notice.jsp\">PUBLIC NOTICE</a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <li ><a href=\"../../ir/stock.jsp\">STOCK INFORMATION</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../../ir/finance.jsp\">FINANCIAL INFORMATION</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"../../ir/governance.jsp\">CORPORATE GOVERNANCE</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li> -->\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<ul class=\"language transit\">\r\n");
      out.write("\t\t\t\t<li class=\"on\"><a href=\"../../main/main.jsp\" class=\"transit\">KOR</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"../../../Admin/login.html\" class=\"transit\">login</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<a href=\"javascript:void(0);\" class=\"close\">닫기</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"dim\"></div>\r\n");
      out.write("\t<!-- E: header -->\r\n");
      out.write("\t<!-- E: header -->\r\n");
      out.write("\t<div class=\"visual-area works\">\r\n");
      out.write("\t\t<div class=\"visual-area-in\">\r\n");
      out.write("\t\t\t<h2>PRESS RELEASES</h2>\r\n");
      out.write("\t\t\t<div class=\"location\">\r\n");
      out.write("\t\t\t\t<p><a href=\"../../main/main.jsp\"><img src=\"../../../../img/User/com/ico_home.png\" alt=\"HOME\" /></a><span>NEWSROOM</span><span>PRESS RELEASES</span></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"current-location\">\r\n");
      out.write("\t\t\t\t<p><a href=\"../../main/main.jsp\"><img src=\"../../../../img/User/com/ico_home_side.png\" alt=\"HOME\" /></a><span>NEWSROOM</span><span>PRESS RELEASES</span></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"frame\"><span class=\"line\"></span><span class=\"edge\"></span></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- S : container -->\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t<div class=\"borad-view\">\r\n");
      out.write("\t\t\t\t<div class=\"view-tit\">\r\n");
      out.write("\t\t\t\t\t<span class=\"tit\">tvN 월화드라마 ‘60일, 지정생존자’ 시청률 자체 최고 기록, 평균 4.9%, 최고 6.4%!</span>\r\n");
      out.write("\t\t\t\t\t<span class=\"date\">2019.08.16</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"editor-wrap\">\r\n");
      out.write("\t\t\t\t\t<div class=\"editor\">\r\n");
      out.write("\t\t\t\t\t\t<!-- <img src=\"/resources/front/kr/images/temp/@img_news_view.jpg\" alt=\"관련 사진\" /><br /><br /> -->\r\n");
      out.write("\t\t\t\t\t\t<span style=\"font-size: 13.33px;\"><b><span style=\"font-size: 18pt;\"></span></b></span><p style=\"text-align: center;\"><b><span style=\"color: rgb(0, 0, 0); font-size: 18pt;\">tvN 월화드라마 ‘60일, 지정생존자’</span><br></b></p><div style=\"text-align: center;\"><span style=\"font-size: 13.33px;\"><b><span style=\"color: rgb(0, 0, 0); font-size: 18pt;\">처음으로 대통령 선거에서 이기고 싶어진 지진희,&nbsp;</span></b></span></div><div style=\"text-align: center;\"><span><b><span style=\"color: rgb(0, 0, 0); font-size: 18pt;\">일촉즉발 군부 쿠데타 막을까.</span></b></span></div><div style=\"text-align: center;\"><span style=\"font-size: 13.33px;\"><b><span style=\"color: rgb(0, 0, 0); font-size: 18pt;\">시청률 자체 최고 기록, 평균 4.9%, 최고 6.4%!</span></b></span></div><div style=\"text-align: center;\"><span><b><span style=\"font-size: 18pt;\"><br></span></b></span></div><div style=\"text-align: center;\"><span><b><span style=\"font-size: 18pt;\"><span style=\"color: rgb(255, 0, 0);\"><img src=\"../../../../img/User/editor/2019_08_16_095823.jpg\"></span><br></span></b></span></div><div style=\"text-align: center;\"><span><b><span style=\"font-size: 18pt;\"><br></span></b></span></div><div style=\"text-align: center;\"><span style=\"font-size: 13.33px;\"><b><span style=\"color: rgb(0, 0, 0); font-size: 14pt;\">- 2049 타깃 시청률 평균 2.6%, 최고 3.4% 전채널 동시간대 1위!&nbsp;</span></b></span></div><div style=\"text-align: center;\"><span style=\"font-size: 13.33px;\"><b><span style=\"color: rgb(0, 0, 0); font-size: 14pt;\">- 테러 공모자 이준혁의 죽음, 왜곡된 야망의 끝은 아름답지 못했다.</span></b></span></div><div style=\"text-align: center;\"><span style=\"font-size: 13.33px;\"><b><span style=\"color: rgb(0, 0, 0); font-size: 14pt;\">- 육군참모총장을 주축으로 한 군부 쿠데타 발발 위기,</span></b></span></div><div style=\"text-align: center;\"><span style=\"font-size: 13.33px;\"><b><span style=\"color: rgb(0, 0, 0); font-size: 14pt;\">단 2회만을 남겨두고 일촉즉발 긴장감 폭발</span></b></span></div><div style=\"text-align: center;\"><span style=\"font-size: 13.33px;\"><br></span></div><div style=\"text-align: center;\"><span style=\"font-size: 13.33px;\"><br></span></div><div align=\"left\" style=\"text-align: left;\"><span style=\"color: rgb(0, 0, 0); font-size: 13.33px;\">‘60일, 지정생존자’에서 폭풍 전야의 전운이 감돌았다. 지진희에 맞선 군이 쿠데타를 모의한 것. 비싼 수업료를 치른 역사를 가진 대한민국이 처한 위기를 지진희가 막아낼 수 있을까. 시청률 또한 최고 6.4%까지 상승하며, 자체 최고 기록을 경신했다.&nbsp;&nbsp;</span></div><span style=\"font-size: 13.33px;\"><div align=\"left\" style=\"text-align: left;\"><br></div></span><div align=\"left\" style=\"text-align: left;\"><span style=\"color: rgb(0, 0, 0); font-size: 13.33px;\">지난 13일 방송된 tvN 월화드라마 ‘60일, 지정생존자’(극본 김태희, 연출 유종선, 제작 스튜디오드래곤, DK E&amp;M) 14회는 케이블, IPTV, 위성을 통합한 유료플랫폼 시청률에서 가구 평균 4.9%, 최고 6.4%를 기록, 자체 최고 기록을 경신했다. tvN 타깃인 남녀 2049 시청률은 평균 2.6%, 최고 3.4%를 나타내며, 지상파를 포함한 전채널 동시간대 1위를 기록했다. (유료플랫폼 전국기준/ 닐슨코리아 제공)&nbsp;</span></div><span style=\"font-size: 13.33px;\"><div align=\"left\" style=\"text-align: left;\"><br></div></span><div align=\"left\" style=\"text-align: left;\"><span style=\"color: rgb(0, 0, 0); font-size: 13.33px;\">박무진(지진희)은 처음으로 대통령 선거에서 이기고 싶어졌다. 차별금지 법안 상정을 두고, “지금 시점에서 지지율이 대선 구도에 얼마나 중요한지 모르냐”며 질책하는 한주승(허준호), “차별에 찬성하고 평등에 반대하는 것이 힘의 민낯”이라며 대선 승리를 자신하는 오영석(이준혁), “차별금지법이 선거에 불리하게 작용할거란 건 팩트”라고 못 박는 차영진(손석구)까지. 이렇게 모두가 반대하는 차별금지법 정도는 문제가 되지 않는 대한민국을 만들고 싶어진 것. 그래서 이 법의 입안을 다음 정권으로 이양하기로 결정했다. 그제야 양진만(김갑수) 대통령이 왜 자신에게 정치를 모른다고 했는지 이해했고, 어느새 불편했던 구두가 익숙해졌음을 깨달았다.&nbsp;</span></div><span style=\"font-size: 13.33px;\"><div align=\"left\" style=\"text-align: left;\"><br></div></span><div align=\"left\" style=\"text-align: left;\"><span style=\"color: rgb(0, 0, 0); font-size: 13.33px;\">이에 앞서 시급하게 해결해야 할 문제는 바로 오영석을 비롯한 테러 공모자들에 관한 물증을 확보해 이들을 검거하는 것. 대선 출마 선언 기자회견을 하루 앞둔 오영석부터 막아야 했다. 육군참모총장 은희정(이기영)을 미행한 한나경(강한나)은 거사에 참여한 사람들이 비싼 양복을 맞추며 그 누구의 의심도 받지 않고 정보를 교류했던 테일러샵의 존재를 알게 됐다. 이에 위험을 무릅쓰고 테일러샵에 잠입, 금고에 보관된 테러 관련 자료를 꺼낸 순간, 태익, 즉 이경표(최영우)에게 납치됐다.&nbsp;&nbsp;</span></div><span style=\"font-size: 13.33px;\"><div align=\"left\" style=\"text-align: left;\"><br></div></span><div align=\"left\" style=\"text-align: left;\"><span style=\"color: rgb(0, 0, 0); font-size: 13.33px;\">온몸이 포박당한 채 차 안에서 깨어난 한나경. 대형 폭탄을 발견하고 가까스로 탈출했지만, 차가 있던 곳은 대형마트였다. 한나경의 입을 영원히 막아 오영석의 출마를 계획대로 진행하고, 무엇보다 언제든 테러가 일어날 수 있다는 공포를 다시 심어 자기 주장이 거세진 오영석에게 VIP의 힘을 보여주기 위해 김실장(전박찬)이 선택한 곳, 바로 사람이 많은 장소였다. 한나경은 급히 차를 몰아 한강으로 향했고, 가까스로 폭탄은 수중폭파했다. 그녀는 납치되기 전, 모든 자료를 핸드폰을 통해 미리 전송해뒀고, 이제 오영석을 검거할 일만 남았다. 하지만 기자회견 직전 이 정보를 입수한 오영석은 도주해 자취를 감췄다.&nbsp;</span></div><span style=\"font-size: 13.33px;\"><div align=\"left\" style=\"text-align: left;\"><br></div></span><div align=\"left\" style=\"text-align: left;\"><span style=\"color: rgb(0, 0, 0); font-size: 13.33px;\">그 사이 은희정을 주축으로 군부 쿠데타가 모의되고 있었다. 국군통수권자로 인정할 수 없는 박무진이 합참의장을 구금해 군을 모욕했고, 그에게 이와 같은 국정 혼란의 책임을 물어 국가 기강을 바로세우겠다는 명분을 내세워 수도방위사령부에 병력을 집결시킨 것. 다행히 이 모의에 합류한 국정원 차장 지윤배(김진근)를 미행한 정한모(김주헌)가 박무진에게 이 사실을 보고했다.&nbsp;</span></div><span style=\"font-size: 13.33px;\"><div align=\"left\" style=\"text-align: left;\"><br></div></span><div align=\"left\" style=\"text-align: left;\"><span style=\"color: rgb(0, 0, 0); font-size: 13.33px;\">쿠데타를 막기 위해 박무진이 떠올린 카드는 바로 전 합참의장 이관묵(최재성). 군의 신뢰가 두텁고, 은희정에 맞설 수 있는 유일한 사람이었다. 하지만 군의 실력 행사를 저지해달란 박무진의 요청에 이관묵의 반응은 싸늘했다. 직위 해제, 가택 구금이란 모욕은 하늘을 찌르는 자존심에 크나큰 상처를 입혔기 때문. 하지만 박무진은 그에게 당근을 주지 않았다. 되레 육군 중심 재편에 불만이 많은 공군과 해군, 그리고 비육사 출신들을 모아 국군통수권자로서 반란군을 진압할 것이라 압박했다. 박무진의 초강수는 어떤 결과를 초래할까.&nbsp;</span></div><span style=\"font-size: 13.33px;\"><div align=\"left\" style=\"text-align: left;\"><br></div></span><div align=\"left\" style=\"text-align: left;\"><span style=\"color: rgb(0, 0, 0); font-size: 13.33px;\">검거 위기에 놓이자, VIP에게 버림받은 오영석 역시 쿠데타에 합류하기 위해 집결지로 향하던 중, 한나경과 경찰들의 추적에 꼬리가 잡혔다. 모든 게 끝났다고 생각한 오영석은 투항하기로 결심했다. 하지만 그가 그렇게 추락하는 걸 볼 수 없었던 김상민(박태성) 하사. “소령님은 끝까지 영웅으로 남으셔야 합니다. 제가 지킬 겁니다”라며 오영석에게 총을 발사하고, 스스로도 목숨을 끊었다. 더 이상 이 나라에서 참혹한 희생이 일어나지 않게 하겠다며, 힘을 갖기 위해 왜곡된 선택을 했던 오영석의 야망은 그렇게 아름답지 못한 엔딩으로 막을 내렸다.&nbsp;</span></div><span style=\"font-size: 13.33px;\"><div align=\"left\" style=\"text-align: left;\"><br></div></span><div align=\"left\" style=\"text-align: left;\"><span style=\"color: rgb(0, 0, 0); font-size: 13.33px;\">오영석의 죽음이 몰고 온 충격도 가시기 전, 은희정은 박무진이 쿠데타 관련 정보를 입수한 사실을 알고, 작전을 앞당기기로 결정했다. 그리고 그때, 군복을 차려입은 이관묵이 수도방위사령부에 도착했다. 과연 박무진은 쿠데타를 막아내고 위기의 대한민국을 또다시 구할 수 있을까. 단 2회 만을 남겨두고 손에 땀을 쥐는 긴장감을 폭발시킨 ‘60일, 지정생존자’, 매주 월, 화 밤 9시30분 tvN  방송.&nbsp;</span><br></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"viewlist-section\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"javascript:fnDetail('161')\"><span>Prev</span><span>tvN 새 토일드라마 <사랑의 불시착> 현빈-손예진-서지혜-김정현, 역대급 로맨스 코미디 예고!</span><span>2019.08.16</span></a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"next\"><a href=\"javascript:fnDetail('163')\"><span>Next</span><span>tvN 토일 드라마 ‘호텔 델루나’ 자체 최고 기록으로 시청률 10% 돌파!</span><span>2019.08.16</span></a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"btn-area\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:void(0)\" onClick=\"fnList();\" class=\"btn\">목록</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- E : container -->\r\n");
      out.write("\r\n");
      out.write("\t<form name=\"frm\" id=\"frm\" method=\"post\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"selected\" value=\"\"/>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"searchTxt\" value=\"\"/>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\t<form name=\"popFrm\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\r\n");
      out.write("\tfunction fnOpen(targetURL)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.popFrm.target = \"_BLANK\";\r\n");
      out.write("\t\tif( targetURL.indexOf(\"http\") != -1 )\r\n");
      out.write("\t\t\tdocument.popFrm.action = targetURL;\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t\tdocument.popFrm.action = \"http://\"+ targetURL;\r\n");
      out.write("\t\tdocument.popFrm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction fnDetail(idx)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.frm.action = \"/dragonproject/view/User/newsroom/news/\"+idx+\".jsp\";\r\n");
      out.write("\t\tdocument.frm.target = \"\";\r\n");
      out.write("\t\tdocument.frm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction fnList()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.frm.action = \"/dragonproject/view/User/newsroom/news/\"\r\n");
      out.write("\t\tdocument.frm.target = \"\";\r\n");
      out.write("\t\tdocument.frm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!-- S : footer -->\r\n");
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
      out.write("\t\t\t\t\t<li><a href=\"../../etc/lawNotice.jsp\">법적고지</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"javascript:void(0)\" onclick=\"ShowModalPopup(this,'popEmail');\">이메일 무단수집 거부</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"../../etc/ethics.jsp\">윤리경영</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"../../about/contact.jsp\">CONTACT US</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"../../etc/sitemap.jsp\">사이트맵</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"footer-txt\">\r\n");
      out.write("\t\t\t\t<div class=\"footer-logo\"><img src=\"../../../../img/User/com/footer_logo.png\" alt=\"studio dragon\" /></div>\r\n");
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
      out.write("\t<a href=\"javascript:void(0)\" class=\"btnClose\" onclick=\"HideModalPopup('popEmail');\"><img src=\"../../../../img/User/com/btn_pop_close.png\" alt=\"팝업 닫기\" /></a>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- //이메일 무단수집 거부 팝업 -->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<!-- Mirrored from www.studiodragon.net/front/kr/pr/news/162 by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 22 Aug 2019 10:25:03 GMT -->\r\n");
      out.write("</html>\r\n");
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
