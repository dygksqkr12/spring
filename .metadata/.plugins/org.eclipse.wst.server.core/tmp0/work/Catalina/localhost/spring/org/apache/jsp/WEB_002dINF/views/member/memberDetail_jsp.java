/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.44
 * Generated at: 2021-05-21 11:31:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.spring.member.model.vo.Member;
import java.util.*;

public final class memberDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1621235343656L));
    _jspx_dependants.put("jar:file:/D:/Workspaces/spring_workspace/hello-spring/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fmt.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("jar:file:/D:/Workspaces/spring_workspace/hello-spring/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fn.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("jar:file:/D:/Workspaces/spring_workspace/hello-spring/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.spring.member.model.vo.Member");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("회원정보", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("div#update-container{width:400px; margin:0 auto; text-align:center;}\r\n");
      out.write("div#update-container input, div#update-container select {margin-bottom:10px;}\r\n");
      out.write("</style>\r\n");
      out.write("<div id=\"update-container\">\r\n");
      out.write("\t<form name=\"memberUpdateFrm\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/memberUpdate.do\" method=\"post\">\r\n");
      out.write("\t\t<input type=\"text\" class=\"form-control\" placeholder=\"아이디 (4글자이상)\" name=\"id\" id=\"id\" readonly required/>\r\n");
      out.write("\t\t<input type=\"text\" class=\"form-control\" placeholder=\"이름\" name=\"name\" id=\"name\" required/>\r\n");
      out.write("\t\t<input type=\"date\" class=\"form-control\" placeholder=\"생일\" name=\"date\" id=\"date\"/>\r\n");
      out.write("\t\t<input type=\"email\" class=\"form-control\" placeholder=\"이메일\" name=\"email\" id=\"email\" required/>\r\n");
      out.write("\t\t<input type=\"tel\" class=\"form-control\" placeholder=\"전화번호 (예:01012345678)\" name=\"phone\" id=\"phone\" maxlength=\"11\" required/>\r\n");
      out.write("\t\t<input type=\"text\" class=\"form-control\" placeholder=\"주소\" name=\"address\" id=\"address\"/>\r\n");
      out.write("\t\t<select class=\"form-control\" name=\"gender\" required>\r\n");
      out.write("\t\t  <option value=\"\" disabled selected>성별</option>\r\n");
      out.write("\t\t  <option value=\"M\">남</option>\r\n");
      out.write("\t\t  <option value=\"F\">여</option>\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\t<div class=\"form-check-inline form-check\">\r\n");
      out.write("\t\t\t취미 : &nbsp; \r\n");
      out.write("\t\t\t<input type=\"checkbox\" class=\"form-check-input\" name=\"hobby\" id=\"hobby0\" value=\"운동\">\r\n");
      out.write("\t\t\t<label for=\"hobby0\" class=\"form-check-label\" >운동</label>&nbsp;\r\n");
      out.write("\t\t\t<input type=\"checkbox\" class=\"form-check-input\" name=\"hobby\" id=\"hobby1\" value=\"등산\">\r\n");
      out.write("\t\t\t<label for=\"hobby1\" class=\"form-check-label\" >등산</label>&nbsp;\r\n");
      out.write("\t\t\t<input type=\"checkbox\" class=\"form-check-input\" name=\"hobby\" id=\"hobby2\" value=\"독서\">\r\n");
      out.write("\t\t\t<label for=\"hobby2\" class=\"form-check-label\" >독서</label>&nbsp;\r\n");
      out.write("\t\t\t<input type=\"checkbox\" class=\"form-check-input\" name=\"hobby\" id=\"hobby3\" value=\"게임\">\r\n");
      out.write("\t\t\t<label for=\"hobby3\" class=\"form-check-label\" >게임</label>&nbsp;\r\n");
      out.write("\t\t\t<input type=\"checkbox\" class=\"form-check-input\" name=\"hobby\" id=\"hobby4\" value=\"여행\">\r\n");
      out.write("\t\t\t<label for=\"hobby4\" class=\"form-check-label\" >여행</label>&nbsp;\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<input type=\"submit\" class=\"btn btn-outline-success\" value=\"수정\" >&nbsp;\r\n");
      out.write("\t\t<input type=\"reset\" class=\"btn btn-outline-success\" value=\"취소\">\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/footer.jsp", out, false);
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
