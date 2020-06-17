<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="Dao.*"%>
<%@ page import="Dto.*"%>

<%
ArrayList<PortfolioDto> lists = new ArrayList<PortfolioDto>();
lists = (ArrayList)request.getAttribute("result");
%>
    
<!DOCTYPE html>
<html lang="ko">

<!-- Mirrored from www.studiodragon.net/front/kr/works/portfolio by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 22 Aug 2019 10:24:59 GMT -->
<!-- Added by HTTrack -->
<meta http-equiv="content-type" content="text/html;charset=utf-8" />
<!-- /Added by HTTrack -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="format-detection" content="telephone=no" />
<meta property="og:title" content="STUDIO DRAGON" />
<meta property="og:description" content="스튜디오 드래곤" />
<meta property="og:url" content="../main/main/index.jsp" />
<meta property="og:image"
	content="../../../img/User/com/link.jpg" />
<meta name="description"
	content="아시아의 콘텐츠와 라이프 스타일을 선도하는 Asia No.1 Studio 스튜디오 드래곤의 웰메이드 콘텐츠를 소개합니다.">
<meta name="keywords"
	content="스튜디오 드래곤, CJ, CJ E&M, CJ 스튜디오 드래곤, STUDIO DRAGON, 드라마, 콘텐츠, 방영, 종영, 글로벌">
<title>Shows | 스튜디오 드래곤</title>


<link rel="stylesheet" type="text/css"
	href="../../../css/User/common.css" />
<link rel="stylesheet" type="text/css"
	href="../../../css/User/contents.css" />
<script type="text/javascript"
	src="../../../js/User/plugin/jquery-1.12.4.min.js"></script>
<script type="text/javascript"
	src="../../../js/User/plugin/jquery.dotdotdot.min.js"></script>
<script type="text/javascript"
	src="../../../js/User/plugin/skrollr.min.js"></script>
<script type="text/javascript"
	src="../../../js/User/plugin/velocity.min.js"></script>
<script type="text/javascript"
	src="../../../js/User/common_ui.js"></script>
<script type="text/javascript"
	src="../../../js/User/common.js"></script>
<script>
	(function(i, s, o, g, r, a, m) {
		i['GoogleAnalyticsObject'] = r;
		i[r] = i[r] || function() {
			(i[r].q = i[r].q || []).push(arguments)
		}, i[r].l = 1 * new Date();
		a = s.createElement(o), m = s.getElementsByTagName(o)[0];
		a.async = 1;
		a.src = g;
		m.parentNode.insertBefore(a, m)
	})(window, document, 'script',
			'../../../js/User/analytics.js', 'ga');
	ga('create', 'UA-97845877-1', 'auto');
	ga('send', 'pageview');
</script>
</head>
<body>
	<div id="skipNav">
		<a href="#container"><span>본문 바로가기</span></a>
	</div>
	<div id="wrap">
		<!-- S : header -->


		<!-- S : header -->
		<div id="header" class="transit overflowHidden">
			<!-- 하위메뉴 펼침 .hopen 추가 /scroll height:453px / 1280이하일때 .hmob -->
			<h1>
				<a href="../main/main.jsp" class="transit">STUDIO DRAGON</a>
			</h1>
			<a href="javascript:void(0);" class="ico-menu"></a>
			<div class="mobile-wrap">
				<div id="gnb" class="">
					<!--gng 오버했을때 class open 추가 -->
					<ul>
						<li><a href="../about/company.jsp" class="menu1 transit">ABOUT</a>
						<!-- tablet에서 부터 선택됐을때 li에 class on 넣어줌 -->
							<ul>
								<li><a href="../about/company.jsp">ABOUT US</a></li>
								<li><a href="../about/history.jsp">COMPANY HISTORY</a></li>
								<li><a href="../about/partner.jsp">PARTNERS</a></li>
								<li><a href="../about/contact.jsp">CONTACT US</a></li>
							</ul></li>
						<li class="on"><a href="Portfolio.do" class="menu1 transit">WORKS</a>
							<ul>
								<li class="on"><a href="Portfolio.do">SHOWS</a></li>
							</ul></li>
						<li><a href="../career/talent.jsp" class="menu1 transit">CAREERS</a>
							<ul>
								<li><a href="../career/talent.jsp">RECRUITMENT</a></li>
								<li><a href="../career/recruit.jsp">FEATURED JOBS</a></li>
							</ul></li>
						<li><a href="../newsroom/Releases.do" class="menu1 transit">NEWSROOM</a>
							<ul>
								<!-- <li><a href="../pr/notice.jsp">NOTICE</a></li> -->
								<li><a href="../newsroom/Releases.do">PRESS RELEASES</a></li>
							</ul></li>
						<li><a href="../viewercomments/ViewerListAction.do" class="menu1 transit">시청자 의견</a>
                            <ul>
								<li><a href="../viewercomments/ViewerListAction.do">시청자 의견</a></li>
                            </ul>
					</ul>
				</div>
				<ul class="language transit">
					<li class="on"><a href="../main/main.jsp" class="transit">KOR</a></li>
					<li><a href="../../Admin/login.jsp" class="transit">login</a></li>
				</ul>
			</div>
			<a href="javascript:void(0);" class="close">닫기</a>
		</div>
		<div class="dim"></div>
		<!-- E: header -->
		<!-- E: header -->
		<div class="visual-area works">
			<div class="visual-area-in">
				<h2>SHOWS</h2>
				<div class="location">
					<p>
						<a href="../main/main.jsp"><img
							src="../../../img/User/com/ico_home.png"
							alt="HOME" /></a><span>WORKS</span><span>SHOWS</span>
					</p>
				</div>
				<div class="current-location">
					<p>
						<a href="../main/main.jsp"><img
							src="../../../img/User/com/ico_home_side.png"
							alt="HOME" /></a><span>WORKS</span><span>SHOWS</span>
					</p>
				</div>
				<div class="frame">
					<span class="line"></span><span class="edge"></span>
				</div>
			</div>
		</div>
		<!-- S : container -->
		<div id="container">
			<div class="content">
				<div class="tab">
					<ul>
						<li class="on"><a href="Portfolio.do">전체</a></li>
						<li><a href="PortfolioOn.do">방영</a></li>
						<li><a href="PortfolioEnd.do">종영</a></li>
						<li><a href="PortfolioGlo.do">글로벌</a></li>
					</ul>
				</div>
				<ul class="portfolioList" id="dataUl">

