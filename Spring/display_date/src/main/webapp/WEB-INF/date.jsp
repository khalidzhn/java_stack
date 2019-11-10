<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" type="text/css" href="../../resources/static/css/style.css">
    <script type="text/javascript" src="../../resources/static/js/app.js"></script>
</head>
<body>

<h1><fmt:formatDate value="${date}" pattern="EEEE, 'the' d 'of' MMMM, yyyy" /></h1>
<a href="/">Back</a>

</body>
</html>
