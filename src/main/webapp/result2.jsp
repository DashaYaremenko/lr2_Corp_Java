<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Результат розрахунку</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<h2>Результат</h2>
<ul>
    <c:forEach var="result" items="${results}">
        <li>${result}</li>
    </c:forEach>
</ul>
</body>
</html>
