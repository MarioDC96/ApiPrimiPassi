package it.Develhope.ApiPrimiPassi.Controller.Api03;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/String")
public class StringController {

    @GetMapping(value = "/getString")
    public String getString(@RequestParam(required = true) String mandatory, @RequestParam(required = false)  String optional){
        String concatenation = mandatory + optional;
        if(optional == null){
            concatenation = mandatory;
        }
        return "La Stringa è: " + concatenation;
    }
}
