
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>What is The code?</h1>
    <form method="POST" action="/result">
        <label>Your Name: <input type="text" name="name"></label>
        <br>
        Favorite Language:
        <br>

        <select name="language">
            <option value="java">Java</option>
            <option value="c">C++</option>
            <option value="python">Python</option>
        </select>
        <br>
        <button>OK</button>
    </form>

</body>
</html>
