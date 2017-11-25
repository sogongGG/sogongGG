<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>

<body>
<%
request.setCharacterEncoding("euc-kr");
String ID=request.getParameter("ID");
String Password=request.getParameter("Password");
String Lastname=request.getParameter("Lastname");
String Firstname=request.getParameter("Firstname");
String year=request.getParameter("year");
String month=request.getParameter("month");
String day=request.getParameter("day");
String Email=request.getParameter("Email");
String Homenum=request.getParameter("Homemun");
String Postnume=request.getParameter("Postnum");
String cellphone=request.getParameter("cellphone");
String cellphone=request.getParameter("cellphone");
Class.forName("com.mysql.jdbc.Driver");
Connection myconn=null;
myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","LNiaMelo561248^*");
//String q1="insert into info values('"+code+"','"+irum+"','"+cellphone+"')";
String q1="insert into info values(?,?,?)";
//Statement st=myconn.createStatement();
PreparedStatement ps=myconn.prepareStatement(q1);
ps.setString(1, code);
ps.setString(2, irum);
ps.setString(3, cellphone);
//st.executeUpdate(q1);
ps.executeUpdate();
out.println("1개 데이터 추가성공");




%>
</body>
</html>