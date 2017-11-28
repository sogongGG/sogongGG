<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String LoginUsername=request.getParameter("LoginUsername");

request.setCharacterEncoding("euc-kr");
Class.forName("com.mysql.jdbc.Driver");
Connection myconn=null;
myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingmall","root","LNiaMelo561248^*");


String name = "select * from administrator where ID =?";

PreparedStatement pst=myconn.prepareStatement(name);
pst.setString(1, LoginUsername);
ResultSet rs=pst.executeQuery();

if(!rs.next()){
	out.println("정보없음");
}
else{
	rs.previous();
	pageContext.forward("admin.jsp");
}


%>


</body>
</html>