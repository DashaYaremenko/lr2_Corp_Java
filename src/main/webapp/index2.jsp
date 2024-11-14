<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>Калькулятор для 2-го завдання</title>
  <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<h1>Калькулятор для розрахунку</h1>
<div>Введіть значення:</div>
<form action="tabulateServlet" method="post">
  <label for="a">Введіть a (double):</label>
  <input type="text" id="a" name="a" value="1.0"><br>

  <label for="b">Введіть b (double):</label>
  <input type="text" id="b" name="b" value="5.0"><br>

  <label for="h">Введіть h (double):</label>
  <input type="text" id="h" name="h" value="0.5"><br>

  <button type="submit">Розрахувати</button>
</form>
</body>
</html>
