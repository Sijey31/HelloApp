<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 28/05/18
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="custom.css" rel="stylesheet" type="text/css">
</head>
<body>
    <h1>Seconde page</h1>
    <h2>Allez les bleus !!</h2>

<p><%
    String sample = (String) request.getAttribute("sample");
    out.println(sample);
%></p>

</body>
</html>
