<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">

  <title>SB Admin2 - Register</title>

  <!-- Custom fonts for this template-->
  <link href="../../vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="../../css/Admin/sb-admin-2.css" rel="stylesheet">

</head>

<body class="bg-gradient-primary">

  <div class="container">

    <div class="card o-hidden border-0 shadow-lg my-5">
		
      <div class="card-body p-0">
        <!-- Nested Row within Card Body -->
        <div class="row">
			<img class="small3_img"  src="../../img/Admin/adminpage/hand.png" alt="이미지">
          <div class="col-lg-7">
            <div class="p-5">
              <div class="text-center">
                <h1 class="h4 text-gray-900 mb-4">Create an Account!</h1>
              </div>
              <form id="frm" class="user" action="MemberSignupAction.do" method = "post">
                
              	<div class="form-group row">
                  <div class="col-sm-12">
                    <input type="text" class="form-control form-control-user" id="UserID" name="UserID" placeholder="ID">
                  </div>
                </div>
                
                <div class="form-group row">
                  <div class="col-sm-12">
                    <input type="password" class="form-control form-control-user" id="UserPW" name="UserPW" placeholder="PW">
                  </div>
                </div>
                
                <div class="form-group row">
                  <div class="col-sm-12">
                    <input type="text" class="form-control form-control-user" id="UserName" name="UserName" placeholder="Name">
                  </div>
                </div>
                
                <div class="form-group">
                  <input type="email" class="form-control form-control-user" id="UserAddress" name="UserAddress" placeholder="Address">
                </div>
                 
                <a href="#" onclick="document.getElementById('frm').submit();" class="btn btn-primary btn-user btn-block">
                  Register Account
                </a>
                <!--<hr>-->
               <!-- <a href="index.jsp" class="btn btn-google btn-user btn-block">
                  <i class="fab fa-google fa-fw"></i> Register with Google
                </a>
                <a href="index.jsp" class="btn btn-facebook btn-user btn-block">
                  <i class="fab fa-facebook-f fa-fw"></i> Register with Facebook
                </a>-->
              </form>
              <hr>
              <div class="text-center">
                <a class="small" href="forgot-password.jsp">Forgot Password?</a>
              </div>
              <div class="text-center">
                <a class="small" href="login.jsp">Already have an account? Login!</a>
              </div>
            </div>
          </div>
        </div>
		  </center>
      </div>
    </div>

  </div>

 <!-- Core plugin JavaScript-->
  <script src="../../vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="../../js/Admin/sb-admin-2.min.js"></script>

  <!-- Page level plugins -->
  <script src="../../vendor/chart.js/Chart.min.js"></script>

  <!-- Page level custom scripts -->
  <script src="../../js/Admin/demo/chart-area-demo.js"></script>
  <script src="../../js/Admin/demo/chart-pie-demo.js"></script>

</body>

</html>