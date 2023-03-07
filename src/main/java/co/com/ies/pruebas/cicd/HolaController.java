package co.com.ies.pruebas.cicd;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolaController {

    @GetMapping("/")
    public ResponseEntity<String> hola(){
        return ResponseEntity.ok("Hola");
    }
}
