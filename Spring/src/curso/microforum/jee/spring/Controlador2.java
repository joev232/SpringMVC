package curso.microforum.jee.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Controlador2 {
	
	
	@RequestMapping("/bienvenido2")
    public String holaMundo2(@RequestParam(value="name", required=false, defaultValue="Mundo") String name, Model model) {
        model.addAttribute("name", name);
        return "bienvenido2";
    }


}
