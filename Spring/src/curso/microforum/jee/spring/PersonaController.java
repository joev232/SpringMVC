package curso.microforum.jee.spring;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PersonaController {

	
    @RequestMapping(path = "/persona", method = RequestMethod.GET)
    public String newRegistration(ModelMap model) {
    	Persona person = new Persona();
        model.addAttribute("persona", person);
        return "formulariopersona";
    }
	
	
    @RequestMapping(path = "/persona", method = RequestMethod.POST)
    public String saveRegistration(@Valid Persona person, BindingResult result, ModelMap model){
    	String msj = "exito";
    	
        if(result.hasErrors()) //si hay errores, volvemos al formulario
        	{
                msj = "formulariopersona";
        	}
        else {
        	model.addAttribute("msjconfirmacion", "Señor/a "+ person.getNombre()+" , su registro se ha completado!");
            System.out.println(person.toString());
        	
        }
 
        
        return msj;
    }
    
    
}
