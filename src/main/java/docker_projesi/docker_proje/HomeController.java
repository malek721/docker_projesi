package docker_projesi.docker_proje;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin
@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "Hello Dunya";
    }
    
}
