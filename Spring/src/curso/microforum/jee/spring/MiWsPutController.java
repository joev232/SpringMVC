package curso.microforum.jee.spring;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MiWsPutController {
	
	
	@RequestMapping(path = "/personaJSONPUT", produces="application/json", method=RequestMethod.PUT, consumes="application/json")
	@ResponseBody
	public ResponseEntity<Persona> personaJSONPut(@RequestBody Persona p) {
	//@RequestBody  la informacion con la q viaja esta en el body q representa la persona
	//clase  Persona  bean con atributos constructor x defecto 
		System.out.println(p.toString());
		//ResponseEntity saco =devuelvo json q formara parte del body  ---HttpStatus es de tipo enumerado
		return new ResponseEntity<Persona>(p, HttpStatus.OK);
		//no se puede redirigir a una pagina
	}
	

}
