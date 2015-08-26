package curso.microforum.jee.spring;
 
import java.util.ArrayList;
import java.util.List;
 
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
 
@Controller
public class AlumnoController {
 
    
    @RequestMapping(path = "/alumno", method = RequestMethod.GET)
    public String newRegistration(ModelMap model) {
    	Alumno student = new Alumno();
        model.addAttribute("alumno", student);
        return "formularioalumno";
    }
 
  
    @RequestMapping(path = "/alumno", method = RequestMethod.POST)
    public String saveRegistration(@Valid Alumno student, BindingResult result, ModelMap model){
    	String msj = "exito";
    	
        if(result.hasErrors()) //si hay errores, volvemos al formulario
        	{
                msj = "formularioalumno";
        	}
        else {
        	model.addAttribute("msjconfirmacion", "Se�or/a "+ student.getFirstName()+" , su registro se ha completado!");
            System.out.println(student.toString());
        	
        }
 
        
        return msj;
    }
 
    
    /*
     * 
     */
    @ModelAttribute("asignaturas")
    public List<String> initializeSubjects() {
 
        List<String> subjects = new ArrayList<String>();
        subjects.add("Programaci�n funcional");
        subjects.add("Programaci�n l�gica");
        subjects.add("Bases de datos multidimensionales");
        subjects.add("Bases de datos no relacionales");
        subjects.add("Sistemas distru�dos");
        subjects.add("Estructura de computadores");
        subjects.add("Compiladores");
        subjects.add("Dise�o de software avanzado");
        return subjects;
    }
 
}