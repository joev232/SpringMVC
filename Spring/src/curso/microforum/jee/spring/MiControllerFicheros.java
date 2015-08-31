package curso.microforum.jee.spring;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
 
/**
 * Clase controller para subir ficheros
 */
@Controller
public class MiControllerFicheros {
 
    /**
     * Usamos este m�todo para subir un fichero
     */
    @RequestMapping(value = "/subirUnFichero", method = RequestMethod.POST)
    @ResponseBody
    public String guardarFichero(@RequestParam("name") String name, @RequestParam("file") MultipartFile file) {
    	String mensaje = null;
    	
    	//String[] name es un array para subir varios ficheros   MultipartFile[]  tambien para array
        if (!file.isEmpty()) { 
            try {
                
            	//byte[] bytes = file.getBytes();
            	byte[] bytes = file.getBytes();
 
                String rootPath = System.getProperty("catalina.home");
                File dir = new File(rootPath + File.separator + "tmpFiles");
                if (!dir.exists())
                {
                	dir.mkdirs();
                }
                    
 
                File serverFile = new File(dir.getAbsolutePath() + File.separator +file.getOriginalFilename());
                
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
                stream.write(bytes);
                stream.close();
 
                System.out.println(serverFile.getAbsolutePath());
 
                mensaje = "Fichero subido guay =" + file.getOriginalFilename();
                //mensaje = "Fichero subido guay =" + name[0];
            } catch (Exception e) {
            	mensaje = "Se ha liado parda " + name + " => " + e.getMessage();
            }
        } else {
        	mensaje = "No me traigas ficheros vac�os ga�an";
        }
        return mensaje;
    }
 
  
}