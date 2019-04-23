<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div width="200px" align="left" style=" border-color: blue;">
	卡号：${username } <a href="login.jsp">退出登录</a><br><br><br>
	
	<a target="tt" href="balance.jsp">查询余额</a><br>
	<a target="tt" href="Transfer.jsp">转账</a><br>
	<a target="tt" href="main.jsp">查询交易记录</a><br>
	<a target="tt" href="amend.jsp">修改密码</a>
	
	<div style="right: 10" align="center">
	<iframe name="tt" src="main.jsp" frameBorder="1" width="80%" scrolling="yes" height="800px">
	
	
	</iframe>
	
	
	</div>
	
	</div>

</body>
</html>