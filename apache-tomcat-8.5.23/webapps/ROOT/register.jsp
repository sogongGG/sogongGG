<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.sql.*" %>
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
String Home=request.getParameter("Homenum");
String Phone=request.getParameter("Phonenum");
int Homenum = Integer.parseInt(Home);
int Phonenum = Integer.parseInt(Phone);
String Postnum = request.getParameter("post1") + request.getParameter("post2");
String addr1=request.getParameter("addr1");
String addr2=request.getParameter("addr2");
String addr3=request.getParameter("addr3");
System.out.println(ID +Password+Lastname+Firstname+year+month+day+Email+Homenum+Phonenum+Postnum+addr1+addr2+addr3);
Class.forName("com.mysql.jdbc.Driver");
Connection myconn=null;
myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingmall","root","LNiaMelo561248^*");
//String q1="insert into info values('"+code+"','"+irum+"','"+cellphone+"')";
String q1="insert into User values(?,?,?,?,?,?,?,?,?)";
//Statement st=myconn.createStatement();
PreparedStatement usertb=myconn.prepareStatement(q1);
usertb.setString(1, ID);
usertb.setString(2, Password);
usertb.setString(3, Lastname);
usertb.setString(4, Firstname);
usertb.setInt(5, Phonenum);
usertb.setString(6, Email);
usertb.setString(7, day);
usertb.setString(8, month);
usertb.setString(9, year);
//st.executeUpdate(q1);
usertb.executeUpdate();

String q2="insert into destination values(?,?,?,?,?,?)";
PreparedStatement destinationtb=myconn.prepareStatement(q2);
destinationtb.setString(1, ID);
destinationtb.setInt(2, Homenum);
destinationtb.setString(3, Postnum);
destinationtb.setString(4, addr1);
destinationtb.setString(5, addr2);
destinationtb.setString(6, addr3);
destinationtb.executeUpdate();


%>
</body>
</html>