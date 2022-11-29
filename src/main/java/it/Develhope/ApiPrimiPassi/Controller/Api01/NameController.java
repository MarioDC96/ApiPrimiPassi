package it.Develhope.ApiPrimiPassi.Controller.Api01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController {


    @GetMapping(value = "/getName/{name}")
    public String getName(@PathVariable String name){
        return name;
    }


    @GetMapping(value = "/getReverseName/{name}")
    public StringBuilder getReverseName(@PathVariable String name){
        StringBuilder reverseName = new StringBuilder(name);
        reverseName.reverse();
        return reverseName;
    }

}
