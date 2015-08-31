<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script type="text/javascript">

var xmlHttp = new XMLHttpRequest();

function llamadaRest()
{
	xmlHttp.onreadystatechange = procesarEvento;
	xmlHttp.open('GET', 'dniJSON?', true);
	xmlHttp.send(null);
	
}

function procesarEvento()
{
   
  if(xmlHttp.readyState==4) //ya hemos recibido respuesta del servidor
  {
      if(xmlHttp.status==200)// y el código de la cabecera http es bueno
          {
    	  	muestraDNILETRA(xmlHttp.responseText);
          }
      else
      {
          alert("Ha ocurrido un error"+ xmlHttp.status +":"+ xmlHttp.statusText);
      }
  }

}

function muestraDNILETRA(texto)
{
	alert("He recibido " + texto);
	var numerodni = xmlHttp.responseText;
	int numdni = Integer.parseInt(numerodni);
	int	restodivision = numdni%23;
    //out.println("contenido de restodivision =  "+restodivision);
    String letradni = "";
    switch (restodivision) {
    case 0:
    	letradni="T";
    	break;
    case 1:
    	letradni="R";
    	break;
    case 2:
    	letradni="W";
    	break;
    case 3:
    	letradni="A";
    	break;
    case 4:
    	letradni="G";
    	break;
    case 5:
    	letradni="M";
    	break;
    case 6:
    	letradni="Y";
    	break;
    case 7:
    	letradni="F";
    	break;
    case 8:
    	letradni="P";
    	break;
    case 9:
    	letradni="D";
    	break;
    case 10:
    	letradni="X";
    	break;
    case 11:
    	letradni="B";
    	break;
    case 12:
    	letradni="N";
    	break;
    case 13:
    	letradni="J";
    	break;
    case 14:
    	letradni="Z";
    	break;
    case 15:
    	letradni="S";
    	break;
    case 16:
    	letradni="Q";
    	break;
    case 17:
    	letradni="V";
    	break;
    case 18:
    	letradni="H";
    	break;
    case 19:
    	letradni="L";
    	break;
    case 20:
    	letradni="C";
    	break;
    case 21:
    	letradni="K";
    	break;
    case 22:
    	letradni="E";
    	break;
    }
	document.getElementById("letradni").value = letradni;
	
	
	
}
</script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Obtener Letra de un DNI</title>
</head>
<body>
     <form action="/datosdni" method="get">
     <h3>Introduce tu DNI:</h3>
	<input type="text" name="numerodni"/>
	<input type="text" name="letradni"/>	
	<input type="submit" onclick="llamadaRest();" value ="enviar"/>	

</form>
</body>
</html>