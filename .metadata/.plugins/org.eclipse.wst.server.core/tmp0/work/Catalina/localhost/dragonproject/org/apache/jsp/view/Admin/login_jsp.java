/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2019-08-29 05:39:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("  <title>SB Admin2 - Login</title>\n");
      out.write("\n");
      out.write("  <!-- Custom fonts for this template-->\n");
      out.write("  <link href=\"../../Vender/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Custom styles for this template-->\n");
      out.write("  <link href=\"../../css/Admin/sb-admin-2.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"bg-gradient-primary\">\n");
      out.write("\n");
      out.write("  <div class=\"container\">\n");
      out.write("\n");
      out.write("    <!-- Outer Row -->\n");
      out.write("    <div class=\"row justify-content-center\">\n");
      out.write("\n");
      out.write("      <div class=\"col-xl-10 col-lg-12 col-md-9\">\n");
      out.write("\n");
      out.write("        <div class=\"card o-hidden border-0 shadow-lg my-5\">\n");
      out.write("          <div class=\"card-body p-0\">\n");
      out.write("            <!-- Nested Row within Card Body -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("             <!-- <div class=\"col-lg-6 d-none d-lg-block bg-login-image\"></div>-->\n");
      out.write("\t\t\t\t<div class=\"sidebar-brand-icon rotate-n-15\">\n");
      out.write("\t\t\t\t\t<center>\n");
      out.write("          <img class=\"small3_img\" src=\"../../img/Admin/adminpage/hand.png\" alt=\"이미지\">\n");
      out.write("\t\t\t\t\t</center></div>\n");
      out.write("              <div class=\"col-lg-6\">\n");
      out.write("                <div class=\"p-5\">\n");
      out.write("                  <div class=\"text-center\">\n");
      out.write("                    <h1 class=\"h4 text-gray-900 mb-4\">Welcome Back!</h1>\n");
      out.write("                  </div>\n");
      out.write("                  <form id=\"frm\" class=\"user\" action=\"MemberLoginAction.do\" method = \"post\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                      <input type=\"email\" class=\"form-control form-control-user\" name=\"exampleInputEmail\" id=\"exampleInputEmail\" aria-describedby=\"emailHelp\" placeholder=\"Enter Email Address...\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                      <input type=\"password\" class=\"form-control form-control-user\" name=\"exampleInputPassword\" id=\"exampleInputPassword\" placeholder=\"Password\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                      <div class=\"custom-control custom-checkbox small\">\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"customCheck\">\n");
      out.write("                        <label class=\"custom-control-label\" for=\"customCheck\">Remember Me</label>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"#\" onclick=\"document.getElementById('frm').submit();\" class=\"btn btn-primary btn-user btn-block\">\n");
      out.write("                      Login\n");
      out.write("                    </a>\n");
      out.write("                    <!--<hr>-->\n");
      out.write("                   <!-- <a href=\"index.jsp\" class=\"btn btn-google btn-user btn-block\">\n");
      out.write("                      <i class=\"fab fa-google fa-fw\"></i> Login with Google\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"index.jsp\" class=\"btn btn-facebook btn-user btn-block\">\n");
      out.write("                      <i class=\"fab fa-facebook-f fa-fw\"></i> Login with Facebook\n");
      out.write("                    </a>-->\n");
      out.write("                  </form>\n");
      out.write("               <!--   <hr>-->\n");
      out.write("                  <div class=\"text-center\">\n");
      out.write("                    <a class=\"small\" href=\"forgot-password.jsp\">Forgot Password?</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"text-center\">\n");
      out.write("                    <a class=\"small\" href=\"register.jsp\">Create an Account!</a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write(" <!-- Core plugin JavaScript-->\n");
      out.write("  <script src=\"../../Vender/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Custom scripts for all pages-->\n");
      out.write("  <script src=\"../../js/Admin/sb-admin-2.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Page level plugins -->\n");
      out.write("  <script src=\"../../Vender/chart.js/Chart.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Page level custom scripts -->\n");
      out.write("  <script src=\"../../js/Admin/demo/chart-area-demo.js\"></script>\n");
      out.write("  <script src=\"../../js/Admin/demo/chart-pie-demo.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
