<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Confirmaci�n</title>
</head>
<body>
    <div class="success">
        Confirmaci�n : ${msjconfirmacion}
        <br>
        En 3 d�as recibir� un correo en ${alumno.email}.
    </div>
</body>
</html>