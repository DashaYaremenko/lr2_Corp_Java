<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Калькулятор для розрахунку</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<h1>Калькулятор для розрахунку</h1>
<div>Введіть значення:</div>
<form action="hello-servlet" method="post">
    <label for="x">Введіть x (double):</label>
    <input type="text" id="x" name="x" value="2.0"><br>

    <label for="n">Введіть n (int):</label>
    <input type="text" id="n" name="n" value="15"><br>

    <label for="e1">Введіть e1 (double):</label>
    <input type="text" id="e1" name="e1" value="0.01"><br>

    <label for="e2">Введіть e2 (double):</label>
    <input type="text" id="e2" name="e2" value="0.001"><br>

    <button type="submit">Розрахувати</button>
</form>
</body>
</html>
