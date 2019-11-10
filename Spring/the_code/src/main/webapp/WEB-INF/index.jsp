
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>What is The code?</h1>
<h2>
     <c:out value="${error}"/>
    <form method="POST" action="/code">
        <label>The code: <input type="text" name="code"></label>
        <button>Try Code</button>
    </form>
</h2>

</body>
</html>
