package com.example.springsecurity;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hola")
    public String holamundo(){ return "hola mundo how are you?"; }

    @GetMapping("/boostrap")
    public String boostrap(){ return "soy una pagina"; }
}


