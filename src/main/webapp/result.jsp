<%@ page contentType="text/html; charset=UTF-8"  %>
<!DOCTYPE html>
<html lang="uk">
<head>
  <meta charset="UTF-8">
  <title>Результат розрахунку</title>
  <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<h2>Результат</h2>
<form>
<p>Сума n доданків: ${nSum}</p>
<p>Сума членів ряду, більших за e1: ${e1Sum}</p>
<p>Кількість доданків, більших за e1: ${e1Count}</p>
<p>Сума членів ряду, більших за e2: ${e2Sum}</p>
<p>Кількість доданків, більших за e2: ${e2Count}</p>
<p>Точне значення: ${exactVal}</p>
  <a href="index2.jsp">
    <button type="button">До 2-го завдання</button>
  </a>
</form>
</body>
</html>

