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
<link rel="stylesheet" type="text/css"
	href="../../../css/User/common.css">
<link rel="stylesheet" type="text/css"
	href="../../../css/User/contents.css">
<script type="text/javascript"
	src="../../../js/User/plugin/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="js/plugin/jquery.dotdotdot.min.js"></script>
<script type="text/javascript"
	src="../../../js/User/plugin/skrollr.min.js"></script>
<script type="text/javascript"
	src="../../../js/User/plugin/velocity.min.js"></script>
<script type="text/javascript" src="../../../js/User/common_ui.js"></script>
<!-- Iframe resizer -->
<!-- <script type="text/javascript" src="http://totalstock.irplus.co.kr/StockUtil/iframe_rz/iframeResizer.contentWindow.min.js"></script> -->
<!-- <script type="text/javascript" src="../../../totalstock.irplus.co.kr/StockUtil/iframe_rz/jquery.iframeResizer.min.js"></script> -->
<!--<script type="text/javascript" src="http://wcs.naver.net/wcslog.js"></script>
	<script type="text/javascript"> if(!wcs_add) var wcs_add = {}; wcs_add["wa"] = "1d20e427ddf2bf"; wcs_do(); </script>-->
</script>

<script>
function UpDeSubmit(index){
	
	if(index == 1){
		//수정하기 서블릿 전송
		document.frm.action="ViewerEdit.do";
	}else if(index == 2){
		//삭제하기 서블릿 전송
		document.frm.action="ViewerDel.do";
	}
	document.frm.submit();
}

</script>

</head>
<body>
	<div id="skipNav">
		<a href="#container"><span>본문 바로가기</span></a>
	</div>
	<!-- S : header -->
	<!-- E: header -->
	<!-- S : container -->
	<center>
		<div id="container">
			<form id="frm" name="frm" method="post">
				<table cellpadding="0" cellspacing="0">
					<tr>
						<td>제목:</td>
						<td><input name="VIEWCOMMENT_TITLE" type="text" size="10"
							maxlength="10" value="<%=lists.get(0).getVIEWCOMMENT_TITLE() %>" /></td>
					</tr>
					<tr>
						<td>내용 :</td>
						<td>
							<textarea name="VIEWCOMMENT_CONTENT" cols="67" rows="15"><%=lists.get(0).getVIEWCOMMENT_CONTENT() %></textarea>
						</td>
					</tr>
				</table>

				<div>
					<input type="button" onclick="UpDeSubmit(1);" class="button2" value="[수정하기]"></input>
					<a href="javascript:history.go(-1)">[뒤로]</a>
				</div>
			</form>
		</div>
		<center>
			<!-- E : container -->
			<!-- S : footer -->
			<!-- E : footer -->
			<!-- 이메일 무단수집 거부 팝업 -->
			<!-- //이메일 무단수집 거부 팝업 -->
</body>
</html>