<%for(int i = 0; i < lists.size(); i++) {%>
					<li>
					<a href="javascript:void(0)" onclick="fnView(302)">
					<img src="<%=lists.get(i).getImg() %>" class="listImg" oncontextmenu="return false;">
							<div class="dimLayer">
								<dl>
									<dt><%=lists.get(i).getTitle() %></dt>
									<dd>
										<ul>
											<li><strong>연출</strong> <span><%=lists.get(i).getProduction() %></span></li>
											<li><strong>극본</strong> <span><%=lists.get(i).getScreen() %></span></li>
											<li><strong>출연</strong> <span><%=lists.get(i).getCast() %></span></li>
										</ul>
									</dd>
								</dl>
							</div>
							<p class="tit"><%=lists.get(i).getTitle() %></p></a>
					</li>
<%} %>
				</ul>
			</div>
		</div>
		<!-- E : container -->
		<form name="form" id="form"
			action="http://www.studiodragon.net/front/kr/works/get">
			<input type="hidden" name="class1" id="class1" value="" /> <input
				type="hidden" name="cpage" id="cpage" value="" /> <input
				type="hidden" name="idx" id="idx" value="" />
		</form>
		
		<!-- S : footer -->


		<!-- S : footer -->
		<div id="footer">
			<div class="footer-in">
				<div class="footer-top">
					<div class="family">
						<!-- class on 추가 -->
						<a href="#" class="sel">Family Site<span class="arr">Family
								Site 더보기</span></a>
						<ul>
							<li class="active"><a href="http://www.cj.net/"
								target="_blank">CJ 그룹</a></li>
							<!-- 선택된 값에 class active 추가 -->
							<li><a href="http://www.cjenm.com/" target="_blank">CJ
									ENM(E&M)</a></li>
							<li><a href="http://tvn.tving.com/" target="_blank">tvN</a></li>
							<li><a href="http://ocn.tving.com/" target="_blank">OCN</a></li>
							<li><a href="http://www.culturedepot.kr/" target="_blank">문화창고</a></li>
							<li><a href="http://jspictures.tv/" target="_blank">JS
									Pictures</a></li>
						</ul>
					</div>
					<ul class="footer-menu">
						<li><a href="../etc/lawNotice.jsp">법적고지</a></li>
						<li><a href="javascript:void(0)"
							onclick="ShowModalPopup(this,'popEmail');">이메일 무단수집 거부</a></li>
						<li><a href="../etc/ethics.jsp">윤리경영</a></li>
						<li><a href="../about/contact.jsp">CONTACT US</a></li>
						<li><a href="../etc/sitemap.jsp">사이트맵</a></li>
					</ul>
				</div>
				<div class="footer-txt">
					<div class="footer-logo">
						<img src="../../../img/User/com/footer_logo.png"
							alt="studio dragon" />
					</div>
					<div class="txt">
						<p>서울특별시 마포구 매봉산로 75, 17층 스튜디오 드래곤 주식회사</p>
						<span>FAX : +82 2-2146-0988</span> <span>사업자등록번호 :
							747-81-00388</span> <span>대표자 : 최진희</span> <span class="copyright">©2017
							<strong>STUDIO DRAGON Corp.</strong> All Rights Reserved.
						</span>
					</div>
				</div>
			</div>
		</div>
		<!-- E : footer -->
	</div>

	<!-- 이메일 무단수집 거부 팝업 -->
	<div id="popEmail" class="LayerPop">
		<dl class="popCnts">
			<dt>이메일 무단수집 거부</dt>
			<dd class="emailNoti">
				<p>본 웹사이트에 게시된 이메일 주소가 전자우편 수집 프로그램이나 그 밖의 기술적 장치를 이용하여 무단으로
					수집되는 것을 거부하며, 이를 위반시 정보통신망법에 의해 형사 처벌 됨을 유념하시기 바랍니다.</p>
				<p class="date">게시일 : 2017. 06. 01</p>
			</dd>
		</dl>
		<a href="javascript:void(0)" class="btnClose"
			onclick="HideModalPopup('popEmail');"><img
			src="../../../img/User/com/btn_pop_close.png"
			alt="팝업 닫기" /></a>
	</div>
	<!-- //이메일 무단수집 거부 팝업 -->
</body>

<!-- Mirrored from www.studiodragon.net/front/kr/works/portfolio by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 22 Aug 2019 10:24:59 GMT -->
</html>
