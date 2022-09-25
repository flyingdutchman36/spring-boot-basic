<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     <h1>Welcome to ${sname}</h1>
  
     name: ${joker.name} <br>
     weight: ${joker.weight} <br>
     foot size: ${joker.footSize} <br><hr>
     
     <c:if test = "${joker.weight>50 }">
     so fat
     </c:if>
     <br>
     <c:if test = "${joker.name!='' }">
     values = ${joker.name }
     </c:if>

     
     <img src="../mcgill-library-osPrIcTwJy4-unsplash.jpg" width="300 px" height="300 px">
</body>
</html>