/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2017-11-28 13:14:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_002dlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("author: W3layouts\r\n");
      out.write("author URL: http://w3layouts.com\r\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>소공 5조-강산,치종,정훈</title>\r\n");
      out.write("<!-- for-mobile-apps -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"Grocery Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template,\r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\r\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\"  href=\"/images/sg.ico\"/>\r\n");
      out.write("<!-- //for-mobile-apps -->\r\n");
      out.write("<link href=\"css/bootstrap.css?ver=3\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href=\"css/style.css?ver=3\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!-- font-awesome icons -->\r\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!-- //font-awesome icons -->\r\n");
      out.write("<!-- js -->\r\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<!-- //js -->\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Ubuntu:400,300,300italic,400italic,500,500italic,700,700italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("<!-- start-smoth-scrolling -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tjQuery(document).ready(function($) {\r\n");
      out.write("\t\t$(\".scroll\").click(function(event){\r\n");
      out.write("\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<!-- start-smoth-scrolling -->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!-- header -->\r\n");
      out.write("\t<div class=\"agileits_header\">\r\n");
      out.write("\t\t<div class=\"w3l_offers\" style=\"margin-top: 8px;\">\r\n");
      out.write("\t\t\t<a href=\"products.jsp\">5조 쇼핑몰</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"w3l_search\" style=\"margin-top: 10px;\">\r\n");
      out.write("\t\t\t<form action=\"#\" method=\"post\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"Product\" value=\"물품 검색\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Search a product...';}\" required=\"\">\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\" \">\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"product_list_header\" style=\"padding-right: 2em;margin-top: 8px;\">\r\n");
      out.write("\t\t\t<form action=\"#\" method=\"post\" class=\"last\">\r\n");
      out.write("                <fieldset>\r\n");
      out.write("                    <input type=\"hidden\" name=\"cmd\" value=\"_cart\" />\r\n");
      out.write("                    <input type=\"hidden\" name=\"display\" value=\"1\" />\r\n");
      out.write("                    <input type=\"submit\" name=\"submit\" value=\"장바구니 보기\" class=\"button\" />\r\n");
      out.write("                </fieldset>\r\n");
      out.write("            </form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"form\">\r\n");
      out.write("      <fieldset>\r\n");
      out.write("\t\t      <form action'#' method=\"post\" style=\"margin-top: 20px;\">\r\n");
      out.write("\t\t\t         <div class=\"User\">\r\n");
      out.write("                 <ul style=\"margin-top: 8px;\">\r\n");
      out.write("                   <li style=\"display: inline-block; padding-right: 25px;\"> Username님 안녕하세요? </li>\r\n");
      out.write("                   <li style=\"display: inline-block; padding-right: 25px;\">\r\n");
      out.write("                     <i class=\"fa fa-user\" aria-hidden=\"true\"> </i>\r\n");
      out.write("                     <a href=\"#\">MyPage</a>\r\n");
      out.write("                   </li>\r\n");
      out.write("                   <li style=\"display: inline-block;\">\r\n");
      out.write("                     <input type=\"submit\" value=\"Logout\" style=\"padding-bottom: 1px;\">\r\n");
      out.write("                      \r\n");
      out.write("                     </li>\r\n");
      out.write("                   </ul>\r\n");
      out.write("                 </div>\r\n");
      out.write("               </form>\r\n");
      out.write("      </fieldset>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<!-- script-for sticky-nav -->\r\n");
      out.write("\t<script>\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t var navoffeset=$(\".agileits_header\").offset().top;\r\n");
      out.write("\t\t $(window).scroll(function(){\r\n");
      out.write("\t\t\tvar scrollpos=$(window).scrollTop();\r\n");
      out.write("\t\t\tif(scrollpos >=navoffeset){\r\n");
      out.write("\t\t\t\t$(\".agileits_header\").addClass(\"fixed\");\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$(\".agileits_header\").removeClass(\"fixed\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t });\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("<!-- //script-for sticky-nav -->\r\n");
      out.write("\t<div class=\"logo_products\" style=\"padding-top: 80px;\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"w3ls_logo_products_left\">\r\n");
      out.write("\t\t\t\t<h1><a href=\"index.jsp\"><span>Grocery</span> Store</a></h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"w3ls_logo_products_left1\">\r\n");
      out.write("\t\t\t\t<ul class=\"special_items\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"events.jsp\">모든 상품</a><i>/</i></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"about.jsp\">요리</a><i>/</i></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"products.jsp\">재료</a><i>/</i></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"services.jsp\">마트</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"w3ls_logo_products_left1\">\r\n");
      out.write("\t\t\t\t<ul class=\"phone_email\">\r\n");
      out.write("\t\t\t\t\t<li><i class=\"fa fa-phone\" aria-hidden=\"true\"></i>(+0123) 234 567</li>\r\n");
      out.write("\t\t\t\t\t<li><i class=\"fa fa-envelope-o\" aria-hidden=\"true\"></i><a href=\"mailto:store@grocery.com\">store@grocery.com</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<!-- //header -->\r\n");
      out.write("<!-- banner -->\r\n");
      out.write("\t<div class=\"banner\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"w3l_banner_nav_center\">\r\n");
      out.write("\t\t\t<section class=\"slider\">\r\n");
      out.write("\t\t\t\t<div class=\"flexslider\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"slides\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w3l_banner_nav_right_banner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>Make your <span>food</span> with Spicy.</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"more\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"products.jsp\" class=\"button--saqui button--round-l button--text-thick\" data-text=\"Shop now\">Shop now</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w3l_banner_nav_right_banner1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>Make your <span>food</span> with Spicy.</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"more\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"products.jsp\" class=\"button--saqui button--round-l button--text-thick\" data-text=\"Shop now\">Shop now</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w3l_banner_nav_right_banner2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>upto <i>50%</i> off.</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"more\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"products.jsp\" class=\"button--saqui button--round-l button--text-thick\" data-text=\"Shop now\">Shop now</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t<!-- flexSlider -->\r\n");
      out.write("\t\t\t\t<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" property=\"\" />\r\n");
      out.write("\t\t\t\t<script defer src=\"js/jquery.flexslider.js\"></script>\r\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t$(window).load(function(){\r\n");
      out.write("\t\t\t\t  $('.flexslider').flexslider({\r\n");
      out.write("\t\t\t\t\tanimation: \"slide\",\r\n");
      out.write("\t\t\t\t\tstart: function(slider){\r\n");
      out.write("\t\t\t\t\t  $('body').removeClass('loading');\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t  });\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t  </script>\r\n");
      out.write("\t\t\t<!-- //flexSlider -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<!-- banner -->\r\n");
      out.write("<!-- top-brands -->\r\n");
      out.write("\t<div class=\"top-brands\" style=\"margin-top: 1em;\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<h3>오늘의 추천 레시피!!</h3>\r\n");
      out.write("\t\t\t<div class=\"agile_top_brands_grids\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 top_brand_left\">\r\n");
      out.write("\t\t\t\t\t<div class=\"hover14 column\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"agile_top_brand_left_grid\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"agile_top_brand_left_grid1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<figure>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"snipcart-item block\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"snipcart-thumb\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"single.jsp\"><img title=\" \" alt=\" \" src=\"images/1.png\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>fortune sunflower oil</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("        <div class=\"col-md-8 agileinfo_single_right\" style=\"padding-left: 40px;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"rating1\">\r\n");
      out.write("            <h4> 맛\r\n");
      out.write("\t\t\t\t\t\t<span class=\"starRating\">\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"rating5\" type=\"radio\" name=\"rating\" value=\"5\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"rating5\">5</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"rating4\" type=\"radio\" name=\"rating\" value=\"4\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"rating4\">4</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"rating3\" type=\"radio\" name=\"rating\" value=\"3\" checked>\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"rating3\">3</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"rating2\" type=\"radio\" name=\"rating\" value=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"rating2\">2</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"rating1\" type=\"radio\" name=\"rating\" value=\"1\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"rating1\">1</label>\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("          </h4>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("          <div class=\"rating1\">\r\n");
      out.write("            가격\r\n");
      out.write("\t\t\t\t\t\t<span class=\"starRating\">\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"rating5\" type=\"radio\" name=\"rating\" value=\"5\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"rating5\">5</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"rating4\" type=\"radio\" name=\"rating\" value=\"4\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"rating4\">4</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"rating3\" type=\"radio\" name=\"rating\" value=\"3\" checked>\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"rating3\">3</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"rating2\" type=\"radio\" name=\"rating\" value=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"rating2\">2</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"rating1\" type=\"radio\" name=\"rating\" value=\"1\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"rating1\">1</label>\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("          <div class=\"rating1\">\r\n");
      out.write("            난이도\r\n");
      out.write("\t\t\t\t\t\t<span class=\"starRating\">\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"rating5\" type=\"radio\" name=\"rating\" value=\"5\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"rating5\">5</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"rating4\" type=\"radio\" name=\"rating\" value=\"4\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"rating4\">4</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"rating3\" type=\"radio\" name=\"rating\" value=\"3\" checked>\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"rating3\">3</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"rating2\" type=\"radio\" name=\"rating\" value=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"rating2\">2</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"rating1\" type=\"radio\" name=\"rating\" value=\"1\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"rating1\">1</label>\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"w3agile_description\">\r\n");
      out.write("\t\t\t\t\t\t<h4>Description :</h4>\r\n");
      out.write("\t\t\t\t\t\t<p>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui\r\n");
      out.write("\t\t\t\t\t\t\tofficia deserunt mollit anim id est laborum.Duis aute irure dolor in\r\n");
      out.write("\t\t\t\t\t\t\treprehenderit in voluptate velit esse cillum dolore eu fugiat nulla\r\n");
      out.write("\t\t\t\t\t\t\tpariatur.</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("          <div class=\"snipcart-item block\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"snipcart-thumb agileinfo_single_right_snipcart\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>$21.00 <span>$25.00</span></h4>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"snipcart-details agileinfo_single_right_details\">\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"#\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"cmd\" value=\"_cart\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"add\" value=\"1\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"business\" value=\" \" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"item_name\" value=\"pulao basmati rice\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"amount\" value=\"21.00\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"discount_amount\" value=\"1.00\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"currency_code\" value=\"USD\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"return\" value=\" \" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"cancel_return\" value=\" \" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" name=\"submit\" value=\"Add to cart\" class=\"button\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<!-- //top-brands -->\r\n");
      out.write("<!-- fresh-vegetables -->\r\n");
      out.write("\t<div class=\"fresh-vegetables\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<h3>Top Products</h3>\r\n");
      out.write("\t\t\t<div class=\"w3l_fresh_vegetables_grids\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3l_fresh_vegetables_grid w3l_fresh_vegetables_grid_left\">\r\n");
      out.write("\t\t\t\t\t<div class=\"w3l_fresh_vegetables_grid2\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"fa fa-check\" aria-hidden=\"true\"></i><a href=\"products.jsp\">All Brands</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"fa fa-check\" aria-hidden=\"true\"></i><a href=\"vegetables.jsp\">Vegetables</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"fa fa-check\" aria-hidden=\"true\"></i><a href=\"vegetables.jsp\">Fruits</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"fa fa-check\" aria-hidden=\"true\"></i><a href=\"drinks.jsp\">Juices</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"fa fa-check\" aria-hidden=\"true\"></i><a href=\"pet.jsp\">Pet Food</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"fa fa-check\" aria-hidden=\"true\"></i><a href=\"bread.jsp\">Bread & Bakery</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"fa fa-check\" aria-hidden=\"true\"></i><a href=\"household.jsp\">Cleaning</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"fa fa-check\" aria-hidden=\"true\"></i><a href=\"products.jsp\">Spices</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"fa fa-check\" aria-hidden=\"true\"></i><a href=\"products.jsp\">Dry Fruits</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"fa fa-check\" aria-hidden=\"true\"></i><a href=\"products.jsp\">Dairy Products</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-9 w3l_fresh_vegetables_grid_right\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 w3l_fresh_vegetables_grid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"w3l_fresh_vegetables_grid1\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/8.jpg\" alt=\" \" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 w3l_fresh_vegetables_grid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"w3l_fresh_vegetables_grid1\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w3l_fresh_vegetables_grid1_rel\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/7.jpg\" alt=\" \" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"w3l_fresh_vegetables_grid1_rel_pos\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"more m1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"products.jsp\" class=\"button--saqui button--round-l button--text-thick\" data-text=\"Shop now\">Shop now</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"w3l_fresh_vegetables_grid1_bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/10.jpg\" alt=\" \" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w3l_fresh_vegetables_grid1_bottom_pos\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>Special Offers</h5>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 w3l_fresh_vegetables_grid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"w3l_fresh_vegetables_grid1\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/9.jpg\" alt=\" \" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"w3l_fresh_vegetables_grid1_bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/11.jpg\" alt=\" \" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t<div class=\"agileinfo_move_text\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"agileinfo_marquee\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>get <span class=\"blink_me\">25% off</span> on first order and also get gift voucher</h4>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"agileinfo_breaking_news\">\r\n");
      out.write("\t\t\t\t\t\t\t<span> </span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<!-- //fresh-vegetables -->\r\n");
      out.write("<!-- newsletter -->\r\n");
      out.write("\t<div class=\"newsletter\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"w3agile_newsletter_left\">\r\n");
      out.write("\t\t\t\t<h3>sign up for our newsletter</h3>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"w3agile_newsletter_right\">\r\n");
      out.write("\t\t\t\t<form action=\"#\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<input type=\"email\" name=\"Email\" value=\"Email\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Email';}\" required=\"\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"subscribe now\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<!-- //newsletter -->\r\n");
      out.write("<!-- footer -->\r\n");
      out.write("\t<div class=\"footer\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"col-md-3 w3_footer_grid\">\r\n");
      out.write("\t\t\t\t<h3>information</h3>\r\n");
      out.write("\t\t\t\t<ul class=\"w3_footer_grid_list\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"events.jsp\">Events</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"about.jsp\">About Us</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"products.jsp\">Best Deals</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"services.jsp\">Services</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"short-codes.jsp\">Short Codes</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3 w3_footer_grid\">\r\n");
      out.write("\t\t\t\t<h3>policy info</h3>\r\n");
      out.write("\t\t\t\t<ul class=\"w3_footer_grid_list\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"faqs.jsp\">FAQ</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"privacy.jsp\">privacy policy</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"privacy.jsp\">terms of use</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3 w3_footer_grid\">\r\n");
      out.write("\t\t\t\t<h3>what in stores</h3>\r\n");
      out.write("\t\t\t\t<ul class=\"w3_footer_grid_list\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"pet.jsp\">Pet Food</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"frozen.jsp\">Frozen Snacks</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"kitchen.jsp\">Kitchen</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"products.jsp\">Branded Foods</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"household.jsp\">Households</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3 w3_footer_grid\">\r\n");
      out.write("\t\t\t\t<h3>twitter posts</h3>\r\n");
      out.write("\t\t\t\t<ul class=\"w3_footer_grid_list1\">\r\n");
      out.write("\t\t\t\t\t<li><label class=\"fa fa-twitter\" aria-hidden=\"true\"></label><i>01 day ago</i><span>Non numquam <a href=\"#\">http://sd.ds/13jklf#</a>\r\n");
      out.write("\t\t\t\t\t\teius modi tempora incidunt ut labore et\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">http://sd.ds/1389kjklf#</a>quo nulla.</span></li>\r\n");
      out.write("\t\t\t\t\t<li><label class=\"fa fa-twitter\" aria-hidden=\"true\"></label><i>02 day ago</i><span>Con numquam <a href=\"#\">http://fd.uf/56hfg#</a>\r\n");
      out.write("\t\t\t\t\t\teius modi tempora incidunt ut labore et\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">http://fd.uf/56hfg#</a>quo nulla.</span></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t<div class=\"agile_footer_grids\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3_footer_grid agile_footer_grids_w3_footer\">\r\n");
      out.write("\t\t\t\t\t<div class=\"w3_footer_grid_bottom\">\r\n");
      out.write("\t\t\t\t\t\t<h4>100% secure payments</h4>\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/card.png\" alt=\" \" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3_footer_grid agile_footer_grids_w3_footer\">\r\n");
      out.write("\t\t\t\t\t<div class=\"w3_footer_grid_bottom\">\r\n");
      out.write("\t\t\t\t\t\t<h5>connect with us</h5>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"agileits_social_icons\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"facebook\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"twitter\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"google\"><i class=\"fa fa-google-plus\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"instagram\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"dribbble\"><i class=\"fa fa-dribbble\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"wthree_footer_copy\">\r\n");
      out.write("\t\t\t\t<p>�� 2016 Grocery Store. All rights reserved | Design by <a href=\"http://w3layouts.com/\">W3layouts</a></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<!-- //footer -->\r\n");
      out.write("<!-- Bootstrap Core JavaScript -->\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("    $(\".dropdown\").hover(\r\n");
      out.write("        function() {\r\n");
      out.write("            $('.dropdown-menu', this).stop( true, true ).slideDown(\"fast\");\r\n");
      out.write("            $(this).toggleClass('open');\r\n");
      out.write("        },\r\n");
      out.write("        function() {\r\n");
      out.write("            $('.dropdown-menu', this).stop( true, true ).slideUp(\"fast\");\r\n");
      out.write("            $(this).toggleClass('open');\r\n");
      out.write("        }\r\n");
      out.write("    );\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<!-- here stars scrolling icon -->\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t/*\r\n");
      out.write("\t\t\t\tvar defaults = {\r\n");
      out.write("\t\t\t\tcontainerID: 'toTop', // fading element id\r\n");
      out.write("\t\t\t\tcontainerHoverID: 'toTopHover', // fading element hover id\r\n");
      out.write("\t\t\t\tscrollSpeed: 1200,\r\n");
      out.write("\t\t\t\teasingType: 'linear'\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\t\t*/\r\n");
      out.write("\r\n");
      out.write("\t\t\t$().UItoTop({ easingType: 'easeOutQuart' });\r\n");
      out.write("\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("<!-- //here ends scrolling icon -->\r\n");
      out.write("<script src=\"js/minicart.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t\tpaypal.minicart.render();\r\n");
      out.write("\r\n");
      out.write("\t\tpaypal.minicart.cart.on('checkout', function (evt) {\r\n");
      out.write("\t\t\tvar items = this.items(),\r\n");
      out.write("\t\t\t\tlen = items.length,\r\n");
      out.write("\t\t\t\ttotal = 0,\r\n");
      out.write("\t\t\t\ti;\r\n");
      out.write("\r\n");
      out.write("\t\t\t// Count the number of each item in the cart\r\n");
      out.write("\t\t\tfor (i = 0; i < len; i++) {\r\n");
      out.write("\t\t\t\ttotal += items[i].get('quantity');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (total < 3) {\r\n");
      out.write("\t\t\t\talert('The minimum order quantity is 3. Please add more to your shopping cart before checking out');\r\n");
      out.write("\t\t\t\tevt.preventDefault();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
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
