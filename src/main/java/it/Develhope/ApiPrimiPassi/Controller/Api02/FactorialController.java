package it.Develhope.ApiPrimiPassi.Controller.Api02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factorial")
public class FactorialController {


    @GetMapping(value = "getFactorial/{n}")
    public int getFactorial(@PathVariable int n){
        int i;
        int f=1;

        for(i=1; i<=n; i++) {
            f=f*i;
        }
        return f;
    }
}
