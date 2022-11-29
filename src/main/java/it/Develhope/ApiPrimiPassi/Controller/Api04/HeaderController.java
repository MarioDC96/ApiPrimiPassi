package it.Develhope.ApiPrimiPassi.Controller.Api04;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/headers")
public class HeaderController {

    @GetMapping(value = "/getInfo")
    public String getInfo(@RequestHeader HttpHeaders httpHeaders){
        String result = String.valueOf(httpHeaders.get("host"));
        return result;
    }
}
