//var cuadrados = document.getElementsByTagName('div');
var haycolor1=0; var haycolor2=0;
var color1=null; var color2=null;
var teclanum1="";var teclanum2="";
var contadorgeneral=0;
var startTime=0;
var endTime=0;

var xmlHttp = new XMLHttpRequest();
var startTime = new Date();
tiempoIncial=startTime.getTime();





function cargarpagina() {
	var color = ["blue","red","green","yellow","lightblue"];
	contador0=0;
	contador1=0;
	contador2=0;
	contador3=0;
	contador4=0;

	for (var i=1; i < 21; i++)
	{	
		colorasignado=false;
		while (colorasignado==false) {

			var num=Math.floor((Math.random() * 5));
			console.log("numero : "+num);
			switch(num) {
			case 0:
				contador0=contador0+1;
				if (contador0 < 5) {
					colorasignado=true;
				}
				break;
			case 1:
				contador1=contador1+1;
				if (contador1 < 5) {
					colorasignado=true;
				}
				break;
			case 2:
				contador2=contador2+1;
				if (contador2 < 5) {
					colorasignado=true;
				}
				break;
			case 3:
				contador3=contador3+1;
				if (contador3 < 5) {
					colorasignado=true;
				}
				break;
			case 4:
				contador4=contador4+1;
				if (contador4 < 5) {
					colorasignado=true;
				}
				break;
			}	
		}	
		document.getElementById("div"+i).style.backgroundColor = color[num];	
	}

	var operaciones = document.getElementsByClassName('operaciones');
	for (var i=0; i < operaciones.length; i++)
	{
		operaciones[i].addEventListener("click", leerclick);	
	}
}

function leerclick(e){		
	var teclanum=e.target.id;
	var tiempoTotal=0;
	myDivObj = document.getElementById(teclanum);		
	if (haycolor1==0) {
		color1=document.defaultView.getComputedStyle(myDivObj,null).getPropertyValue("background-color");
		teclanum1=teclanum;
		haycolor1=1;
	} else  {
		color2=document.defaultView.getComputedStyle(myDivObj,null).getPropertyValue("background-color");
		haycolor2=1;
		teclanum2=teclanum;
	}			
	if (color1==color2) {
		//alert("Enorabuena has acertado color");
		contadorgeneral=contadorgeneral+1;
		haycolor1=0;haycolor2=0;
		document.getElementById(teclanum1).style.backgroundColor = "white";
		document.getElementById(teclanum2).style.backgroundColor = "white";
		if (contadorgeneral==10) {
			alert(" campeon has realizado el ejercicio");
			//tiempo 
			var endTime = new Date();
			tiempoFinal=endTime.getTime();
			tiempoTotal=(tiempoFinal-tiempoIncial);
			//alert("ddd" +tiempoTotal);

			llamadaRest(tiempoTotal);
			//eliminare tabla

			//alert("Has tardado web:"+tiempoTotal);
			//cargarpagina();
		}


	} else {
		if (haycolor2==1) {
			alert("burro no has acertado el color");
			haycolor1=0;haycolor2=0;
		}
	}

}

	function llamadaRest(tiempoTotal)
	{
	//xmlHttp.onreadystatechange = procesarEvento;
	xmlHttp.open('GET', '../registrar?tiempoTotal='+tiempoTotal, true); //indicamos como vamos a enviar los datos, en este caso con el metodo GET al archivo meses.php?num= el valor que le indiquemos en el textbox
	xmlHttp.setRequestHeader('Accept', 'application/json');
	xmlHttp.send(null);
	alert("Has tardado web:"+tiempoTotal);
	}

//
//function procesarEvento()
//{
//
//}
