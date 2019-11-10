<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
    <title>time</title>
</head>
<body>
<h1> <fmt:formatDate value="${time}" pattern="h:mm a" /></h1>
<a href="/">Back</a>

</body>
</html>
