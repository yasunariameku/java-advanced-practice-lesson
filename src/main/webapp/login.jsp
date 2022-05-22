<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>


<html>
<head>
<meta charset="UTF-8">
<title>入力画面</title>
</head>
<body>

	<c:if test="${not empty result}">
	${result}
	</c:if>

  <form action="loginA" method="post">
    <div>ID: <input type="text" name="id">
    <c:if test="${not empty id}">
	${id}
	</c:if>
    </div>
    
    <div>PASS: <input type="password" name="pass">
    <c:if test="${not empty pass}">
	${pass}
	</c:if>
    </div>
    
    <div><button type="submit">送信</button></div>
    
  </form>

</body>
</html>
