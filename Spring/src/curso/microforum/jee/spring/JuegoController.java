package curso.microforum.jee.spring;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JuegoController {

	
	@RequestMapping("/registrar")
	@ResponseBody
    public ResponseEntity registro(@RequestParam(value="tiempoTotal") String tiempoTotal) {
        
		System.out.println("tiempo :"+tiempoTotal);  
        return new ResponseEntity(HttpStatus.OK);
    }

	
}
