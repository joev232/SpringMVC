<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "ht://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" type="text/css" href="./css/estilo.css">
    <title>Formulario Persona</title>
</head>
<body>

 <h1>Formulario Persona</h1>
 
 
 <a href="persona?idioma=es"><img alt="Bandera española" src="imagenes/be.jpg"></a>
<a href="persona?idioma=it"><img alt="Bandera italiano" src="imagenes/bv.png"></a>
<a href="persona?idioma=en"><img alt="Bandera ingles" src="imagenes/buk.jpg"></a>
 
 
<form:form method="POST" modelAttribute="persona" enctype="multipart/form-data">
	
	
				<label for="nombre"> <spring:message code="formnombre"></spring:message></label>
                <form:input type="text" path="nombre" id="nombre"/>
                <form:errors path="nombre" class="errorsp"/><br><br>
                
                <label for="edad"><spring:message code="formedad"></spring:message></label>
                <form:input type="text" path="edad" id="edad" />
                <form:errors path="edad" class="errorsp"/><br><br>
                
                <label for="descripcion"><spring:message code="formdesc"></spring:message></label>
                <form:input type="text" path="descripcion" id="descripcion" />
                <form:errors path="descripcion" class="errorsp"/><br><br>
                
                <label for="foto"> <spring:message code="formfoto"></spring:message> </label>
                <form:input type="file" path="foto" name="foto" multiple="multiple" />
                <form:errors path="foto" class="errorsp"/><br><br>
                
                <label for="dni"><spring:message code="dni"></spring:message></label>
                <form:input type="text" path="dni" id="dni" />
                <form:errors path="dni" class="errorsp"/>
                <input type="text" path="letra" id="letra" /><br><br>
                
				<input type="submit" value="Registro" >
</form:form>

</body>
</html>