<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="Dao.*"%>
<%@ page import="Dto.*"%>

<%
ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
lists = (ArrayList)request.getAttribute("result");

if(lists == null) {
	System.out.println("null");
}
%>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="format-detection" content="telephone=no">
<meta name="description"
	content="아시아의 콘텐츠와 라이프 스타일을 선도하는 Asia No.1 Studio 스튜디오 드래곤의 IR 정보, 공고 페이지입니다.">
<meta name="keywords"
	content="스튜디오 드래곤, CJ, CJ E&amp;M, CJ 스튜디오 드래곤, STUDIO DRAGON, IR, 공고, 전자공고">
<title>Public Notice | 스튜디오 드래곤</title>
<link rel="stylesheet" type="text/css" href="../../../css/User/common.css">
<script type="text/javascript" src="../../../js/User/plugin/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="js/plugin/jquery.dotdotdot.min.js"></script>
<script type="text/javascript" src="../../../js/User/plugin/skrollr.min.js"></script>
<script type="text/javascript" src="../../../js/User/plugin/velocity.min.js"></script>
<script type="text/javascript" src="../../../js/User/common_ui.js"></script>
<!-- Iframe resizer -->
<!-- <script type="text/javascript" src="http://totalstock.irplus.co.kr/StockUtil/iframe_rz/iframeResizer.contentWindow.min.js"></script> -->
<!-- <script type="text/javascript" src="../../../totalstock.irplus.co.kr/StockUtil/iframe_rz/jquery.iframeResizer.min.js"></script> -->
<!--<script type="text/javascript" src="http://wcs.naver.net/wcslog.js"></script>
	<script type="text/javascript"> if(!wcs_add) var wcs_add = {}; wcs_add["wa"] = "1d20e427ddf2bf"; wcs_do(); </script>-->
</script>

<style>
/* 테이블 CSS 추가 */
table.type10 {
    border-collapse: collapse;
    text-align: left;
    line-height: 1.5;
    border-top: 1px solid #ccc;
    border-bottom: 1px solid #ccc;
    margin: 0 auto;
    width: 80%;
}
table.type10 thead th {
    width: 150px;
    padding: 10px;
    font-weight: bold;
    vertical-align: top;
    color: #fff;
    background: #2d2d2d;
    margin: 20px 10px;
}
table.type10 tbody th {
    width: 250px;
    padding: 10px;
}
table.type10 td {
    width: 500px;
    padding: 10px;
    vertical-align: top;
}
table.type10 .even {
    background: #fdf3f5;
}
</style>

</head>
<body>
	<div id="skipNav">
		<a href="#container"><span>본문 바로가기</span></a>
	</div>
	<!-- S : header -->
	<!-- E: header -->
	<!-- S : container -->

	<div>
			
		<table class="type10">
						    <thead>
						    <tr>
						        <th scope="cols">번호</th>
						        <th scope="cols">제목</th>
						        <th scope="cols">내용	</th>
						    </tr>
						    </thead>
							    <tbody>
							    <% for(int i = 0; i < lists.size(); i++) { %>
								    <tr>
								        <th scope="row"><%=i%></th>
								        <td>
									        <a href="ViewerDtail.do?id=<%=lists.get(i).getINTERN__NUM() %>">
									        	<%= lists.get(i).getINTERN_TITLE() %>
									        </a>
								        </td>
								        <td><%= lists.get(i).getINTERN_CONTENT() %></td>
								    </tr>
								 <% } %>
								 <tr><td colspan="3"><center><button type="button"><a href="Add.jsp">글쓰기</a></button></center></td></tr>
							    </tbody>
						</table>	 
	</div>
	
		<!-- E : container -->
		<!-- S : footer -->
		<!-- E : footer -->
		<!-- 이메일 무단수집 거부 팝업 -->
		<!-- //이메일 무단수집 거부 팝업 -->
</body>
</html>