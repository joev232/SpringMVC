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
public class MarianoController {
 
	@RequestMapping("/rajoy")
    public String rajao(){ 
    	return "rajoy";
    			}
    
 
    @RequestMapping("/rajoyi")
    public String rajaoDefecto(HttpServletRequest request,HttpServletResponse response){
    	
    	Locale locale=RequestContextUtils.getLocale(request);
    	System.out.println(locale);
    	
       	
    	RequestContextUtils.getLocaleResolver(request).setLocale(request, response, new Locale("en"));
    	return "rajoyi";
    }
}