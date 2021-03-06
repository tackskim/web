<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="utf-8">
<%@ page import="java.util.*"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="Dao.*"%>
<%@ page import="Dto.*"%>

<%
	ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
	lists = (ArrayList) request.getAttribute("result");
%>

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>SB Admin 2 - Buttons</title>

<!-- Custom fonts for this template-->
<link href="../../Vender/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="../../css/Admin/sb-admin-2.css" rel="stylesheet">

</head>

<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">

		<!-- Sidebar -->
		<ul
			class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
			id="accordionSidebar">

			<!-- Sidebar - Brand -->
			<a
				class="sidebar-brand d-flex align-items-center justify-content-center"
				href="index.jsp">
				<div class="sidebar-brand-icon rotate-n-15">
					<img class="small_img" src="../../img/Admin/adminpage/drgon.png"
						alt="이미지">
				</div> 
			</a>

			<!-- Divider -->
			<hr class="sidebar-divider my-0">

			<!-- Nav Item - Dashboard -->
			<li class="nav-item"><a class="nav-link" href="index.jsp"> <i
					class="fas fa-fw fa-tachometer-alt"></i> <span>Dashboard</span></a></li>

			<!-- Divider -->
			<hr class="sidebar-divider">

			<!-- Nav Item - Utilities Collapse Menu -->
			<li class="nav-item"><a class="nav-link collapsed" href="#"
				data-toggle="collapse" data-target="#collapseUtilities"
				aria-expanded="true" aria-controls="collapseUtilities"> <i
					class="fas fa-fw fa-wrench"></i> <span>Manage</span>
			</a>
				<div id="collapseUtilities" class="collapse"
					aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
					<div class="bg-white py-2 collapse-inner rounded">
						<h6 class="collapse-header">Custom Utilities:</h6>
						<a class="collapse-item" href="tables2recrui.jsp">RECRUITMENT</a>

					</div>
				</div></li>

			<!-- Divider -->
			<hr class="sidebar-divider">

			<!-- Heading -->
			<div class="sidebar-heading">Addons</div>
			<!-- Nav Item - Pages Collapse Menu -->
			<li class="nav-item"><a class="nav-link collapsed" href="#"
				data-toggle="collapse" data-target="#collapsePage1"
				aria-expanded="true" aria-controls="collapsePage1"> <i
					class="fas fa-fw fa-folder"></i> <span>Membership</span>
			</a>
				<div id="collapsePage1" class="collapse"
					aria-labelledby="headingPages" data-parent="#accordionSidebar">
					<div class="bg-white py-2 collapse-inner rounded">
						<h6 class="collapse-header">Login Screens:</h6>
						<a class="collapse-item" href="register.jsp">Register</a> <a
							class="collapse-item" href="forgot-password.jsp">Forgot
							Password</a>
						<div class="collapse-divider"></div>
					</div>
				</div></li>
			<!-- Nav Item - Pages Collapse Menu -->
			<li class="nav-item"><a class="nav-link collapsed" href="#"
				data-toggle="collapse" data-target="#collapsePage2"
				aria-expanded="true" aria-controls="collapsePage2"> <i
					class="fas fa-fw fa-folder"></i> <span>Producrion</span>
			</a>
				<div id="collapsePage2" class="collapse"
					aria-labelledby="headingPage" data-parent="#accordionSidebar">
					<div class="bg-white py-2 collapse-inner rounded">
						<h6 class="collapse-header">WORKS</h6>
						<a class="collapse-item" href="buttons.jsp">SHOWS</a>
					</div>
				</div></li>
			<!-- Nav Item - Pages Collapse Menu -->
			<li class="nav-item"><a class="nav-link collapsed" href="#"
				data-toggle="collapse" data-target="#collapsePage3"
				aria-expanded="true" aria-controls="collapsePage3"> <i
					class="fas fa-fw fa-folder"></i> <span>NewsRoom</span>
			</a>
				<div id="collapsePage3" class="collapse" aria-labelledby="headingPa"
					data-parent="#accordionSidebar">
					<div class="bg-white py-2 collapse-inner rounded">
						<h6 class="collapse-header">Article</h6>
						<a class="collapse-item" href="buttons0.1.jsp">Press Releases</a>
					</div>
				</div></li>

			<!-- Nav Item - Pages Collapse Menu -->
			<li class="nav-item"><a class="nav-link collapsed" href="#"
				data-toggle="collapse" data-target="#collapsePage4"
				aria-expanded="true" aria-controls="collapsePage4"> <i
					class="fas fa-fw fa-folder"></i> <span>시청자 의견</span>
			</a>
				<div id="collapsePage4" class="collapse"
					aria-labelledby="headingPage" data-parent="#accordionSidebar">
					<div class="bg-white py-2 collapse-inner rounded">

						<h6 class="collapse-header">DRAMA</h6>

						<a class="collapse-item" href="tables.jsp">시청자의견 게시판관리</a>

					</div>
				</div></li>


			<!-- Divider -->
			<hr class="sidebar-divider d-none d-md-block">

			<!-- Sidebar Toggler (Sidebar) -->
			<div class="text-center d-none d-md-inline">
				<button class="rounded-circle border-0" id="sidebarToggle"></button>
			</div>

		</ul>
		<!-- End of Sidebar -->

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<!-- Topbar -->
				<nav
					class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

					<!-- Sidebar Toggle (Topbar) -->
					<button id="sidebarToggleTop"
						class="btn btn-link d-md-none rounded-circle mr-3">
						<i class="fa fa-bars"></i>
					</button>

					<!-- Topbar Search -->
					<form
						class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
						<div class="input-group">
							<input type="text" class="form-control bg-light border-0 small"
								placeholder="Search for..." aria-label="Search"
								aria-describedby="basic-addon2">
							<div class="input-group-append">
								<button class="btn btn-primary" type="button">
									<i class="fas fa-search fa-sm"></i>
								</button>
							</div>
						</div>
					</form>

					<!-- Topbar Navbar -->
					<ul class="navbar-nav ml-auto">

						<li class="nav-item dropdown no-arrow d-sm-none"><a
							class="nav-link dropdown-toggle" href="#" id="searchDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <i class="fas fa-search fa-fw"></i>
						</a> <!-- Dropdown - Messages -->
							<div
								class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
								aria-labelledby="searchDropdown">
								<form class="form-inline mr-auto w-100 navbar-search">
									<div class="input-group">
										<input type="text"
											class="form-control bg-light border-0 small"
											placeholder="Search for..." aria-label="Search"
											aria-describedby="basic-addon2">
										<div class="input-group-append">
											<button class="btn btn-primary" type="button">
												<i class="fas fa-search fa-sm"></i>
											</button>
										</div>
									</div>
								</form>
							</div></li>

						<!-- Nav Item - Alerts -->
						<li class="nav-item dropdown no-arrow mx-1"><a
							class="nav-link dropdown-toggle" href="#" id="alertsDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <i class="fas fa-bell fa-fw"></i> <!-- Counter - Alerts -->
								<span class="badge badge-danger badge-counter">3+</span>
						</a> <!-- Dropdown - Alerts -->
							<div
								class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in"
								aria-labelledby="alertsDropdown">
								<h6 class="dropdown-header">Alerts Center</h6>
								<a class="dropdown-item d-flex align-items-center" href="#">
									<div class="mr-3">
										<div class="icon-circle bg-primary">
											<i class="fas fa-file-alt text-white"></i>
										</div>
									</div>
									<div>
										<div class="small text-gray-500">AUG 12, 2019</div>
										<span class="font-weight-bold">new download!</span>
									</div>
								</a> <a class="dropdown-item d-flex align-items-center" href="#">
									<div class="mr-3">
										<div class="icon-circle bg-success">
											<i class="fas fa-donate text-white"></i>
										</div>
									</div>
									<div>
										<div class="small text-gray-500">AUG 7, 2019</div>
										$290.29
									</div>
								</a> <a class="dropdown-item d-flex align-items-center" href="#">
									<div class="mr-3">
										<div class="icon-circle bg-warning">
											<i class="fas fa-exclamation-triangle text-white"></i>
										</div>
									</div>
								</a> <a class="dropdown-item text-center small text-gray-500"
									href="#">Show All Alerts</a>
							</div></li>

						<!-- Nav Item - Messages -->
						<li class="nav-item dropdown no-arrow mx-1"><a
							class="nav-link dropdown-toggle" href="#" id="messagesDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <i class="fas fa-envelope fa-fw"></i>
								<!-- Counter - Messages --> <span
								class="badge badge-danger badge-counter">7</span>
						</a> <!-- Dropdown - Messages -->
							<div
								class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in"
								aria-labelledby="messagesDropdown">
								<h6 class="dropdown-header">Message</h6>
								<a class="dropdown-item d-flex align-items-center"
									href="https://www.instagram.com/p/B0iUfTulnTP/?igshid=1o2ce9z9whuy2">

									<div class="dropdown-list-image mr-3">
										<img class="small2_img" src="../../img/Admin/adminpage/sh.png"
											alt="이미지">
										<div class="status-indicator bg-success"></div>
									</div>
									<div class="font-weight-bold">
										<div class="text-truncate">안녕!나는 영양을 책임지는 영양사야!</div>
										<div class="small text-gray-500">Seo Hyeon · 58m</div>
									</div>
								</a> <a class="dropdown-item d-flex align-items-center"
									href="https://www.instagram.com/p/BoO-teaBoJe/?igshid=dq8qd6p4onub">
									<div class="dropdown-list-image mr-3">
										<img class="small2_img"
											src="../../img/Admin/adminpage/tiger.png" alt="이미지">
										<div class="status-indicator"></div>
									</div>
									<div>
										<div class="text-truncate">안녕!?나는 세상에서 제일 가는 정범이야!</div>
										<div class="small text-gray-500">Jeong tiger · 10m</div>
									</div>
								</a> <a class="dropdown-item d-flex align-items-center"
									href="https://www.instagram.com/p/Blz0pXWFJX7/?igshid=126zmvw3d0jpb">
									<div class="dropdown-list-image mr-3">
										<img class="small2_img"
											src="../../img/Admin/adminpage/tak.png" alt="이미지">
										<div class="status-indicator bg-warning"></div>
									</div>
									<div>
										<div class="text-truncate">안녕!코딩없으면 정말 못살아 나는 어디서든
											코딩택우야!</div>
										<div class="small text-gray-500">Tak Woo · 22m</div>
									</div>
								</a> <a class="dropdown-item d-flex align-items-center" href="#">
									<div class="dropdown-list-image mr-3">
										<img class="small2_img"
											src="../../img/Admin/adminpage/star.png" alt="이미지">
										<div class="status-indicator bg-success"></div>
									</div>
									<div>
										<div class="text-truncate">뵤리입니다. 보고싶어요 ♥</div>
										<div class="small text-gray-500">Star · 20m</div>
									</div>
								</a> <a class="dropdown-item text-center small text-gray-500"
									href="#">Read More Messages</a>
							</div></li>

						<div class="topbar-divider d-none d-sm-block"></div>

						<!-- Nav Item - User Information -->
						<li class="nav-item dropdown no-arrow"><a
							class="nav-link dropdown-toggle" href="#" id="userDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <span
								class="mr-2 d-none d-lg-inline text-gray-600 small">Park
									Seo Hyeon</span> <img class="small2_img"
								src="../../img/Admin/adminpage/star.png" alt="이미지">
						</a> <!-- Dropdown - User Information -->
							<div
								class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
								aria-labelledby="userDropdown">

								<a class="dropdown-item" href="#" data-toggle="modal"
									data-target="#logoutModal"> <i
									class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
									Logout
								</a>
							</div></li>

					</ul>

				</nav>
				<!-- End of Topbar -->

				<!-- Begin Page Content -->
				<div class="container-fluid">

					<!-- Page Heading -->
					<h1 class="h3 mb-4 text-gray-800">Drama news</h1>

					<div class="row">

						<div class="col-lg-6">

							<!-- Circle Buttons -->
							<div class="card shadow mb-4">
								<div style="text-align: right;">

									<form name="form1" action="NEWSWrite.do" method="post">


										<INPUT TYPE="SUBMIT" VALUE="글쓰기" STYLE="HEIGHT: 20"> </INPUT>
									</form>

								</div>
								<div class="card-header py-3">
									<h6 class="m-0 font-weight-bold text-primary">Presss
										Release</h6>
								</div>

								<div class="card-body">

									<!-- Circle Buttons (Default) -->

									<div class="mb-2">
										<a
											href="http://localhost:8080/dragonproject/studio2/www.studiodragon.net/front/kr/pr/news.jsp">tvn
											토일 드라마 호텔델루나 </a>
									</div>

									<div class="mt-4 mb-2">
										<a
											href="http://localhost:8080/dragonproject/studio2/www.studiodragon.net/front/kr/pr/news.jsp">tvn월화
											드라마 60,지정 생존자 </a>
									</div>
									<hr></hr>

									<div class="mt-4 mb-2">
										<a
											href="http://localhost:8080/dragonproject/studio2/www.studiodragon.net/front/kr/pr/news.jsp">tvn
											토일드라마 사랑의 불시착 </a>

									</div>
									<hr></hr>

									<div class="mt-4 mb-2">
										<a
											href="http://localhost:8080/dragonproject/studio2/www.studiodragon.net/front/kr/pr/news.jsp">ocn
											토일 시청률 최고 </a>
									</div>
									<hr></hr>

									<div class="mt-4 mb-2">
										<a
											href="http://localhost:8080/dragonproject/studio2/www.studiodragon.net/front/kr/pr/news.jsp">tvn
											검블유 </a>
									</div>
								</div>

							</div>

						</div>
						<!-- /.container-fluid -->

					</div>
					<!-- End of Main Content -->

				</div>
				<!-- End of Content Wrapper -->

			</div>
			<!-- End of Page Wrapper -->

			<!-- Scroll to Top Button-->
			<a class="scroll-to-top rounded" href="#page-top"> <i
				class="fas fa-angle-up"></i>
			</a>

			<!-- Logout Modal-->
			<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
				aria-labelledby="exampleModalLabel" aria-hidden="true">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h5 class="modal-title" id="exampleModalLabel">Ready to
								Leave?</h5>
							<button class="close" type="button" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">×</span>
							</button>
						</div>
						<div class="modal-body">Select "Logout" below if you are
							ready to end your current session.</div>
						<div class="modal-footer">
							<button class="btn btn-secondary" type="button"
								data-dismiss="modal">Cancel</button>
							<a class="btn btn-primary" href="login.jsp">Logout</a>
						</div>
					</div>
				</div>
			</div>

			<!-- Bootstrap core JavaScript-->
			<script src="../../Vender/jquery/jquery.min.js"></script>
			<script src="../../Vender/bootstrap/js/bootstrap.bundle.min.js"></script>

			<!-- Core plugin JavaScript-->
			<script src="../../Vender/jquery-easing/jquery.easing.min.js"></script>

			<!-- Custom scripts for all pages-->
			<script src="../../js/Admin/sb-admin-2.min.js"></script>

			<!-- Page level plugins -->
			<script src="../../Vender/chart.js/Chart.min.js"></script>

			<!-- Page level custom scripts -->
			<script src="../../js/Admin/demo/chart-area-demo.js"></script>
			<script src="../../js/Admin/demo/chart-pie-demo.js"></script>
</body>

</html>