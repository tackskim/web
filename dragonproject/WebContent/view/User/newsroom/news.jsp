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
<html lang="ko">

<!-- Mirrored from www.studiodragon.net/front/kr/pr/news by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 22 Aug 2019 10:25:00 GMT -->
<!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=utf-8" /><!-- /Added by HTTrack -->
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
<div id="skipNav">
	<a href="#container"><span>본문 바로가기</span></a>
</div>
<div id="wrap">
	<!-- S : header -->

	<!-- S : header -->
	<div id="header" class="transit overflowHidden">
	<!-- 하위메뉴 펼침 .hopen 추가 /scroll height:453px / 1280이하일때 .hmob -->
		<h1><a href="../main/main.jsp" class="transit">STUDIO DRAGON</a></h1>
		<a href="javascript:void(0);" class="ico-menu"></a>
		<div class="mobile-wrap">
			<div id="gnb" class=""><!--gng 오버했을때 class open 추가 -->
				<ul>
					<li ><a href="../about/company.jsp" class="menu1 transit">ABOUT</a><!-- tablet에서 부터 선택됐을때 li에 class on 넣어줌 -->
						<ul>
							<li  ><a href="../about/company.jsp">ABOUT US</a></li>
							<li  ><a href="../about/history.jsp">COMPANY HISTORY</a></li>
							<li  ><a href="../about/partner.jsp">PARTNERS</a></li>
							<li ><a href="../about/contact.jsp">CONTACT US</a></li>
						</ul>
					</li>
					<li ><a href="../works/portfolio.jsp" class="menu1 transit">WORKS</a>
						<ul>
							<li ><a href="../works/portfolio.jsp">SHOWS</a></li>
						</ul>
					</li>
					<li ><a href="../career/talent.jsp" class="menu1 transit">CAREERS</a>
						<ul>
							<li ><a href="../career/talent.jsp">RECRUITMENT</a></li>
							<li ><a href="../career/recruit.jsp">FEATURED JOBS</a></li>
						</ul>
					</li>
					<li class="on"><a href="Releases.do" class="menu1 transit">NEWSROOM</a>
						<ul>
							<!-- <li ><a href="notice.jsp">NOTICE</a></li> -->
							<li class="on"><a href="Releases.do">PRESS RELEASES</a></li>
						</ul>
					</li>
					<li><a href="../viewercomments/ViewerListAction.do" class="menu1 transit">시청자 의견</a>
                        <ul>
							<li ><a href="../viewercomments/ViewerListAction.do">시청자 의견</a></li>
                        </ul>
					<!-- <li ><a href="../ir/activities.jsp" class="menu1 transit">IR</a>
						<ul>
							<li ><a href="../ir/activities.jsp">IR ACTIVITIES &amp; MATERIALS</a></li> -->
							<!-- <li ><a href="../ir/disclosure.jsp">DISCLOSURE</a></li>
							<li ><a href="../ir/notice.jsp">PUBLIC NOTICE</a></li> -->
							<!-- <li ><a href="../ir/stock.jsp">STOCK INFORMATION</a></li>
							<li ><a href="../ir/finance.jsp">FINANCIAL INFORMATION</a></li>
							<li ><a href="../ir/governance.jsp">CORPORATE GOVERNANCE</a></li>
						</ul>
					</li> -->
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
	<div class="visual-area pr">
		<div class="visual-area-in">
			<h2>PRESS RELEASES</h2>
			<div class="location">
				<p><a href="../main/main.jsp"><img src="../../../img/User/com/ico_home.png" alt="HOME" /></a><span>NEWSROOM</span><span>PRESS RELEASES</span></p>
			</div>
			<div class="current-location">
				<p><a href="../main/main.jsp"><img src="../../../img/User/com/ico_home_side.png" alt="HOME" /></a><span>NEWSROOM</span><span>PRESS RELEASES</span></p>
			</div>
			<div class="frame"><span class="line"></span><span class="edge"></span></div>
		</div>
	</div>

	<!-- S : container -->
	<div id="container">
		<div class="content">
			<div class="srchArea">
				<select title="Select box" class="withTxt" id="selected">
					<option value="" selected="selected">전체</option>
					<option value="T">제목</option>
					<option value="C">내용</option>
				</select>
				<span class="inputSrch">
					<input type="text" title="Enter search word" class="txt" id="searchTxt" OnKeyDown="f_fnSearch();"/>
					<input type="image" onClick="fnSearch_r()" src="../../../img/User/com/ico_input_srch.png" alt="Search" class="img" />
				</span>
			</div>
			<ul class="newsList" id="data">

				<%for(int i = 0; i < lists.size(); i++) {%>
				
				<li>
					<a href="javascript:void(0);" onclick="fnDetail('163');">
						<dl>
							<dt class="dot"><%=lists.get(i).getRELEASES_TITLE() %></dt>
							<dd>
								<p class="txt dot"><%=lists.get(i).getRELEASES_CONTENT() %></p>
								<p class="date"><%= lists.get(i).getRELEASES_DAY() %></p>
							</dd>
						</dl>
						<div class="imgZone"><img src="<%= lists.get(i).getRELEASES_IMG() %>" alt="tvN 토일 드라마 ‘호텔 델루나’ 자체 최고 기록으로 시청률 10% 돌파! 썸네일 이미지" /></div><!-- 썸네일 이미지 사이즈 499*296 -->
					</a>
				</li>
				<%} %>



				<li>
					<a href="javascript:void(0);" onclick="fnDetail('163');">
						<dl>
							<dt class="dot">tvN 토일 드라마 ‘호텔 델루나’ 자체 최고 기록으로 시청률 10% 돌파!</dt>
							<dd>
								<p class="txt dot">tvN 토일 드라마 ‘호텔 델루나’ 자체 최고 기록으로 시청률 10% 돌파!이지은(아이유)X여진구, 드디어 마음 맞닿았다!유료 플랫폼 가구 평균 10% 최고 10.8%케이블-종편 동시간대 1위-  2049 타깃 시청률도 자체 최고! 평균 8.5% 최고 9.2%로10회 연속 지상파 포함 전채널 동시간대 1위!-  애틋한 포옹과 함께 월령수에 만개한 꽃, 그 꽃이 지면 이지은 떠나게 될까? 비극적 운명 암시에 불안감 증폭!tvN ‘호텔 델루나’ 이지은과 여진구가 쌍방 로맨스의 시작을 알렸다. 애틋한 포옹과 함께 월령수엔 꽃이 피어났지만, 동시에 꽃은 언젠가 진다는 불안감으로 안방극장을 잠 못 이루게 했다. 시청률도 만개했다. 자체 최고 기록으로 드디어 10% 고지를 넘어선 것. <o:p></o:p>지난 11일 방송된 tvN 토일드라마 ‘호텔 델루나’(극본 홍정은, 홍미란 / 연출 오충환, 김정현 / 제작 스튜디오드래곤, 지티스트) 10회는 케이블, IPTV, 위성을 통합한 유료플랫폼 시청률에서 가구 평균 10%, 최고 10.8%로, 또다시 자체 최고 기록을 경신하며 케이블, 종편 포함 동시간대 1위를 차지했다. 뿐만 아니라 tvN 타깃인 남녀 2049 시청률 역시 평균 8.5%, 최고 9.2%로 자체 최고 기록을 경신했고, 10회 연속 지상파 포함 전 채널에서 동시간대 1위를 차지했다. (유료플랫폼 전국기준/ 닐슨코리아 제공) <o:p></o:p>이날 방송에서는 솔직한 고백과 따뜻한 위로로 한 뼘 더 가까워진 장만월(이지은)과 구찬성(여진구)의 이야기가 그려졌다. 찬성이 그녀를 들여다봤듯이, 그녀 역시 찬성의 두려움을 봤다. 귀안(鬼眼)을 닫을 수 있는 약은 곧 찬성의 두려움을 없앨 수 있는 약이었다. 만월과 델루나를 보지 못한다면 더이상 그녀가 악귀가 돼 재로 소멸되는 것도 보지 않을 수 있기 때문. 하지만 찬성은 도망치지 않고 만월을 선택했다.  “당신이 그렇게 되는 건 안 됩니다. 그러니까 나는 계속 당신 옆에서 당신을 지켜 볼 겁니다”라며 그녀를 계속 돌보겠다고 한 것.  <o:p></o:p>그런 그를 밀어내다가도 죽은 회장님(남경읍)이 꿈을 통해 성사시킨 ‘좋은 청년’ 찬성과 손녀(설리)와의 중매 때문에 질투심이 타오르는 마음을 숨기지 못한 만월. 그녀의 마음을 아는 듯 찬성의 행동은 온통 만월을 향해 있었다. 그러나 잔인한 운명의 장난은 계속됐다. 그가 약을 먹지 않았기 때문에 끊어졌던 인연을 보게 된 것. 바로 찬성의 엄마였다. 한 귀신으로부터 책 안에 있는 걸 없애 달라는 부탁을 받은 찬성은 책 속에서 자신의 어릴 적 사진을 발견했다. 책에 붙은 귀신은 그의 엄마였고 자신은 숨겨진 과거였다. <o:p></o:p>“내 가족들이 알면 안 돼요. 그걸 없애 주세요”라는 귀신 앞에 아무 말도 하지 못한 찬성. 귀안을 뜬 자의 부작용이었고, 그에겐 상처가 됐다. 그리고 끊어졌던 또 하나의 인연 역시 찬성 앞에 나타났다. 바로 연우(이태선). 셋째 마고신(서이숙)은 전생의 원수였던 송화와 연우를 현생에선 인연으로 엮어버린 것. 미라 옆에 선 영수에게서 연우를 본 찬성은 “내가 당신에게 또 이런 인연을 끌고 왔습니다”라며 만월에게 연우를 보여줬다.  <o:p></o:p>너무 마음에 걸렸던 연우가 전생엔 도적패였지만 현생에선 형사로 잘 살고 있는 모습을 보자 그제야 마음이 놓인 만월. 동시에 그녀는 찬성이 송화도, 연우도 데리고 왔다면 ‘그자’도 데려올 것이란 걸 직감했다. “나는 절대로 그자가 무사히 스쳐 지나가게 두지 않을 거야”라는 그녀는 악랄하고 교활한 자신 때문에 그가 만신창이가 될 것이라고 예고했다. 하지만 이번엔 달랐다. 또 도망가란 협박이 아닌, “어느 날 사라지더라도, 너는 내 옆에 있어줘”라는 불안하고 간절한 고백이었던 것.  <o:p></o:p>이에 찬성은 망설임 없는 단호한 목소리로 “아니요. 당신이 사라지게 두진 않을 겁니다. 나를 믿어요”라며 그녀를 따뜻하게 안았다. 닿을 듯 말 듯 닿지 않았던 두 사람의 마음이 온전히 맞닿은 그 순간, 월령수에 꽃들이 화려하게 피어나기 시작했다. 애달픈 포옹과 함께 꽃이 만개했지만, 그 꽃이 다 지고 나면 만월은 그를 두고 떠나야 하는 걸까.  <o:p></o:p>한편, 이날 방송에는 현중(표지훈)과 유나(강미나)가 데려온 단체 귀신 손님들이 모두 한 사람에게 살해당했음이 밝혀졌다. 사건의 중심에 있는 설지원(이다윗)은 찬성과 악연으로 엮여 있으며 이번 살인사건을 수사하는 형사는 영수였다. 과연 이들의 만남에는 어떤 연결고리가 있는 것일지. 앞으로의 전개에 대한 시청자들의 궁금증이 폭발한 이유였다. <o:p></o:p>tvN ‘호텔 델루나’ 매주 토, 일 밤 9시 방송.</p>
								<p class="date">2019.08.16</p>
							</dd>
						</dl>
						<div class="imgZone"><img src="../../../img/User/news/349420190816104524.jpg" alt="tvN 토일 드라마 ‘호텔 델루나’ 자체 최고 기록으로 시청률 10% 돌파! 썸네일 이미지" /></div><!-- 썸네일 이미지 사이즈 499*296 -->
					</a>
				</li>





				<li>
					<a href="javascript:void(0);" onclick="fnDetail('162');">
						<dl>
							<dt class="dot">tvN 월화드라마 ‘60일, 지정생존자’ 시청률 자체 최고 기록, 평균 4.9%, 최고 6.4%!</dt>
							<dd>
								<p class="txt dot">tvN 월화드라마 ‘60일, 지정생존자’처음으로 대통령 선거에서 이기고 싶어진 지진희,일촉즉발 군부 쿠데타 막을까.시청률 자체 최고 기록, 평균 4.9%, 최고 6.4%!- 2049 타깃 시청률 평균 2.6%, 최고 3.4% 전채널 동시간대 1위!- 테러 공모자 이준혁의 죽음, 왜곡된 야망의 끝은 아름답지 못했다.- 육군참모총장을 주축으로 한 군부 쿠데타 발발 위기,단 2회만을 남겨두고 일촉즉발 긴장감 폭발‘60일, 지정생존자’에서 폭풍 전야의 전운이 감돌았다. 지진희에 맞선 군이 쿠데타를 모의한 것. 비싼 수업료를 치른 역사를 가진 대한민국이 처한 위기를 지진희가 막아낼 수 있을까. 시청률 또한 최고 6.4%까지 상승하며, 자체 최고 기록을 경신했다.지난 13일 방송된 tvN 월화드라마 ‘60일, 지정생존자’(극본 김태희, 연출 유종선, 제작 스튜디오드래곤, DK E&amp;M) 14회는 케이블, IPTV, 위성을 통합한 유료플랫폼 시청률에서 가구 평균 4.9%, 최고 6.4%를 기록, 자체 최고 기록을 경신했다. tvN 타깃인 남녀 2049 시청률은 평균 2.6%, 최고 3.4%를 나타내며, 지상파를 포함한 전채널 동시간대 1위를 기록했다. (유료플랫폼 전국기준/ 닐슨코리아 제공)박무진(지진희)은 처음으로 대통령 선거에서 이기고 싶어졌다. 차별금지 법안 상정을 두고, “지금 시점에서 지지율이 대선 구도에 얼마나 중요한지 모르냐”며 질책하는 한주승(허준호), “차별에 찬성하고 평등에 반대하는 것이 힘의 민낯”이라며 대선 승리를 자신하는 오영석(이준혁), “차별금지법이 선거에 불리하게 작용할거란 건 팩트”라고 못 박는 차영진(손석구)까지. 이렇게 모두가 반대하는 차별금지법 정도는 문제가 되지 않는 대한민국을 만들고 싶어진 것. 그래서 이 법의 입안을 다음 정권으로 이양하기로 결정했다. 그제야 양진만(김갑수) 대통령이 왜 자신에게 정치를 모른다고 했는지 이해했고, 어느새 불편했던 구두가 익숙해졌음을 깨달았다.이에 앞서 시급하게 해결해야 할 문제는 바로 오영석을 비롯한 테러 공모자들에 관한 물증을 확보해 이들을 검거하는 것. 대선 출마 선언 기자회견을 하루 앞둔 오영석부터 막아야 했다. 육군참모총장 은희정(이기영)을 미행한 한나경(강한나)은 거사에 참여한 사람들이 비싼 양복을 맞추며 그 누구의 의심도 받지 않고 정보를 교류했던 테일러샵의 존재를 알게 됐다. 이에 위험을 무릅쓰고 테일러샵에 잠입, 금고에 보관된 테러 관련 자료를 꺼낸 순간, 태익, 즉 이경표(최영우)에게 납치됐다.온몸이 포박당한 채 차 안에서 깨어난 한나경. 대형 폭탄을 발견하고 가까스로 탈출했지만, 차가 있던 곳은 대형마트였다. 한나경의 입을 영원히 막아 오영석의 출마를 계획대로 진행하고, 무엇보다 언제든 테러가 일어날 수 있다는 공포를 다시 심어 자기 주장이 거세진 오영석에게 VIP의 힘을 보여주기 위해 김실장(전박찬)이 선택한 곳, 바로 사람이 많은 장소였다. 한나경은 급히 차를 몰아 한강으로 향했고, 가까스로 폭탄은 수중폭파했다. 그녀는 납치되기 전, 모든 자료를 핸드폰을 통해 미리 전송해뒀고, 이제 오영석을 검거할 일만 남았다. 하지만 기자회견 직전 이 정보를 입수한 오영석은 도주해 자취를 감췄다.그 사이 은희정을 주축으로 군부 쿠데타가 모의되고 있었다. 국군통수권자로 인정할 수 없는 박무진이 합참의장을 구금해 군을 모욕했고, 그에게 이와 같은 국정 혼란의 책임을 물어 국가 기강을 바로세우겠다는 명분을 내세워 수도방위사령부에 병력을 집결시킨 것. 다행히 이 모의에 합류한 국정원 차장 지윤배(김진근)를 미행한 정한모(김주헌)가 박무진에게 이 사실을 보고했다.쿠데타를 막기 위해 박무진이 떠올린 카드는 바로 전 합참의장 이관묵(최재성). 군의 신뢰가 두텁고, 은희정에 맞설 수 있는 유일한 사람이었다. 하지만 군의 실력 행사를 저지해달란 박무진의 요청에 이관묵의 반응은 싸늘했다. 직위 해제, 가택 구금이란 모욕은 하늘을 찌르는 자존심에 크나큰 상처를 입혔기 때문. 하지만 박무진은 그에게 당근을 주지 않았다. 되레 육군 중심 재편에 불만이 많은 공군과 해군, 그리고 비육사 출신들을 모아 국군통수권자로서 반란군을 진압할 것이라 압박했다. 박무진의 초강수는 어떤 결과를 초래할까.검거 위기에 놓이자, VIP에게 버림받은 오영석 역시 쿠데타에 합류하기 위해 집결지로 향하던 중, 한나경과 경찰들의 추적에 꼬리가 잡혔다. 모든 게 끝났다고 생각한 오영석은 투항하기로 결심했다. 하지만 그가 그렇게 추락하는 걸 볼 수 없었던 김상민(박태성) 하사. “소령님은 끝까지 영웅으로 남으셔야 합니다. 제가 지킬 겁니다”라며 오영석에게 총을 발사하고, 스스로도 목숨을 끊었다. 더 이상 이 나라에서 참혹한 희생이 일어나지 않게 하겠다며, 힘을 갖기 위해 왜곡된 선택을 했던 오영석의 야망은 그렇게 아름답지 못한 엔딩으로 막을 내렸다.오영석의 죽음이 몰고 온 충격도 가시기 전, 은희정은 박무진이 쿠데타 관련 정보를 입수한 사실을 알고, 작전을 앞당기기로 결정했다. 그리고 그때, 군복을 차려입은 이관묵이 수도방위사령부에 도착했다. 과연 박무진은 쿠데타를 막아내고 위기의 대한민국을 또다시 구할 수 있을까. 단 2회 만을 남겨두고 손에 땀을 쥐는 긴장감을 폭발시킨 ‘60일, 지정생존자’, 매주 월, 화 밤 9시30분 tvN  방송.</p>
								<p class="date">2019.08.16</p>
							</dd>
						</dl>
						<div class="imgZone"><img src="../../../img/User/news/9784120190816095834.jpg" alt="tvN 월화드라마 ‘60일, 지정생존자’ 시청률 자체 최고 기록, 평균 4.9%, 최고 6.4%! 썸네일 이미지" /></div><!-- 썸네일 이미지 사이즈 499*296 -->
					</a>
				</li>





				<li>
					<a href="javascript:void(0);" onclick="fnDetail('161');">
						<dl>
							<dt class="dot">tvN 새 토일드라마 <사랑의 불시착> 현빈-손예진-서지혜-김정현, 역대급 로맨스 코미디 예고!</dt>
							<dd>
								<p class="txt dot">tvN 새 토일드라마 '사랑의 불시착'현빈-손예진-서지혜-김정현, 역대급 로맨스 코미디 예고!몰입도 200%! 웃음이 끊이지 않는 화기애애한 대본 리딩 현장!믿고 보는 배우와 제작진의 환상적인 시너지로 벌써부터 관심 폭발!- tvN 새 토일드라마 &lt;사랑의 불시착&gt; 현빈-손예진-서지혜-김정현, 믿고 보는 명품 배우들 다 모였다! 북한 사투리 패치 완료된 풋풋한 로맨스 예고!- tvN 새 토일드라마 &lt;사랑의 불시착&gt; 이정효 감독 “끝까지 즐거운 현장 될 수 있도록 노력하겠다”tvN 새 토일드라마 ‘사랑의 불시착’에서 에너제틱한 대본 리딩 현장을 공개해 극의 기대감을 한껏 끌어올리고 있다.올해 하반기 방송 예정인 tvN 새 토일드라마 ‘사랑의 불시착’(극본 박지은/ 연출 이정효/ 제작 문화창고, 스튜디오드래곤)은 어느 날 돌풍과 함께 패러글라이딩 사고로 북한에 불시착한 재벌 상속녀 윤세리(손예진 분)와 그녀를 숨기고 지키다 사랑하게 되는 북한 장교 리정혁(현빈 분)의 절대 극비 러브스토리다.이날 대본 리딩 현장에는 ‘사랑의 불시착’을 이끌어 나갈 제작진과 배우들이 한 곳에 모였다. 완성도 높은 작품을 만들 박지은 작가와 이정효 감독을 비롯해 안방극장을 설레게 할 현빈(리정혁 역), 손예진(윤세리 역), 서지혜(서단 역), 김정현(구승준 역)이 참석해 재미와 감동을 모두 휘어잡을 드라마 탄생을 예고했다.본격적으로 리딩이 시작되자 배우들은 금세 역할에 몰입해 시너지를 폭발시켰다. 북한 장교 리정혁 역을 맡은 현빈은 카리스마 넘치면서도 때로는 귀여운 모습을 어필, ‘츤데레’의 정석을 보여주며 매력을 발산했다. 남한 상속녀 윤세리로 분한 손예진 역시 러블리하고 밝은 모습으로 현장을 밝고 화사하게 비췄다. 두 사람은 티격태격하면서도 운명적 만남을 예고, 하반기를 후끈 달아오르게 할 절대 극비 러브스토리의 시작을 알렸다.서지혜는 남심 저격 비주얼을 갖춘 북한 셀럽 서단으로 변신, 도도하면서도 당찬 모습을 표현하며 매력을 뽐냈다. 속을 알 수 없는 인물 구승준에 몰입한 김정현은 알쏭달쏭한 인물 그 자체로 변신, 입체감있는 캐릭터를 그려냈다.북한군으로 톡톡한 활약을 펼칠 배우들의 조합도 눈길을 끈다. 오만석(조철강 역)과 김영민(정만복 역)은 극에 긴장감을 불러 일으키며 신들린 연기력을 선보였다. 여기에 분위기 메이커 역할을 한 양경원(표치수 역), 남측 사정에 밝은 유수빈(김주먹 역), 순박한 막내 북한군을 맡은 탕준상(금은동 역)까지 더해져 주연 커플들과 환상의 호흡을 자랑했다.북한 아줌마 군단으로 출연할 김정난(마영애 역), 김선영(나월숙 역), 장소연(현명순 역), 차청화(양옥금 역)는 코믹한 톤으로 현장을 웃음바다로 만드는 등 저마다 독보적인 존재감을 뽐내기도 했다.또한 남경읍(윤회장 역)은 윤세리(손예진 분)의 아버지로 진중한 재벌가 회장님의 면모를, 장혜진(서단 엄마)은 북한 상위 1%의 럭셔리한 사모님 역할을 톡톡히 해냈다. 윤세리의 큰오빠와 작은오빠로 각각 분하는 박형수(윤세형 역)와 최대훈(윤세준 역)과 작은 올케로 등장하는 윤지민(고상아 역) 역시 탄탄한 내공을 통해 극의 몰입도를 한층 더 높였다.이정효 감독은 “다들 건강하고 끝까지 즐거운 현장이 될 수 있도록 많이 노력할테니 재미있고 신나게 촬영했으면 좋겠다”라고 전해 뜨거운 박수갈채를 받았다.이날 대본 리딩 현장은 배우들의 열연을 통해 생생하게 그려질 다양한 장면들로 웃음꽃이 활짝 핀 화기애애한 분위기 속에 진행됐다. 여기에 두 주연 배우의 달달한 케미까지 더해져 웰메이드 드라마의 완성이 기대되고 있다.이처럼 역대급 배우들의 총출동과 흠잡을 곳 없이 완벽한 대본이 시너지를 이루며 예비 시청자들의 기대감을 증폭시키고 있는 tvN 새 토일드라마 ‘사랑의 불시착’은 하반기 방송 예정이다.</p>
								<p class="date">2019.08.16</p>
							</dd>
						</dl>
						<div class="imgZone"><img src="../../../img/User/news/7283020190816095029.jpg" alt="tvN 새 토일드라마 <사랑의 불시착> 현빈-손예진-서지혜-김정현, 역대급 로맨스 코미디 예고! 썸네일 이미지" /></div><!-- 썸네일 이미지 사이즈 499*296 -->
					</a>
				</li>





				<li>
					<a href="javascript:void(0);" onclick="fnDetail('160');">
						<dl>
							<dt class="dot">OCN 토일 오리지널 <WATCHER(왓쳐)> 시청률 최고 6.7%까지 치솟으며 2019년 OCN 최고 시청률 기록 돌파</dt>
							<dd>
								<p class="txt dot">OCN 토일 오리지널 '<watcher(왓쳐></watcher(왓쳐>'</watcher>(시청률 최고 6.7%까지 치솟으며 2019년 OCN 최고 시청률 기록 돌파다시 쓴 장르물의 새 역사! 차원을 넘어선 심리스릴러의 품격종영까지 단 4회, 마지막까지 눈 뗄 수 없이 휘몰아친다! 반전의 서스펜스 장인 안길호 감독 인터뷰 공개직접 밝힌 명장면부터 마지막 관전 포인트까지안길호 감독은 “남은 4회, 이제 진실과 마주할 한석규, 서강준, 김현주의 변화와 감정선 지켜보는 재미있을 것”복선과 반전의 중심은 ‘사건’이 아닌 ‘사람’자극적인 사건 없이도 스릴을 극대화하는 결정적 차별점 ‘왓쳐’에 쏟아지는 찬사와 이유 있는 호평<!-- [if !supportEmptyParas]--><!-- [endif] --> 종영까지 단 4회만을 남겨둔 ‘WATCHER(왓쳐)’가 마지막까지 예측 불가한 전개로 차원을 넘어서는 심리스릴러의 방점을 찍는다.  OCN 토일 오리지널 ‘WATCHER(왓쳐)’(연출 안길호, 극본 한상운, 제작 스튜디오드래곤/ 이하 ‘왓쳐’)를 향한 찬사와 호평이 갈수록 뜨거워지고 있다. 진실에 다가갈수록 얽히는 이해관계와 사건 이면에 숨겨진 욕망, 한순간도 눈을 뗄 수 없는 반전의 연속은 압도적 서스펜스로 전율을 선사하고 있다.  서서히 심장을 조이는 심리스릴러의 묘는 후반부로 치달을수록 시청자들을 더욱 달아오르게 만들었다.  ‘왓쳐’에 쏟아지는 호평은 시청률로도 이어졌다. 11일 방송된 12회 시청률이 케이블, IPTV, 위성을 통합한 유료플랫폼에서 가구 평균 6.1% 최고 6.7%를 기록, 자체 최고를 경신하며 케이블과 종편을 포함한 동시간대 1위에 올랐다. 이는 2019년 OCN 오리지널 작품 중 최고 시청률이자, 역대 OCN 오리지널 작품들의 최고 시청률 기준 TOP3에 랭크되는 수치다. 웰메이드라는 찬사와 함께 장르물의 영역을 확장하며 다시 한번 유의미한 성과를 일궈내고 있는 것.  ‘왓쳐’가 이토록 뜨거운 반응을 일으키고 있는 이유는 장르물의 문법을 답습하지 않는다는 점에 있다. ‘사건’이 아닌 ‘사람’이 복선과 반전의 중심에 있다. 도치광(한석규 분), 김영군(서강준 분), 한태주(김현주 분)을 비롯해 모든 인물은 선과 악, 편과 적의 경계가 모호할뿐더러, 다음 수를 쉽사리 예측할 수도 없다. 매 순간 기민하게 반응하고 선택하는 인물이 있고, 그들의 복잡한 내면과 감정이 복선이자 반전이 된다. 누가 어떤 선택을 하느냐에 따라 판이 완전히 뒤바뀐다. 각자의 당위에 맞게 움직이니 하나의 깃발 아래 모여들지도 않는다. 이는 자극적인 사건 없이도 스릴과 긴장감을 만들어내며 심장을 조여 가는 ‘왓쳐’만의 결정적 차별점으로 손꼽힌다. 안길호 감독은 “조금씩 서사를 쌓아가는 대본, 이를 120% 이상 표현하는 배우들 덕”이라고 공을 돌렸다. “기존의 장르물과 다르게 심리적인 요소와 인물에 집중되어있는 만큼 배우들의 연기가 서스펜스와 긴장을 더 힘 있게 만들어주고 있다”는 설명이다. 전개 과정에서 촘촘히 깔리는 복선과 반전도 철저하게 사건이 아닌 인물과 심리가 중심이다. 시청자에게도 감시자의 역할을 부여하며 끊임없이 의심하게 만들고, 혼란스럽게 만드는 ‘왓쳐’만의 서스펜스를 그려내기란 결코 쉽지 않은 일. 안길호 감독은 사소한 눈빛이나 표정도 놓치지 않는 디테일로 내밀하고 은밀한 심리전의 묘미를 살리고 있다는 평가다. 한 인물에 집중하지 않고 각자의 시선에서 사건을 담담하게 쫓으며 해석의 가능성도 폭넓게 열어뒀다. 이는 시청자들의 추리력을 발동시키고 몰입력을 높이는데 주효했다. 안길호 감독은 “3명의 주인공의 시점으로 이야기를 만드는 것은 어렵지만, 한 사람의 시선과 감정을 따라가지 않고 연출의 주관을 최대한 배제했다.  ‘왓쳐’라는 제목처럼 보는 사람의 관점에 따라 어떤 사건이나 상황에 대한 이해가 다를 수 있다는 점을 유지하고자 노력했다”고 밝혔다.  사소한 디테일이 캐릭터의 성격을 더 극적으로 보여주고, 때론 의심의 도화선이 되는 심리스릴러에 맞게 배우들 역시 사소한 부분에도 공을 들이고 있다는 후문. 도치광의 야누스적 얼굴이 드러났던 조사실 취조 장면에서 껌을 씹는 장면이 대표적인데, 한석규가 직접 아이디어를 냈다고. 안길호 감독도 배우들에 대해서는 칭찬 일색이다. 안 감독은 “캐릭터를 세밀하게 분석하고 색깔을 입히는 한석규 배우의 열정은 정말 대단하다. 누구보다 도치광을 사랑하고 있음을 느낀다. 상대 배우에 대한 배려까지도 완벽하다. 그런 한석규의 연기를 카메라에 담아내고 있음이 영광”이라고 밝혔다. 극단의 감정을 자유롭게 오가는 폭넓은 연기로 ‘재발견’이라는 호평을 받고 있는 서강준에 대해서도 “연기력과 열정, 인성까지 겸비한 연기자다. 같이 작업해보고 늘 감탄하고 있다”고 극찬했고, 판을 흔들며 가장 강력한 조커로 맹활약하는 김현주에 대해서도 “우아하고 지적이며, 날카롭기까지 한 완벽한 한태주다. 늘 결정적인 반전을 제공하는 인물인데, 그 미묘한 감정과 선악의 경계를 절묘하게 포착하는 예리함이 놀랍다”고 전했다. 안길호 감독이 꼽은 명장면 역시 배우들의 연기력이 두드러졌던 순간들이다.  “도치광의 취조실 장면에서 신들린 모습이나 김영군이 아버지를 잃고도 절제된 슬픔을 보여줬던 장면, 과거의 실마리를 가지고 있는 이동윤 검사가 죽은 뒤 한태주가 아쉬워하는 장면들은 상상 이상으로 좋은 연기였다”는 안길호 감독. 절제된 연기로 감정을 오롯이 담아내야 하는 연기는 결코 쉽지 않다. 한석규, 서강준, 김현주를 비롯한 모든 배우들이 놀라운 균형감각으로 이를 완성하고 있다. 이어 “주인공뿐 아니라 허성태, 박주희, 주진모, 김수진, 정도원 배우도 각자의 역할을 기대 이상으로 해주며 극을 빛내주고 있다. 모든 배우들이 현실감 있고 절제된 연기력으로 집중력 있는 드라마를 만들어주고 있어서, 연출자로서 항상 감사한 마음을 갖고 있다”고 칭찬을 아끼지 않았다. 뜨겁게 달려온 ‘왓쳐’가 4회만을 남겨두고 있다. ‘장사회’가 진실을 풀 열쇠로 떠올랐지만, 여전히 풀어야 할 수수께끼가 남아있다. 안길호 감독은 “초반부에는 사건을 통해 세 인물의 서사와 관계성을 쌓았고 중반부터 이들의 공조, 충돌, 갈등을 통한 해결이 그려졌다. 남은 4회에서 그동안 쌓아온 서사의 결말이 드러날 뿐 아니라, 서로 의심하고 경계했던 관계가 변화한다. 이제 진실과 정의를 향해가는 도치광, 김영군, 한태주와 그것을 마주했을 때 인물들의 감정선을 지켜보는 재미가 있을 것이다. 끝까지 지켜봐 달라”고 당부했다. 비리수사팀은 살인마 ‘거북이’ 박찬희 검거에 성공하며 경찰 엘리트 비밀조직 ‘장사회’의 실체에 한 발짝 다가섰다. 여전히 15년 전 사건의 진실이 풀리지 않은 가운데, 한태주 앞에 전남편 윤지훈(박훈 분)이 나타나며 새로운 파란을 예고했다. 윤지훈의 등장은 후반부 몰아칠 폭풍의 기폭제가 될 것으로 기대감을 높인다.  한편,  OCN 내부 감찰 스릴러 ‘왓쳐’  13회는 오는 17일(토) 밤 10시 20분 방송된다. (끝)<!-- [if !supportEmptyParas]--><!-- [endif] --></p>
								<p class="date">2019.08.16</p>
							</dd>
						</dl>
						<div class="imgZone"><img src="../../../img/User/news/7129120190816094446.jpg" alt="OCN 토일 오리지널 <WATCHER(왓쳐)> 시청률 최고 6.7%까지 치솟으며 2019년 OCN 최고 시청률 기록 돌파 썸네일 이미지" /></div><!-- 썸네일 이미지 사이즈 499*296 -->
					</a>
				</li>





				<li>
					<a href="javascript:void(0);" onclick="fnDetail('159');">
						<dl>
							<dt class="dot">평균 4.2% 최고 5.2% 자체 최고 시청률로 종영! 뜨겁고 아찔하게 달려온 8주의 여정, tvN '검블유'가 남긴 것</dt>
							<dd>
								<p class="txt dot">평균 4.2%, 최고 5.2% 자체 최고 시청률로 종영!뜨겁고 아찔하게 달려온 8주의 여정,tvN '검블유'가 남긴 것#1. 100% 싱크로율로 인생캐릭터 탄생시킨 배우들의 열연#2. 베일 벗은 포털 업계 + 3色 로맨스의 절묘한 조화#3. 쫀쫀한 대본 + 감각적인 연출의 완벽한 시너지tvN 수목드라마 ‘검색어를 입력하세요 WWW’(극본 권도은, 연출 정지현, 권영일, 제작 화앤담 픽쳐스, 이하 ‘검블유’)가 자체 최고 시청률로 뜨겁고 아찔했던 지난 8주간의 여정을 마무리했다.지난 25일 방송된 최종회는 케이블, IPTV, 위성을 통합한 유료플랫폼 시청률에서 가구 평균 4.2%, 최고 5.2%로 자체 최고를 기록했다. 또한, tvN 타깃인 남녀 2049 시청률 역시 평균 3.1%, 최고 3.8%로 지상파 포함 전채널에서 동시간대 1위 및 자체 최고를 기록하며 유종의 미를 거뒀다. (유료플랫폼 전국기준/ 닐슨코리아 제공)‘검블유’ 최종회에서 국내 최대 포털 사이트 ‘유니콘’과 ‘바로’는 “포털 사용자들의 개인 정보 제공”을 요구하는 정부에 정면으로 맞섰다. 각 포털 사이트의 탑화면에 “바로는(유니콘은) 정부의 포털 개인 정보 열람을 반대합니다”라는 슬로건을 내건 것. 지난 8주간 치열한 경쟁을 펼쳐왔던 배타미(임수정), 차현(이다희), 송가경(전혜진)이 바로, 인터넷협회, 그리고 유니콘을 대표해 ‘포털 윤리강령’을 낭독하는 장면은 걸크러시 3인방이 한마음, 한뜻으로 뭉쳐 선사한 최고의 사이다 명장면으로 시청자들 역시 환호를 쏟아냈다.3色 로맨스의 결말도 시청자들을 미소 짓게 했다. 사랑하지만 이별을 택했던 타미와 모건(장기용)은 “같은 이유로 싸우게 될지도, 헤어지게 될지도 모르지만, 지금 사랑하자”라는 길을 택했다. 차현은 군에 입대한 지환(이재욱)을 기다리는 일명 ‘고무신 커플’이 됐고, 마지막까지 달달한 연애를 그려내 풋풋한 설렘을 전달했다. 가경의 홀로서기를 위해 완벽한 남남이 된 가경과 진우(지승현)는 이혼으로 결혼 생활에 종지부를 찍었지만, 사랑은 끝나지 않았음을 시사한 열린 결말로 이들의 앞날을 응원케 했다. 지난 8주간 포털 업계 걸크러시 3인방의 일과 사랑으로 안방극장을 사로잡았던 ‘검블유’가 남긴 것들을 짚어봤다.#1. 100% 싱크로율로 인생캐릭터 탄생시킨 배우들의 열연신선하고 매력적인 조합으로 주목받았던 임수정, 장기용, 이다희, 전혜진의 열연은 기대를 저버리지 않았다. 포털 업계 최고의 승부사 배타미에 완벽 몰입해 극을 이끌었던 임수정과 훈훈한 기럭지와 매력적인 마스크로 첫 등장부터 심쿵을 선사했던 박모건 역의 장기용. 뜨거운 열정과 올바른 마인드, 대책 없는 사랑스러움까지 모두 잡은 차현을 연기한 이다희, 그리고 시크하고 우아한 카리스마가 돋보이는 송가경을 독보적인 존재감을 뿜어낸 전혜진은 각기 다른 사연과 매력을 지닌 캐릭터들을 100%의 싱크로율로 연기하며 극의 몰입감을 높였다. 시청자들이 “최고의 연기, 최고의 케미를 보여준 인생 캐릭터, 배우들이었다”라고 입을 모은 이유였다.#2. 치열한 포털 전쟁 + 3色 로맨스의 절묘한 조화포털 업계를 배경으로 펼쳐지는 국내 최고 포털 사이트 유니콘과 바로의 치열한 전쟁과 매력적인 캐릭터들이 그려낸 3色 로맨스는 극의 강약을 절묘하게 조율하며 안방극장을 뒤흔들었다. 당차고 멋진 그녀들 배타미, 차현, 송가경은 저마다 강렬한 카리스마를 뿜어내며 포털 업계를 이끌었지만, 한편으로는 한여름 밤을 다채롭게 수놓는 로맨스를 선사해 보는 이들을 사로잡았다. 넘치는 긴장감과 통쾌한 사이다를 선사한 포털 이야기의 전개 속에 짜임새 있게 엮여있는 리얼 로맨스가 두 배의 재미를 선사하며, 일과 사랑 모두 놓치지 않은 작품을 탄생시켰다.#3. 쫀쫀한 대본 + 감각적인 연출의 완벽한 시너지‘검블유’가 첫 회부터 마지막까지 지난 8주간 화제의 중심에 섰던 이유에는 매회 다음 전개를 궁금하게 만들었던 쫀쫀한 대본, 그리고 이를 영상으로 구현한 감각적인 연출이 주요했다. 먼저 권도은 작가는 베일에 싸여있었던 포털 업계를 배경으로 인터넷에 익숙한 사람이라면 누구나 공감할 수 있는 소재, 그리고 직장인이라면 한 번쯤 고민했음직한 이야기를 적절히 풀어냈다. 또한, 정지현, 권영일 감독의 신선하고 매력적인 연출이 구현해낸 영상미와 등장할 때마다 검색어 행진을 일으켰던 배경음악 등은 완벽한 시너지를 뿜어내며 매회 새로운 명장면을 탄생시키며 레전드를 갱신했다. “기대되는 작가, 기대되는 감독을 만났다”, “대본과 연출 어느 하나 빠지지 않는 드라마를 만나서 행복했다”라는 평이 나온 이유였다.</p>
								<p class="date">2019.07.26</p>
							</dd>
						</dl>
						<div class="imgZone"><img src="../../../img/User/news/6538220190726104855.jpg" alt="평균 4.2% 최고 5.2% 자체 최고 시청률로 종영! 뜨겁고 아찔하게 달려온 8주의 여정, tvN '검블유'가 남긴 것 썸네일 이미지" /></div><!-- 썸네일 이미지 사이즈 499*296 -->
					</a>
				</li>







			</ul>
		</div>
	</div>
	<!-- E : container -->

	<form name="frm" id="frm" method="post">
		<input type="hidden" name="selected"/>
		<input type="hidden" name="searchTxt"/>
		<input type="hidden" name="flag" value="S"/>
		<input type="hidden" id="cpage" value="1"/>
	</form>

	<script>
	var initLoad = true;

	function f_fnSearch() {
		if(event.keyCode != 13) {
			return false;
		} else {
			fnSearch_r();
		}
	}

	function fnSearch_r() {
		var schGubun = $.trim($("#selected").val());
		var schTxt = $.trim($("#searchTxt").val());

// 		if (schGubun != "" && schTxt == "") {
// 			alert("검색어를 입력해주세요");
// 			return;
// 		}

		document.frm.selected.value = schGubun;
		document.frm.searchTxt.value = schTxt;
		document.frm.cpage.value = "1"
		document.frm.action = "/dragonproject/view/User/newsroom/news";
		document.frm.submit();
	}

	function fnDetail(idx) {
		document.frm.selected.value = $.trim($("#selected").val());
		document.frm.searchTxt.value = $.trim($("#searchTxt").val());
		document.frm.action = "/dragonproject/view/User/newsroom/news/"+idx+".jsp";
		document.frm.submit();
	}

	function fnMore() {
		fnSearch( parseInt($("#cpage").val())+1 );
	}

	function fnSearch(cpage) {
		var selected = $.trim($("#selected").val());
		var searchTxt = $.trim($("#searchTxt").val());

		$.ajax({
			url: "/dragonproject/view/User/newsroom/news/ajax",
			type: "POST",
			data: {
					"cpage" : cpage
					, "selected" : selected
					, "searchTxt" : searchTxt
				},
			dataType: "json",
			success: function(data){
				var html = "";
				for (var i=0;i<data.list.length;i++) {
					var content = $.trim(removeHtml(data.list[i].content));

					if (data.list[i].thum_img == null || data.list[i].thum_img == "") {
						html += "<li class='noneImg'>";
						html += "	<a href='javascript:void(0)' onclick='fnDetail("+data.list[i].idx+")' >";
						html += "		<dl>";
						html += "			<dt class='dot'>"+data.list[i].title+"</dt>";
						html += "			<dd>";
						html += "				<p class='txt dot'>"+content+"</p>";
						html += "				<p class='date'>"+data.list[i].reg_dt+"</p>";
						html += "			</dd>";
						html += "		</dl>";
						html += "	</a>";
						html += "</li>";
					} else {
						html += "<li>";
						html += "	<a href='javascript:void(0)' onClick='fnDetail("+data.list[i].idx+")' >";
						html += "		<dl>";
						html += "			<dt class='dot'>"+data.list[i].title+"</dt>";
						html += "			<dd>";
						html += "				<p class='txt dot'>"+content+"</p>";
						html += "				<p class='date'>"+data.list[i].reg_dt+"</p>";
						html += "			</dd>";
						html += "		</dl>";
						html += "		<div class='imgZone'><img src='/dragonproject/view/User/newsroom/news/"+data.list[i].thum_img+"' alt='"+data.list[i].title+" 썸네일 이미지'  width='320px' height='190px'/>";
						html += "	</a>";
						html += "</li>";
					}
				}

				$("#data").append(html);
				$("#cpage").val(data.params.cpage);

				if (parseInt(data.totalCount) <= (parseInt($("#cpage").val())*parseInt("5"))) {
					$("#btnMore").hide();
				}
				addDot();
				initLoad = false;
			},
			error : function (jqXHR, textStatus, errorThrown) {
				isProcess = false;
				alert('오류가 발생했습니다\n[' + textStatus + ']\n' + errorThrown);
			}
		});
	}

	$(function(){
		$("#selected").val("");
		$("#searchTxt").val("");
		//fnSearch(1);
		if (parseInt("71") <= (parseInt("1")*parseInt("5"))) {
			$("#btnMore").hide();
		}
		addDot();
	});

	</script>
	<!-- S : footer -->


	<!-- S : footer -->
	<div id="footer">
		<div class="footer-in">
			<div class="footer-top">
				<div class="family"><!-- class on 추가 -->
					<a href="#" class="sel">Family Site<span class="arr">Family Site 더보기</span></a>
					<ul>
						<li class="active"><a href="http://www.cj.net/" target="_blank">CJ 그룹</a></li><!-- 선택된 값에 class active 추가 -->
						<li><a href="http://www.cjenm.com/" target="_blank">CJ ENM(E&M)</a></li>
						<li><a href="http://tvn.tving.com/" target="_blank">tvN</a></li>
						<li><a href="http://ocn.tving.com/" target="_blank">OCN</a></li>
						<li><a href="http://www.culturedepot.kr/" target="_blank">문화창고</a></li>
						<li><a href="http://jspictures.tv/" target="_blank">JS Pictures</a></li>
					</ul>
				</div>
				<ul class="footer-menu">
					<li><a href="../etc/lawNotice.jsp">법적고지</a></li>
					<li><a href="javascript:void(0)" onclick="ShowModalPopup(this,'popEmail');">이메일 무단수집 거부</a></li>
					<li><a href="../etc/ethics.jsp">윤리경영</a></li>
					<li><a href="../about/contact.jsp">CONTACT US</a></li>
					<li><a href="../etc/sitemap.jsp">사이트맵</a></li>
				</ul>
			</div>
			<div class="footer-txt">
				<div class="footer-logo"><img src="../../../img/User/com/footer_logo.png" alt="studio dragon" /></div>
				<div class="txt">
					<p>서울특별시 마포구 매봉산로 75, 17층 스튜디오 드래곤 주식회사</p>
					<span>FAX : +82 2-2146-0988</span>
					<span>사업자등록번호 : 747-81-00388</span>
					<span>대표자 : 최진희</span>
					<span class="copyright">©2017 <strong>STUDIO DRAGON Corp.</strong> All Rights Reserved.</span>
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
			<p>본 웹사이트에 게시된 이메일 주소가 전자우편 수집 프로그램이나 그 밖의 기술적 장치를 이용하여 무단으로 수집되는 것을 거부하며, 이를 위반시 정보통신망법에 의해 형사 처벌 됨을 유념하시기 바랍니다.</p>
			<p class="date">게시일 : 2017. 06. 01</p>
		</dd>
	</dl>
	<a href="javascript:void(0)" class="btnClose" onclick="HideModalPopup('popEmail');"><img src="../../../img/User/com/btn_pop_close.png" alt="팝업 닫기" /></a>
</div>
<!-- //이메일 무단수집 거부 팝업 -->
</body>

<!-- Mirrored from www.studiodragon.net/front/kr/pr/news by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 22 Aug 2019 10:25:00 GMT -->
</html>
