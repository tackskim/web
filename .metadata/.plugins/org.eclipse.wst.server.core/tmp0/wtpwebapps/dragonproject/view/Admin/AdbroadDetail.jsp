<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="Dao.*"%>
<%@ page import="Dto.*"%>

<%
ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
lists = (ArrayList)request.getAttribute("result");
%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="format-detection" content="telephone=no" />
	<meta name="description" content="아시아의 콘텐츠와 라이프 스타일을 선도하는 Asia No.1 Studio 스튜디오 드래곤의 보도자료입니다.">
	<meta name="keywords" content="스튜디오 드래곤, CJ, CJ E&M, CJ 스튜디오 드래곤, STUDIO DRAGON, 보도자료, 기사, 뉴스, 미디어">
	<title>Press Releases | 스튜디오 드래곤</title>



	<link rel="stylesheet" type="text/css" href="../../../css/User/common.css" />
	<link rel="stylesheet" type="text/css" href="../../../css/User/contents.css" />
	<script type="text/javascript" src="../../../js/User/plugin/jquery-1.12.4.min.js"></script>
	<script type="text/javascript" src="../../../js/User/plugin/jquery.dotdotdot.min.js"></script>
	<script type="text/javascript" src="../../../js/User/plugin/skrollr.min.js"></script>
	<script type="text/javascript" src="../../../js/User/plugin/velocity.min.js"></script>
	<script type="text/javascript" src="../../../js/User/common_ui.js"></script>
	<script type="text/javascript" src="../../../js/User/common.js"></script>
	<script>
		(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
		(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
		m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
		})(window,document,'script','../../../js/User/analytics.js','ga');
		ga('create', 'UA-97845877-1', 'auto');
		ga('send', 'pageview');
	</script>
</head>
<body>
<center>
		<div id="container">
			<form id="frm" name="frm" method="post">
				<table cellpadding="0" cellspacing="0">
					<tr>
						<td>제목:</td>
						<td><input name="VIEWCOMMENT_TITLE" type="text" size="10"
							maxlength="10" value="<%=lists.get(0).getINTERN_TITLE()  %>" /></td>
					</tr>
					<tr>
						<td>내용 :</td>
						<td>
							<textarea name="VIEWCOMMENT_CONTENT" cols="67" rows="15"><%=lists.get(0).getRELEASES_CONTENT() %></textarea>
						</td>
					</tr>
					<tr>
						<td>첨부파일 :</td>
						<td>
							이미지 첨부
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
</body>
</html>