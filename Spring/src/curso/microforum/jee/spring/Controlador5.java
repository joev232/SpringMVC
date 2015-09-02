package curso.microforum.jee.spring;
import java.io.IOException;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

 
@Controller
public class Controlador5 {
	
	private String obtenLetra (String numerodni) 
	{
		String letra = null;
		long ndni = 0;
		int modulo = 0;
		String juegoCaracteres = null;
		
		ndni = Long.parseLong(numerodni); //paso el dni de cadena a número
		juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKET";//esta es la lista de letras empleada
	    modulo= (int)ndni % 23;//calculo el módulo
	    letra = ""+juegoCaracteres.charAt(modulo);//la letra correspondiente a ese número, transformada a String
		
		return letra;
	}
	
	@RequestMapping(path = "/calculaLetraDni", method = RequestMethod.GET)
	@ResponseBody
	public String calculaLetraDni (@RequestParam(value="dni", required=true) String dni,HttpServletResponse respuesta) {	 
		String letra = null;
		
		letra = obtenLetra(dni);
		respuesta.setHeader("Access-Control-Allow-Origin", "*");
		
		return letra;
	}
	
}